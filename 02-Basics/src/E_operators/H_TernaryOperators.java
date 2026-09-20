package E_operators;

/**
 ====================================================
 TERNARY OPERATOR IN JAVA
 ====================================================

 Study : Ternary Operator (? :) in Java

 🔹 What Is the Ternary Operator?

 The Ternary Operator is a shorthand form of
 if-else statement.

 It evaluates a condition and returns one of
 two values depending on whether the condition
 is true or false.


 ====================================================
 Syntax of Ternary Operator
 ====================================================

 condition ? expression1 : expression2

 Here:

 condition → Boolean Expression
 expression1 → Executes if condition is true
 expression2 → Executes if condition is false


 ====================================================
 How Ternary Operator Works
 ====================================================

 Step 1:
 Condition is evaluated.

 Step 2:
 If condition is true,
 expression1 is selected.

 Step 3:
 If condition is false,
 expression2 is selected.


 ====================================================
 Example 1 : Adult or Minor
 ====================================================

 int age = 20;

 String result =
 (age >= 18) ? "Adult" : "Minor";

 Output:
 Adult


 ====================================================
 Example 2 : Maximum of Two Numbers
 ====================================================

 int a = 10;
 int b = 20;

 int max = (a > b) ? a : b;

 Output:
 20


 ====================================================
 Example 3 : Even or Odd Number
 ====================================================

 int number = 8;

 String result =
 (number % 2 == 0) ? "Even" : "Odd";

 Output:
 Even


 ====================================================
 Equivalent if-else Statement
 ====================================================

 Ternary Operator:

 String result =
 (age >= 18) ? "Adult" : "Minor";

 Equivalent if-else:

 if(age >= 18)
 {
 result = "Adult";
 }
 else
 {
 result = "Minor";
 }


 ====================================================
 Advantages of Ternary Operator
 ====================================================

 ✓ Reduces code length.
 ✓ Improves readability for simple conditions.
 ✓ Alternative to simple if-else statements.
 ✓ Frequently used in assignments and output statements.


 ====================================================
 Applications of Ternary Operator
 ====================================================

 Used in:

 - Eligibility Checking
 - Maximum/Minimum Finding
 - Even/Odd Checking
 - Conditional Assignments
 - Quick Decision Making

 */

public class H_TernaryOperators {

    public static void main(String[] args) {

        // Example 1 : Adult or Minor
        int age = 20;

        String ageResult = (age >= 18) ? "Adult" : "Minor";

        System.out.println("Age Check = " + ageResult);

        // Example 2 : Maximum of Two Numbers
        int a = 10;
        int b = 20;

        int max = (a > b) ? a : b;

        System.out.println("Maximum Number = " + max);

        // Example 3 : Even or Odd
        int number = 8;

        String evenOdd = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println("Number Type = " + evenOdd);
    }
}