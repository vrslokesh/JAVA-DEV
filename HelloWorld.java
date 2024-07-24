class HelloWorld {
    public static void main(String[] args) {
        int a= 356828272;// 4 bytes
        short sh = 12346;//2 bytes
        long lg =356828272;// 4 bytes
        float f = 12.3f;// default is always double if float needed keep 'f' at last
        double d =98474.92;
        char ch ='k';//Character literal allows only single character;
        boolean b = false;


        //+ operator is used to string concatination
        System.out.println("All values as below " +a +"\n" +sh +"\n" +lg +"\n" +f +"\n" +d +"\n"+ch +"\n"+b);
        System.out.println(a);
        System.out.println(sh);

    }
}
