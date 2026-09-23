package E_OOPsFourPrinciples.B_Inheritence.Implementation.Hierarchical_Inheritance.B_ChildClass;

import E_OOPsFourPrinciples.B_Inheritence.Implementation.Hierarchical_Inheritance.A_ParentClass.Vehicle;

// Child Class 1

public class A_Car extends Vehicle {

    // Property specific to Car class
    private final int doors;

    // Child Constructor
    public A_Car(String brand, int speed, int doors) {

        // Vehicle has a parameterized constructor, so Child must call it using super().
        // super(...) calls the Parent constructor and is required for constructor initialization,
        // regardless of whether Parent variables are public or private.

        /**
         We cannot use:
         this.brand = brand;
         this.speed = speed;

         because these belong to the Parent class.
         super(brand, speed) lets the Parent initialize its own variables.
         */

        super(brand, speed); // If parent constructor not available then its shows error!

        this.doors = doors;
    }

    /**
     Method Overriding (Comes under Run Time Polymorphism):

     The display() method already exists in the Parent Class.
     By creating the same method in the Child Class, we override the Parent Class implementation and provide our own version.
     */

    @Override
    public void display() {

        // Child class-specific display method
        System.out.println("Here it is Car with brand: " + getBrand() + ", speed: " + getSpeed() + " and doors: " + doors);

        // What if we need to print Parent display method
        super.display(); // Output : Here it is Vehicle

        /**
         super.display() : It Calls the Parent Class display() method.
         This allows us to execute the Parent Class logic before adding Child Class specific functionality.
         */

        // NOTE : If the parent method is private, the child class cannot access, inherit, or override that method.
    }
}