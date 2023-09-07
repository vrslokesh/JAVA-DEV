import java.util.Scanner;

public class JavaScannerClass01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===Welcome To JAVA===");
        System.out.println("Enter your name:");
        String name = sc.next();
        System.out.println("Enter your gender:");
        char gender = sc.next().charAt(0);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Enter your Email:");
        String email = sc.next();
        System.out.println("Thankyou your details are "
                    + "Name: " +name +"  Gender: " +gender
                    +"   Age: " +age +"    Email: " +email);
    }
    
}
