public class MyProjectRoot {
    public static void main(String args[]){
        //Variable assesment
        int myInputNumber = 15;
        myInputNumber = 150;
        myInputNumber = (10*2) +(5*2);
        int mySecondNumber = 12;
        int myThirdNumber = 16;
        int myTotal = myInputNumber + mySecondNumber + myThirdNumber;

        int myLastOne = 1000;
        System.out.println("myLastOne:" +myLastOne);

        System.out.println(myTotal);//o/p 15
        System.out.println("myTotal");//O/P myInputNumber



        /*for (int i=0;i<10;i++){
            System.out.println("Hello,Lokesh..!");
        }*/
        System.out.println(Byte.SIZE);
        System.out.println(Integer.SIZE);
        System.out.println(Float.SIZE);
        System.out.println(Double.SIZE);
        System.out.println(Long.MIN_VALUE );


        System.out.println( +Integer.MIN_VALUE + "to" +Integer.MAX_VALUE);
        System.out.println( +Byte.MIN_VALUE + "to" +Byte.MAX_VALUE);//Try to give as"byte and try it "

        /*JAVA Casting Example Exercise*/
        int myMaxIntValue = 10000 , myMinIntValue = 7000;
        byte myByteVariable = (byte)(myMaxIntValue/10);
        System.out.println("The max value is:" +myMaxIntValue);
        System.out.println("The min value is:" +myMinIntValue );
        System.out.println("The type casted value is:" +myByteVariable);
        /*System.out.println(+myByteVariable.getClass());*/

/*
        String as a variable can be reused
*/
        String myNewString = "Hi Lokesh..!";
        String myNewString2 = myNewString +"How was your day...!";//Here we are reusing the variable again
        System.out.println(myNewString2);

        int myInt = 10;
        String myString ="50";

        String myStr = myInt + myString;
        System.out.println("String concatination:" +myStr);

        double myDouble = 120.47;
        System.out.println( "The value of double is :" +myDouble + myString);

        String name="Lokesh";
        System.out.println( "The value of double is :" + name);
        name.concat("Kumar");
        System.out.println( "The value of double is :" + name);

        StringBuilder name1=new StringBuilder("Lokesh");
        System.out.println( "The value of double is :" + name);
        name1.append("Kumar");
        System.out.println( "The value of double is :" + name);

        String name2="Lokesh";//
        System.out.println( "The value of double is :" + name);
        String vrble = name2.concat("123");

        System.out.println( "The value of double is :" + vrble);







    }
}
