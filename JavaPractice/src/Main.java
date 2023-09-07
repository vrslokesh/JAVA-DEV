public class Main {
    public static void main(String[] args) {
         Car car = new Car();
         car.describeCar();
         Car obj2 =new Car();
        /* obj2.make = "Hundayi";*/
        System.out.println("Make:" +obj2.getMake());
        System.out.println("Make:" +obj2.getModel());
        obj2.getMake();
        obj2.getModel();
        obj2.getDoors();
        obj2.isConvertible();

         /*car*/
    }
}