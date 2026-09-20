
package E_operators;

/**
 ====================================================
 RELATIONAL OPERATORS IN JAVA
 ====================================================

 Study : Relational Operators (==, !=, >, <, >=, <=) in Java

 🔹 What Are Relational Operators?

 Relational Operators are used to compare two values.

 The result of every relational operation is either:

 true
 false

 Example:

 int a = 10;
 int b = 5;

 Here:

 a and b → Operands
 > → Relational Operator


 ====================================================
 1) Equal To Operator (==)
 ====================================================

 Purpose:
 Checks whether two values are equal.

 Syntax:
 operand1 == operand2

 Example:
 10 == 10

 Output:
 true


 ====================================================
 2) Not Equal To Operator (!=)
 ====================================================

 Purpose:
 Checks whether two values are not equal.

 Syntax:
 operand1 != operand2

 Example:
 10 != 5

 Output:
 true


 ====================================================
 3) Greater Than Operator (>)
 ====================================================

 Purpose:
 Checks whether the left operand is greater
 than the right operand.

 Syntax:
 operand1 > operand2

 Example:
 10 > 5

 Output:
 true


 ====================================================
 4) Less Than Operator (<)
 ====================================================

 Purpose:
 Checks whether the left operand is less
 than the right operand.

 Syntax:
 operand1 < operand2

 Example:
 10 < 5

 Output:
 false


 ====================================================
 5) Greater Than or Equal To (>=)
 ====================================================

 Purpose:
 Checks whether the left operand is greater
 than or equal to the right operand.

 Syntax:
 operand1 >= operand2

 Example:
 10 >= 10

 Output:
 true


 ====================================================
 6) Less Than or Equal To (<=)
 ====================================================

 Purpose:
 Checks whether the left operand is less
 than or equal to the right operand.

 Syntax:
 operand1 <= operand2

 Example:
 5 <= 10

 Output:
 true


 ====================================================
 Important Note
 ====================================================

 "=" is Assignment Operator.
 "==" is Relational Operator.
 "===" is not in java... it is in Javascript for strict type checking

 ====================================================
 Applications of Relational Operators
 ====================================================

 Used in:

 - if statements
 - if-else statements
 - loops
 - decision making
 - logical expressions
 
 */

public class C_RelationalOperators {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Equal To
        boolean equal = (a == b);
        System.out.println("Equal To (10 == 5) = " + equal);

        // Not Equal To
        boolean notEqual = (a != b);
        System.out.println("Not Equal To (10 != 5) = " + notEqual);

        // Greater Than
        boolean greaterThan = (a > b);
        System.out.println("Greater Than (10 > 5) = " + greaterThan);

        // Less Than
        boolean lessThan = (a < b);
        System.out.println("Less Than (10 < 5) = " + lessThan);

        // Greater Than or Equal To
        boolean greaterThanEqual = (a >= b);
        System.out.println("Greater Than or Equal To (10 >= 5) = " + greaterThanEqual);

        // Less Than or Equal To
        boolean lessThanEqual = (a <= b);
        System.out.println("Less Than or Equal To (10 <= 5) = " + lessThanEqual);
    }
}