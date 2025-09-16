// File: Motorcycle.java
public class Motorcycle extends LandTransport {
public Motorcycle(String name, int capacity, double maxSpeed, int wheels) {
super(name, capacity, maxSpeed, wheels);
}


@Override
public void move() {
System.out.println(name + " is zipping through traffic.");
}
}