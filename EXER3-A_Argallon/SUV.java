// File: SUV.java
public class SUV extends LandTransport {
public SUV(String name, int capacity, double maxSpeed, int wheels) {
super(name, capacity, maxSpeed, wheels);
}


@Override
public void move() {
System.out.println(name + " is transporting passengers comfortably.");
}
}