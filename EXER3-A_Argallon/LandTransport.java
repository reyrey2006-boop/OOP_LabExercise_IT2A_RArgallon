// File: LandTransport.java
public abstract class LandTransport extends Transportation {
protected int wheels;


public LandTransport(String name, int capacity, double maxSpeed, int wheels) {
super(name, capacity, maxSpeed);
this.wheels = wheels;
}


@Override
public void displayInfo() {
super.displayInfo();
System.out.println("Wheels: " + wheels);
}
}