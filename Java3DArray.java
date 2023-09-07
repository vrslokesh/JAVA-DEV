public class Java3DArray {
    public static void main(String[] args) {
        int[][][] a ={{{10,20,30},{40,50},{60,70,80}}};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                for(int k=0;k<a[i][j].length;k++){
                    System.out.println(a[i][j][k] +" ");
                }
                System.out.println("Out of the k loop");
            }
            System.out.println("Out of the J loop");
        }
        System.out.println("a[0][0]" +a[0][0].length);
        System.out.println("a[0][1]" +a[0][1].length);
        System.out.println("a[0][2]" +a[0][2].length);
        System.out.println("a[0][0]" +a[0][0]);
        System.out.println("a[0][1]" +a[0][1]);
        System.out.println("a[0][2]" +a[0][2]);
        System.out.println("a[0][0]" +a[0][0][0]);
        System.out.println("a[0][1]" +a[0][0][1]);
        System.out.println("a[0][2]" +a[0][0][2]);
    }
}
