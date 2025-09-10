public class Car {
    private String color;
    private String plateNo;
    private String chassisNo;
    private String brand;
    private String model;

    public Car(String color, String plateNo, String chassisNo, String brand, String model) {
        this.color = color;
        this.plateNo = plateNo;
        this.chassisNo = chassisNo;
        this.brand = brand;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Color     : " + color);
        System.out.println("Plate No  : " + plateNo);
        System.out.println("Chassis No: " + chassisNo);
        System.out.println("Brand     : " + brand);
        System.out.println("Model     : " + model);
    }
}