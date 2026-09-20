package E_operators;

/**
 ====================================================
 ARITHMETIC OPERATORS IN JAVA
 ====================================================

 Study : Arithmetic Operators (+, -, *, /, %) in Java

 🔹 What Are Arithmetic Operators?

 Arithmetic Operators are used to perform mathematical
 calculations on numeric values.

 Example:

 int a = 10;
 int b = 5;

 Here:

 a and b → Operands
 + → Operator


 ====================================================
 1) Addition Operator (+)
 ====================================================

 Purpose:
 Used to add two values.

 Syntax:
 operand1 + operand2

 Example:
 int result = 10 + 5;

 Output:
 15


 ====================================================
 2) Subtraction Operator (-)
 ====================================================

 Purpose:
 Used to subtract one value from another.

 Syntax:
 operand1 - operand2

 Example:
 int result = 10 - 5;

 Output:
 5


 ====================================================
 3) Multiplication Operator (*)
 ====================================================

 Purpose:
 Used to multiply two values.

 Syntax:
 operand1 * operand2

 Example:
 int result = 10 * 5;

 Output:
 50


 ====================================================
 4) Division Operator (/)
 ====================================================

 Purpose:
 Used to divide one value by another.

 Syntax:
 operand1 / operand2

 Example:
 int result = 10 / 5;

 Output:
 2

 Important Note:

 When both operands are integers,
 Java performs Integer Division.

 Example:

 int result = 10 / 3;

 Output:
 3

 The decimal part (0.333...) is discarded.

 To obtain decimal output:

 double result = (double) 10 / 3;

 Output:
 3.3333333333333335


 ====================================================
 5) Modulus Operator (%)
 ====================================================

 Purpose:
 Returns the remainder after division.

 Syntax:
 operand1 % operand2

 Example:

 int result = 10 % 3;

 Output:
 1

 Explanation:

 10 ÷ 3 = 3 remainder 1

 Therefore:

 10 % 3 = 1

 */

public class B_ArithmeticOperators {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Addition
        int addition = a + b;
        System.out.println("Addition (10 + 5) = " + addition);

        // Subtraction
        int subtraction = a - b;
        System.out.println("Subtraction (10 - 5) = " + subtraction);

        // Multiplication
        int multiplication = a * b;
        System.out.println("Multiplication (10 * 5) = " + multiplication);

        // Division
        int division = a / b;
        System.out.println("Division (10 / 5) = " + division);

        // Integer Division
        int integerDivision = 10 / 3;
        System.out.println("Integer Division (10 / 3) = " + integerDivision);

        // Decimal Division
        double decimalDivision = (double) 10 / 3;
        System.out.println("Decimal Division (10 / 3) = " + decimalDivision);

        // Modulus
        int modulus = 10 % 3;
        System.out.println("Modulus (10 % 3) = " + modulus);
    }
}


