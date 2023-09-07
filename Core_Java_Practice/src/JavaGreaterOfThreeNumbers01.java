import java.util.Scanner;

public class JavaGreaterOfThreeNumbers01 {
    public static void main(String[] args) {
        System.out.println("Please enter three numbers");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if(a>b && a>c){
            System.out.println(+a +"is greater among all numbers");
        }
        else if (b>a && b>c) {
            System.out.println(+b +"is greater among all numbers");
        }
        else{
            System.out.println(+c +"is greater among all numbers");
        }

    }
}
