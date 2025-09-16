// File: AirTransport.java
public abstract class AirTransport extends Transportation {
protected double altitudeLimit; // meters


public AirTransport(String name, int capacity, double maxSpeed, double altitudeLimit) {
super(name, capacity, maxSpeed);
this.altitudeLimit = altitudeLimit;
}


@Override
public void displayInfo() {
super.displayInfo();
System.out.println("Altitude Limit: " + altitudeLimit + " m");
}
}