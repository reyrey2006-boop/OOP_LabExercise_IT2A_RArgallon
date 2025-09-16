// File: TransportationTester.java
public class TransportationTester {
public static void main(String[] args) {
Transportation[] fleet = new Transportation[] {
new Helicopter("Helo-1", 6, 250, 5000),
new Airplane("Airbus A320", 180, 900, 12000),
new SpaceShuttle("Orbiter", 7, 28000, 100000),
new Truck("CargoTruck", 2, 120, 6),
new SUV("FamilySUV", 7, 180, 4),
new Tricycle("Trike", 3, 60, 3),
new Motorcycle("Moto", 2, 160, 2),
new Kariton("Kariton", 1, 10, 2),
new Boat("Bangka", 10, 30, 2.5),
new Ship("Ferry", 300, 40, 5000)
};


for (Transportation t : fleet) {
System.out.println("---");
t.displayInfo();
t.start();
t.move();
t.stop();
}
}
}