public class JavaArray01 {
    public static void main(String[] args) {
        //Array collection of homogenous datatypes and Object is the super class of Array class

        int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9};//Array intialization

        char[] f={'I','S','R','O'};
         for(int i=0;i<f.length;i++){
             System.out.println("Hi i am for Loop:" +f[i]);
         }

        for(int i=0;i<intArray.length;i++){
            System.out.println("Hi i am for Loop:" +intArray[i]);
        }

        /*for (int i:f) {
            System.out.println("Hi i am forEach Loop:" +f[i]);
        }
*/
        //1-D Array
        String[] str;//Declaration no size to be mentioned
        str = new String[10];//Creation time the array size should be mentioned
        str[0] ="Lokesh";

        //Difference between the various notaions
        int[] p,q;//p and q are arrays
        int  []r,s;//r and s are arrays
        int t[],u;//t is array but u is not array







    }
}
