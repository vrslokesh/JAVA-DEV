public class Java2DArray01 {
    public static void main(String[] args) {
        //Declaring 2D Array
        int[][] a;//most used practice
        int[][] b,c;//p-2D ,b- 2D
        int[] d[],e;//d-2D , e-1D
        int[] f[],g[];//f-2D g-2D
        int[][] h,k[];//h-2D k-3D
        //int[][] l,[]m; l- 2D Array and m throws error

        //Creation of 2D array
        a= new int[2][3];//Matrix representation

        a[0][1]=20;
        int[][] p={{10,20,30},{40,50,60},{70,80,90}};//2D Array defined
        a=new int[2][];//Jagged Array
        a[0]=new int[3];
        a[1]=new int[4];


        //Intialization of 2D Arrays
        int[][] t=new int[1][2];

        /*t[0][0]=10;
        t[0][1]=20;
        t[0][2]=30;
        t[1][0]=40;
        t[1][1]=50;
        t[1][2]=60;*/

        int[][] z={{10,20,30},{40,50},{60,70,80}};
        for(int i =0; i<z.length;i++){
            for(int j =0; j<z[i].length;j++){
                System.out.println(z[i][j] + " ");

            }
            System.out.println("  ");
        }
        System.out.println("Hi: "+ z);
        System.out.println("Hi: "+ z[0][0]);
        System.out.println("Hi: "+ z[0]);









    }
}
