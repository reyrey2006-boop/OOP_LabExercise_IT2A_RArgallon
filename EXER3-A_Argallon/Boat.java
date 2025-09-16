// File: Boat.java
public class Boat extends WaterTransport {
public Boat(String name, int capacity, double maxSpeed, double displacement) {
super(name, capacity, maxSpeed, displacement);
}


@Override
public void move() {
System.out.println(name + " is sailing on calm waters.");
}
}