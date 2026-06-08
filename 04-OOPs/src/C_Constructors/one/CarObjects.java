package C_Constructors.one;

// Objects are the instances of Class
// Ex : Creating a Car instances

// NOTE : Objects class contains entry point (main function)

public class CarObjects {
    public static void main() {

/**
 * Without a constructor, instance variables must be initialized manually after object creation.

 * CarClassConstructor car1 = new CarClassConstructor(); (default constructor is in use)

 * If values are not assigned, Java uses default values:
 * String -> null
 * int    -> 0

 * Therefore, for :
 * car1.drive();

 * Output:
 * null is driving at 0
 */

        // Creating and instantiating an object
        CarClassConstructor car1 = new CarClassConstructor("Red","BMW",100); //If constructor is created then it is necessary to give parameter else gives error

        /**  or
        CarClassConstructor car1;  //Creating
        car1 = new CarClassConstructor(); //instantiating I*/

        car1.drive(); // Prints : BMW is driving at 100

        // Single parameter constructor
        CarClassConstructor car2 = new CarClassConstructor("BMW");
        car2.drive();

        // Double parameter constructor
        CarClassConstructor car3 = new CarClassConstructor(200,"BMW");
        car3.drive();

        /**
         * Suppose we called Single parameter Constructor -> Ex: CarClassConstructor car2 = new CarClassConstructor("BMW");
         * and we didn't create a Single parameter Constructor in main class file then error shows as "(actual and formal argument lists differ in length)"
         */

    }
}