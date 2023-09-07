import java.util.Scanner;

public class JavaSwapProgram03 {
    public static void main(String[] args) {
        JavaSwapProgram03 var1 = new JavaSwapProgram03();
        var1.withThirdVariable(10,20);
        var1.withoutThirdVariable(30,40);


    }
    public static int withThirdVariable(int a, int b){
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Two Numbers");
        a = sc.nextInt();
        b = sc.nextInt();*/
        if(a>0 && b>0){
            int temp;
            temp =a;
            a=b;
            b=temp;
            System.out.println("The value of a:" +a +"The value of b:" +b);
        }
        else{
            System.out.println("Please Enter a Positive number");
        }
        return a;

    }
    public static int withoutThirdVariable(int k,int p){
        if(k>0 && p>0){
            k=k+p;//k=30 where k=10 p=20
            p=k-p;//p=10 where k=30 p=10
            k=k-p;
            System.out.println("The value of k:" +k +"The value of p:" +p);
        }
        else{
            System.out.println("Please Enter a Positive number");
        }
        return k;

    }
}

