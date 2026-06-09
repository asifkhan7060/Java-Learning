package E_OOPsFourPrinciples.B_Inheritence.B_Implementation.ChildClass;

import E_OOPsFourPrinciples.B_Inheritence.B_Implementation.ParentClass.Vehicle;

// Child Class 1

public class Car extends Vehicle {

    // Property specific to Car class
    private int doors;

    // Constructor
    // Since Vehicle has a parameterized constructor,
    // the Child class must call the Parent constructor
    // using super().

    public Car(String brand, int speed, int doors) {

        // super is used to call the Parent Class constructor.
        // Here brand and speed are passed to Vehicle's constructor.

        // Parent Constructor access
        super(brand, speed); // If parent constructor not available then its shows error!

        this.doors = doors;
    }

/**

 * Why not we use below strategy instead using super?:
 this.brand = brand;
 this.speed = speed;

 Soln:
 Because brand and speed belong to the Parent Class (Vehicle) and are declared as private.
 A Child Class cannot directly access private properties of its Parent Class.

 Therefore, super(brand, speed) is used to call the Parent Class constructor, allowing the Parent Class
 to initialize its own properties.

 */

    /**
     * Method Overriding (Comes under Run Time Polymorphism):
     *
     * The display() method already exists in the Parent Class.
     *
     * By creating the same method in the Child Class,
     * we override the Parent Class implementation and
     * provide our own version.
     */

    @Override
    public void display() {

        /**
         super.display() : Calls the Parent Class display() method.
         This allows us to execute the Parent Class logic before adding Child Class specific functionality.
         */
        super.display();

        /**
         getBrand() and getSpeed() are inherited methods.

         Since brand and speed are private in the Parent Class,they cannot be accessed directly.
         Therefore, Getter methods are used to access them.
         */

        System.out.println(
                "Brand: " + getBrand() +
                        " Speed: " + getSpeed() +
                        " km/hr " +
                        doors + " door "
        );

        /**
         * Output Example:
         *
         * Brand: BMW Speed: 200
         * Brand: BMW Speed: 200 km/hr 4 door
         */
    }
}