// File: Airplane.java
public class Airplane extends AirTransport {
public Airplane(String name, int capacity, double maxSpeed, double altitudeLimit) {
super(name, capacity, maxSpeed, altitudeLimit);
}


@Override
public void move() {
System.out.println(name + " is cruising through the air.");
}
}