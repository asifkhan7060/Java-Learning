package B_OOPs_Principles.D_Polymorphism.RunTimePolymorphism.A_ParentClass;

// Parent Class (Superclass)

/**
 Polymorphism allows the same method name to perform different actions depending on the situation.

 Method Overriding / Run-Time Polymorphism / Dynamic Polymorphism

 Method overriding allows a Child class to provide its own implementation of a method already defined in the Parent class.
 Java determines which overridden method to execute at runtime based on the actual object type.

 1. Same Method Name
 Parent: start()
 Child:  start()

 2. Same Parameters
 Parent: start(int speed)
 Child:  start(int speed)

 3. Inheritance is Required
 Child class must extend the Parent class.
 */

public class Vehicle {

    // Encapsulated Properties
    private String brand;
    private int speed;

    /** Parent Class Constructor
     If the Parent Class has a parameterized constructor, then the Child Class must call it using super(...)
     to initialize the Parent Class properties */

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Getter for Brand
    public String getBrand() {
        return brand;
    }

    // Setter for Brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter for Speed
    public int getSpeed() {
        return speed;
    }

    // Setter for Speed
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Common Behavior
    public void display() {
        System.out.println("Here it is Vehicle");
    }
    public void start(){
        System.out.println("Started");
    }
}