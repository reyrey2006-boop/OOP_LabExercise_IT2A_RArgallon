// File: Tricycle.java
public class Tricycle extends LandTransport {
public Tricycle(String name, int capacity, double maxSpeed, int wheels) {
super(name, capacity, maxSpeed, wheels);
}


@Override
public void move() {
System.out.println(name + " is making short local trips in the barangay.");
}
}