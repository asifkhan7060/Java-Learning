package D_RecordsAsModernUpdate;

/*
 * Topic: Records (Modern Java)
 * Detailed Explanation:
 * Records are a concise way to define immutable data carrier classes introduced in Java 14+.
 * They automatically provide:
 *  - a compact canonical constructor
 *  - accessors for each component (methods named after the components)
 *  - implementations of equals(), hashCode(), and toString()
 *
 * Characteristics and best practices:
 * - Records are ideal for simple immutable data holders (DTOs, keys, value objects).
 * - Components are implicitly final; you cannot reassign them after construction.
 * - Records reduce boilerplate compared to plain classes with private fields, constructors,
 *   getters, equals/hashCode and toString methods.
 * - For custom validation or derived fields, declare a compact constructor or explicit methods.
 *
 * Example mapping in this file:
 * - 'record Bike(String Brand, String Color, int Price) {}' creates an immutable Bike type.
 * - Accessors generated: bike.Brand(), bike.Color(), bike.Price().
 *
 * Revision tips:
 * - Try replacing a small data class with a record to see how much boilerplate disappears.
 * - Use records for immutable snapshots; if mutability is needed, keep using regular classes.
 */

record Bike(String Brand,String Color,int Price){}

public class Record {
    // main: create an immutable Bike record and print its components using generated accessors
    public static void main() {
        Bike bike = new Bike("Yamaha","Mat Black",2400000);
        System.out.println("Bike Details:\n"+"Brand: "+ bike.Brand()+"\nColor: "+bike.Color()+"\nPrice: "+bike.Price());
    }


}