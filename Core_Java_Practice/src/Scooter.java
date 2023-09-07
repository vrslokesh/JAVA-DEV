public class Scooter extends Vehicle{

    void start(){
        System.out.println("Starts with Key");
    }

    public static void main(String[] args) {
        Scooter c = new Scooter();
        c.start();
    }


}
