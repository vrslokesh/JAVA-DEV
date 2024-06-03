import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        System.out.println("Please Enter your Name");
        Scanner ob1 = new Scanner(System.in);
        System.out.println("Please Enter your Age");
        Scanner ob2 = new Scanner(System.in);
        String Name = ob1.nextLine();
        int Age = ob2.nextInt();
        //if Loop Execution
        if (Age >= 18) {
            System.out.println("You are Eligible to Vote " + Name);

        } else if (Age <= 0) {
            System.out.println("Age Entered is invalid:" +Name);
        }
        else {
            System.out.println("You are not eligible to vote.");

        }

    }
}
