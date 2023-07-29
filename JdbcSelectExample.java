/*public class JDBC {
}*/

import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.ResultSet;
        import java.sql.SQLException;
        import java.sql.Statement;

public class JdbcSelectExample {
    public static void main(String[] args) {
        // Database connection properties
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "your_username";
        String password = "your_password";

        // SQL SELECT query
        String sqlQuery = "SELECT * FROM employees";

        try {
            // Step 1: Load and register the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish the connection to the database
            Connection connection = DriverManager.getConnection(url, username, password);

            // Step 3: Create a Statement object to execute the query
            Statement statement = connection.createStatement();

            // Step 4: Execute the query and get the result set
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            // Step 5: Process the result set
            while (resultSet.next()) {
                // Assuming 'employees' table has 'id', 'name', and 'age' columns
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");

                // Do something with the retrieved data
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }

            // Step 6: Close the resources
            resultSet.close();
            statement.close();
            connection.close();

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQL Exception occurred!");
            e.printStackTrace();
        }
    }
}
