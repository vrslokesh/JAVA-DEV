/*
Static method dont need to create objects They can directly being called by class name
*/
public class JavaStatic {
    public static void main(String[] args) {
        JavaStatic.sum(new int[]{10,20,30});
    }
    //Here we are printing Anonymous Array
    static void sum(int[] no){
        int total =0;
        for (int i :no) {
            total = total+i;
        }
        System.out.println("Total Value is" +total);
    }
}
