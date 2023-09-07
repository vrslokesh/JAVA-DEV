public class StarPatreen01 {
    public static void main(String[] args) {
        pattreen2(4);
        pattreen3(5);
        pattreen1(4);
        pattreen4(5);
        pattreen5(5);
        pattreen6(10);
        pattreen7(5);
    }

    static void pattreen1(int n) {
        for (int row = 0; row <= n; row++) {
            for (int col = n; col >= row; col--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattreen2(int n) {
        for (int row = 0; row <= 5; row++) {
            for (int col = 0; col <= 5; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattreen3(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattreen4(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }

    static void pattreen5(int n) {
        int row = 1;
        if (row <= n) {
            for (row = 1; row <= (2 * n) - 1; row++) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

    static void pattreen6(int n) {
        for (int row = 1; row <= (2 * n) - 1; row++) {
            //Very important to remember the ternary operator can used to the variable as well
            int totalNoOfStars = row > n ?(2*n)-row:row;
            for (int col = 1; col <= totalNoOfStars; col++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                }
    static void pattreen7(int n) {
        for (int row = 1; row <=n; row++) {
            //Very important to remember the ternary operator can used to the variable as well
            /*int totalNoOfStars = row > n ?(2*n)-row:row;*/
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


