// File: Ship.java
public class Ship extends WaterTransport {
public Ship(String name, int capacity, double maxSpeed, double displacement) {
super(name, capacity, maxSpeed, displacement);
}


@Override
public void move() {
System.out.println(name + " is carrying many passengers or cargo across seas.");
}
}