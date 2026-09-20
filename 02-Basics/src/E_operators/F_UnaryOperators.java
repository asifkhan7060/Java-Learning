package E_operators;

/**
 ====================================================
 UNARY OPERATORS IN JAVA
 ====================================================

 Study : Unary Operators (+, -, ++, --, !) in Java

 🔹 What Are Unary Operators?

 Unary Operators are operators that work on only
 one operand (single value or variable).

 Example:

 int a = 10;

 Here:

 ++a → Unary Operation
 a → Operand


 ====================================================
 1) Unary Plus Operator (+)
 ====================================================

 Purpose:
 Indicates a positive value.

 Syntax:
 +operand

 Example:
 +10

 Output:
 10


 ====================================================
 2) Unary Minus Operator (-)
 ====================================================

 Purpose:
 Converts a positive value into a negative value.

 Syntax:
 -operand

 Example:
 -10

 Output:
 -10


 ====================================================
 3) Increment Operator (++)
 ====================================================

 Purpose:
 Increases the value by 1.

 Syntax:
 ++variable
 variable++

 Example:

 int x = 5;
 x++;

 Output:
 6


 ====================================================
 Pre-Increment (++x)
 ====================================================

 Purpose:
 First increments the value,
 then uses it.

 Example:

 int x = 5;
 System.out.println(++x);

 Output:
 6


 ====================================================
 Post-Increment (x++)
 ====================================================

 Purpose:
 First uses the value,
 then increments it.

 Example:

 int x = 5;
 System.out.println(x++);

 Output:
 5

 Final Value of x:
 6


 ====================================================
 4) Decrement Operator (--)
 ====================================================

 Purpose:
 Decreases the value by 1.

 Syntax:
 --variable
 variable--

 Example:

 int x = 5;
 x--;

 Output:
 4


 ====================================================
 Pre-Decrement (--x)
 ====================================================

 Purpose:
 First decreases the value,
 then uses it.

 Example:

 int x = 5;
 System.out.println(--x);

 Output:
 4


 ====================================================
 Post-Decrement (x--)
 ====================================================

 Purpose:
 First uses the value,
 then decreases it.

 Example:

 int x = 5;
 System.out.println(x--);

 Output:
 5

 Final Value of x:
 4


 ====================================================
 5) Logical NOT Operator (!)
 ====================================================

 Purpose:
 Reverses a boolean value.

 Syntax:
 !condition

 Example:
 !true

 Output:
 false

 ====================================================
 Applications of Unary Operators
 ====================================================

 Used in:

 - Counters
 - Loops
 - Boolean Reversal
 - Mathematical Operations
 - Variable Updates

 */

public class F_UnaryOperators {

    public static void main(String[] args) {

        int x = 5;

        // Unary Plus
        System.out.println("Unary Plus (+x) = " + (+x));

        // Unary Minus
        System.out.println("Unary Minus (-x) = " + (-x));

        // Pre Increment
        System.out.println("Pre Increment (++x) = " + (++x));

        // Reset Value
        x = 5;

        // Post Increment
        System.out.println("Post Increment (x++) = " + (x++));
        System.out.println("Value After Post Increment = " + x);

        // Reset Value
        x = 5;

        // Pre Decrement
        System.out.println("Pre Decrement (--x) = " + (--x));

        // Reset Value
        x = 5;

        // Post Decrement
        System.out.println("Post Decrement (x--) = " + (x--));
        System.out.println("Value After Post Decrement = " + x);

        // Logical NOT
        boolean isActive = true;
        System.out.println("Logical NOT (!true) = " + (!isActive));
    }
}