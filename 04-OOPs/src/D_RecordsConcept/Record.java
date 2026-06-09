package D_RecordsConcept;

/**
 * ====================================================
               RECORDS IN JAVA
 * ====================================================

 🔹 What is a Record?

  A Record is a special type of class introduced in modern Java to store data with less code.
  It is mainly used when an object only needs to hold data and does not require many methods.

 🔹 Problem with Normal Class

 For a simple Bike class, we usually need:
 * • Properties
 * • Constructor
 * • Getters
 * • toString()
 * • equals()
 * • hashCode()

 This creates a lot of boilerplate code.

 Solution: Record

 Record automatically creates:
 * • Constructor
 * • Getter-like methods
 * • toString()
 * • equals()
 * • hashCode()

 Therefore, less code is required.

 * Syntax:

 record RecordName(type variable1,
                    type variable2,
                    ...)

 * Example:

 record Bike(String Brand,
              String Color,
              int Price) {
  }

 * Creating Object

  Bike bike =
       new Bike("Yamaha",
                "Mat Black",
                2400000);

 * Accessing Values

 * bike.Brand();
 * bike.Color();
 * bike.Price();

 * Note: Records do not use traditional getters.

 * Instead of: bike.getBrand(); We use: bike.Brand();

 * Important Point
 Record objects are immutable.

 * Immutable means:
 Once values are assigned during object creation,they cannot be changed later.

 * Example:

  Bike bike =
       new Bike("Yamaha",
                "Black",
                2400000);

  bike.Brand = "Honda"; // Not Allowed

 * When to Use Records?

 Use Records when:
  • You only need to store data.
  • Values should not change.
  • You want less code.
 */

record Bike(String Brand, String Color, int Price) {}

public class Record {

    public static void main() {

        // Creating a Record Object
        Bike bike = new Bike(
                "Yamaha",
                "Mat Black",
                2400000
        );

        // Accessing Record Components
        System.out.println("Bike Details:");

        System.out.println("Brand : " + bike.Brand());

        System.out.println("Color : " + bike.Color());

        System.out.println("Price : " + bike.Price());

        // Records are immutable
        // Values cannot be modified after object creation
    }
}