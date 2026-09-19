package E_OOPsFourPrinciples.C_Polymorphism.RunTimePolyOverRiding.ChildClass;

// Child Class 1

import E_OOPsFourPrinciples.C_Polymorphism.RunTimePolyOverRiding.ParentClass.Vehicle;

public class Car extends Vehicle {

    // Property specific to Car class
    private int doors;

    public Car(String brand, int speed, int doors) {

        // Parent Constructor access
        super(brand, speed);    // super is used to call the Parent Class constructor.
        this.doors = doors;
    }


    /**
     Method Overriding (Comes under Run Time Polymorphism):

     The display() method already exists in the Parent Class.

     By creating the same method in the Child Class,we override the Parent Class implementation and
     provide our own version.
     */

    @Override //Annotation (Not compulsory but Used for code Readability)
    public void display() {

        /**
         super.display() : Calls the Parent Class display() method.
         This allows us to execute the Parent Class logic
         */
        super.display();

        /**
         getBrand() and getSpeed() are inherited methods.

         Since brand and speed are private in the Parent Class,they cannot be accessed directly.
         Therefore, Getter methods are used to access them ( getSpeed() , getBrand() )
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