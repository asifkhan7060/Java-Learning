package E_operators;

/**
 ====================================================
 ASSIGNMENT OPERATORS IN JAVA
 ====================================================

 Study : Assignment Operators (=, +=, -=, *=, /=, %=) in Java

 🔹 What Are Assignment Operators?

 Assignment Operators are used to assign values
 to variables.

 They can also perform an operation and assign
 the result back to the same variable.

 Example:

 int a = 10;

 Here:

 a → Variable
 = → Assignment Operator
 10 → Value Assigned


 ====================================================
 1) Assignment Operator (=)
 ====================================================

 Purpose:
 Assigns a value to a variable.

 Syntax:
 variable = value

 Example:
 int x = 10;

 Output:
 x = 10


 ====================================================
 2) Add and Assign Operator (+=)
 ====================================================

 Purpose:
 Adds a value and assigns the result.

 Syntax:
 variable += value

 Equivalent To:
 variable = variable + value

 Example:
 x += 5;


 ====================================================
 3) Subtract and Assign Operator (-=)
 ====================================================

 Purpose:
 Subtracts a value and assigns the result.

 Syntax:
 variable -= value

 Equivalent To:
 variable = variable - value

 Example:
 x -= 5;


 ====================================================
 4) Multiply and Assign Operator (*=)
 ====================================================

 Purpose:
 Multiplies a value and assigns the result.

 Syntax:
 variable *= value

 Equivalent To:
 variable = variable * value

 Example:
 x *= 5;


 ====================================================
 5) Divide and Assign Operator (/=)
 ====================================================

 Purpose:
 Divides a value and assigns the result.

 Syntax:
 variable /= value

 Equivalent To:
 variable = variable / value

 Example:
 x /= 5;


 ====================================================
 6) Modulus and Assign Operator (%=)
 ====================================================

 Purpose:
 Finds the remainder and assigns the result.

 Syntax:
 variable %= value

 Equivalent To:
 variable = variable % value

 Example:
 x %= 3;

 ====================================================
 Applications of Assignment Operators
 ====================================================

 Used in:

 - Calculations
 - Counters
 - Loops
 - Score Tracking
 - Updating Variables

 */

public class E_AssignmentOperators {

    public static void main(String[] args) {

        int x = 10;

        // Assignment
        x = 10;
        System.out.println("Assignment (=) : " + x);

        // Add and Assign
        x += 5;
        System.out.println("Add and Assign (+=) : " + x);

        // Subtract and Assign
        x -= 3;
        System.out.println("Subtract and Assign (-=) : " + x);

        // Multiply and Assign
        x *= 2;
        System.out.println("Multiply and Assign (*=) : " + x);

        // Divide and Assign
        x /= 4;
        System.out.println("Divide and Assign (/=) : " + x);

        // Modulus and Assign
        x %= 3;
        System.out.println("Modulus and Assign (%=) : " + x);
    }
}