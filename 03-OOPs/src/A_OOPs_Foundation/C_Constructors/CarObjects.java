package A_OOPs_Foundation.C_Constructors;

/**
 NOTE :-
 Without a Constructor, instance variables must be initialized manually after object creation.

 CarClassConstructor car1 = new CarClassConstructor(); (default constructor is in use)

 If values are not assigned, Java uses default values:
 String -> null
 int    -> 0

 Therefore, for :
 car1.drive();

 Output:
 null is driving at 0
 */

public class CarObjects {
    public static void main() {

        // Creating and instantiating an object
        CarClassConstructor car1 = new CarClassConstructor("Red","BMW",100); //If constructor is created then it is necessary to give parameter else gives error

        // OR
        /**
        CarClassConstructor car1;  //Creating
        car1 = new CarClassConstructor(); //instantiating */

        car1.drive(); // Prints : BMW is driving at 100

        // Single parameter constructor
        CarClassConstructor car2 = new CarClassConstructor("Audi");
        car2.drive();

        // Double parameter constructor
        CarClassConstructor car3 = new CarClassConstructor(200,"Black");
        car3.drive();

        /**
         * Suppose we called Single parameter Constructor -> Ex: CarClassConstructor car2 = new CarClassConstructor("BMW");
         * and we didn't create a Single parameter Constructor in main class file then error shows as "(actual and formal argument lists differ in length)"
         */

    }
}