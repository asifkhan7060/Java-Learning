package E_operators;

/**
 ====================================================
 LOGICAL OPERATORS IN JAVA
 ====================================================

 Study : Logical Operators (&&, ||, !) in Java

 🔹 What Are Logical Operators?

 Logical Operators are used to combine or manipulate
 boolean expressions (true or false values).

 The result of every logical operation is either:

 true
 false

 Logical Operators are commonly used in:

 - if statements
 - if-else statements
 - loops
 - decision making

 Example:

 boolean isAdult = true;
 boolean hasLicense = true;

 Here:

 isAdult and hasLicense → Operands
 && → Logical Operator


 ====================================================
 1) Logical AND Operator (&&)
 ====================================================

 Purpose:
 Returns true only when both conditions are true.

 Syntax:
 condition1 && condition2

 Example:
 (10 > 5) && (20 > 10)

 Output:
 true

 Truth Table:

 true && true → true
 true && false → false
 false && true → false
 false && false → false


 ====================================================
 2) Logical OR Operator (||)
 ====================================================

 Purpose:
 Returns true if at least one condition is true.

 Syntax:
 condition1 || condition2

 Example:
 (10 > 5) || (20 < 10)

 Output:
 true

 Truth Table:

 true || true → true
 true || false → true
 false || true → true
 false || false → false


 ====================================================
 3) Logical NOT Operator (!)
 ====================================================

 Purpose:
 Reverses the boolean value.

 Syntax:
 !condition

 Example:
 !(10 > 5)

 Output:
 false

 Truth Table:

 !true → false
 !false → true


 ====================================================
 Short-Circuit Evaluation
 ====================================================

 Java uses Short-Circuit Evaluation.

 For AND (&&):

 If the first condition is false,
 Java does not evaluate the second condition.

 For OR (||):

 If the first condition is true,
 Java does not evaluate the second condition.


 ====================================================
 Applications of Logical Operators
 ====================================================

 Used in:

 - Age Verification
 - Login Systems
 - Eligibility Checking
 - Access Control
 - Decision Making

 */

public class D_LogicalOperators {

    public static void main(String[] args) {

        boolean isAdult = true;
        boolean hasLicense = true;

        // Logical AND
        boolean andResult = isAdult && hasLicense;
        System.out.println("Logical AND (true && true) = " + andResult);

        // Logical OR
        boolean orResult = isAdult || false;
        System.out.println("Logical OR (true || false) = " + orResult);

        // Logical NOT
        boolean notResult = !isAdult;
        System.out.println("Logical NOT (!true) = " + notResult);

        // Practical Example
        boolean canDrive = isAdult && hasLicense;
        System.out.println("Can Drive = " + canDrive);
    }
}