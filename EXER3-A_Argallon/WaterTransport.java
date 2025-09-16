// File: WaterTransport.java
public abstract class WaterTransport extends Transportation {
protected double displacement; // tonnes


public WaterTransport(String name, int capacity, double maxSpeed, double displacement) {
super(name, capacity, maxSpeed);
this.displacement = displacement;
}


@Override
public void displayInfo() {
super.displayInfo();
System.out.println("Displacement: " + displacement + " tonnes");
}
}