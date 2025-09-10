public class CarTester {
    public static void main(String[] args) {
        Car[] cars = new Car[10];

        String[] colors = {"Red","Blue","Black","White","Silver","Green","Yellow","Gray","Maroon","Brown"};
        String[] brands = {"Toyota","Honda","Mitsubishi","Ford","Nissan","Hyundai","Kia","Suzuki","Chevrolet","Mazda"};
        String[] models = {"Vios","Civic","Lancer","Ranger","Altima","Elantra","Sportage","Swift","Cruze","3"};

        for (int i = 0; i < cars.length; i++) {
            String plate = "PLT" + String.format("%04d", i + 1);   // PLT0001 ...
            String chassis = "CH" + String.format("%04d", i + 1); // CH0001 ...
            cars[i] = new Car(colors[i], plate, chassis, brands[i], models[i]);
        }

        for (int i = 0; i < cars.length; i++) {
            System.out.println("=== Car #" + (i + 1) + " ===");
            cars[i].displayInfo();
            System.out.println();
        }
    }
}