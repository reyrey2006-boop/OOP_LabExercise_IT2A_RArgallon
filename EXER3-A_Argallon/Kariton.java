// File: Kariton.java
public class Kariton extends LandTransport {
public Kariton(String name, int capacity, double maxSpeed, int wheels) {
super(name, capacity, maxSpeed, wheels);
}


@Override
public void move() {
System.out.println(name + " is pushed/pulled for local goods transport.");
}
}