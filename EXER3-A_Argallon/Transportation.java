// File: Transportation.java
public abstract class Transportation {
protected String name;
protected int capacity; // how many passengers
protected double maxSpeed; // km/h


public Transportation(String name, int capacity, double maxSpeed) {
this.name = name;
this.capacity = capacity;
this.maxSpeed = maxSpeed;
}


public void start() {
System.out.println(name + " starting...");
}


public void stop() {
System.out.println(name + " stopping...");
}


public abstract void move();


public void displayInfo() {
System.out.println("Name: " + name);
System.out.println("Capacity: " + capacity);
System.out.println("Max Speed: " + maxSpeed + " km/h");
}
}