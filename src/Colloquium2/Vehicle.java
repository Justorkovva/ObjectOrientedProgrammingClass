package Colloquium2;

public abstract class Vehicle {
private String name;
public String getName() {return name;}
public void setName(String name) { this.name = name; }
public abstract void move();
}