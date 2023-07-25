//import java.util.*;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(+convertToCentimeters(5,8));
        System.out.println(+convertToCentimeters(68));
    }
    //Method overloading
    public static double convertToCentimeters(int inches){
        return 2.54 * inches;//


    }
    public static double convertToCentimeters(int feet, int inches){
        //conversion of feet to inches
        int i  = 12 * feet;
        return (convertToCentimeters(i) + inches);

        //Test comments

        //invoking the

    }


}
