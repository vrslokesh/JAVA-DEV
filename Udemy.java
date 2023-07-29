public class Udemy {
    public static void main(String[] args) {

        /* for public static void main shortcut is psvm*/
        boolean myVariable = true;

        if (myVariable == true) {
            System.out.println("Hi How are you !!");
        }
        String makeOfCar = "DUSTER";
        boolean myCarChecker = makeOfCar == "DUSTER" ? true : false; /*Please note here the case matters Duster is different from DUSTER if checks for case as well*/
        if (myCarChecker) {
            System.out.println("This car is imported to our country");
        }

    }
}
