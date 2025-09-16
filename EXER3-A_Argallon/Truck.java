// File: Truck.java
public class Truck extends LandTransport {
public Truck(String name, int capacity, double maxSpeed, int wheels) {
super(name, capacity, maxSpeed, wheels);
}


@Override
public void move() {
System.out.println(name + " is hauling cargo on the road.");
}
}