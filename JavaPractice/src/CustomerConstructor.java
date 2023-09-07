public class CustomerConstructor {
    private String name;
    private String emailAddress;
    private double creditLimit;

    public CustomerConstructor(String name,String emailAddress ,double creditLimit)
    {

        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit=creditLimit;
    }
    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getName() {
        return name;
    }
}


