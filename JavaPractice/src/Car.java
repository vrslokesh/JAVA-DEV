public class Car {
    private String make = "Tata";
    private String model = "HEXA";
    private int doors = 6;
    private boolean convertible = true;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void describeCar() {
        System.out.println("No of Doors: " + doors +" Doors" +
                 " Make model:" + make +
                 " Model:" + model +
                 " converted:" + convertible);

    }
}
