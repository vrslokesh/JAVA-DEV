import java.util.*;

public class Method {
    public static int calculateScore(int a,int b){
        int sum, diff, div, mul, rem;
        sum = a + b;
        diff = a - b;
        mul = a * b;
        div = a / b;
        rem = a % b;
        System.out.println(+sum);
        System.out.println(+diff);
        System.out.println(+mul);
        System.out.println(+div);
        System.out.println (+rem);
        return sum;

    }
    public static void main(String[] args) {
        System.out.println("Hi How are you...!");
        calculateScore(10,20);
        System.out.println("Yes function got executed");
        System.out.println("The value is "+ calcualteHighScorePosition(1500));
    }
    public static int calcualteHighScorePosition(int score){
        if (score >= 1000){
            return 1;
        }
        else if (score>=500 && score<=1000) {
            return 2;
        }
        else if (score>=100 && score<=500) {
            return 3;
        }
        else{
            return 4;
        }

    }
}
