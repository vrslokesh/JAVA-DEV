public class MainCustomerConstructor {

    public static void main(String[] args) {


        CustomerConstructor C1 = new CustomerConstructor("Lokesh","vrslokesh123@gmail.com",50000 );
        System.out.println("Name of the  customer:" + C1.getName());
        System.out.println("Email of the Customer is :" + C1.getEmailAddress());
        System.out.println("Credit card limit of the Customer:" + C1.getCreditLimit());

}
}
