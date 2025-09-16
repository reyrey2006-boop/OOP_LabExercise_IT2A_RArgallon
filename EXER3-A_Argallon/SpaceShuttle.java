// File: SpaceShuttle.java
public class SpaceShuttle extends AirTransport {
public SpaceShuttle(String name, int capacity, double maxSpeed, double altitudeLimit) {
super(name, capacity, maxSpeed, altitudeLimit);
}


@Override
public void move() {
System.out.println(name + " is launching into space (beyond atmosphere).");
}
}