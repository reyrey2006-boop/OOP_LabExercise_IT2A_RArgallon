// File: Helicopter.java
public class Helicopter extends AirTransport {
public Helicopter(String name, int capacity, double maxSpeed, double altitudeLimit) {
super(name, capacity, maxSpeed, altitudeLimit);
}


@Override
public void move() {
System.out.println(name + " is hovering and flying vertically.");
}
}