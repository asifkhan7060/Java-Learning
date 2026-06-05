package E_operators;

/**
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;TERNARY OPERATOR IN JAVA<br>
 * ====================================================<br><br>
 *
 * Study : Ternary Operator (? :) in Java<br><br>
 *
 * 🔹 What Is the Ternary Operator?<br><br>
 *
 * The Ternary Operator is a shorthand form of
 * if-else statement.<br><br>
 *
 * It evaluates a condition and returns one of
 * two values depending on whether the condition
 * is true or false.<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Syntax of Ternary Operator<br>
 * ====================================================<br><br>
 *
 * condition ? expression1 : expression2<br><br>
 *
 * Here:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;condition → Boolean Expression<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;expression1 → Executes if condition is true<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;expression2 → Executes if condition is false<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;How Ternary Operator Works<br>
 * ====================================================<br><br>
 *
 * Step 1:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Condition is evaluated.<br><br>
 *
 * Step 2:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;If condition is true,
 * &nbsp;&nbsp;&nbsp;&nbsp;expression1 is executed.<br><br>
 *
 * Step 3:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;If condition is false,
 * &nbsp;&nbsp;&nbsp;&nbsp;expression2 is executed.<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Example 1 : Adult or Minor<br>
 * ====================================================<br><br>
 *
 * int age = 20;<br><br>
 *
 * String result =
 * (age >= 18) ? "Adult" : "Minor";<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Adult<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Example 2 : Maximum of Two Numbers<br>
 * ====================================================<br><br>
 *
 * int a = 10;<br>
 * int b = 20;<br><br>
 *
 * int max = (a > b) ? a : b;<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;20<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Example 3 : Even or Odd Number<br>
 * ====================================================<br><br>
 *
 * int number = 8;<br><br>
 *
 * String result =
 * (number % 2 == 0) ? "Even" : "Odd";<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Even<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Equivalent if-else Statement<br>
 * ====================================================<br><br>
 *
 * Ternary Operator:<br><br>
 *
 * String result =
 * (age >= 18) ? "Adult" : "Minor";<br><br>
 *
 * Equivalent if-else:<br><br>
 *
 * if(age >= 18) {<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;result = "Adult";<br>
 * }<br>
 * else {<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;result = "Minor";<br>
 * }<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Advantages of Ternary Operator<br>
 * ====================================================<br><br>
 *
 * ✓ Reduces code length.<br>
 * ✓ Improves readability for simple conditions.<br>
 * ✓ Alternative to simple if-else statements.<br>
 * ✓ Frequently used in assignments and output statements.<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Applications of Ternary Operator<br>
 * ====================================================<br><br>
 *
 * Used in:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Eligibility Checking<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Maximum/Minimum Finding<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Even/Odd Checking<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Conditional Assignments<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Quick Decision Making<br><br>
 *
 */

public class H_TernaryOperators {

    public static void main(String[] args) {

        // Example 1 : Adult or Minor
        int age = 20;

        String ageResult =
                (age >= 18) ? "Adult" : "Minor";

        System.out.println("Age Check = " + ageResult);

        // Example 2 : Maximum of Two Numbers
        int a = 10;
        int b = 20;

        int max =
                (a > b) ? a : b;

        System.out.println("Maximum Number = " + max);

        // Example 3 : Even or Odd
        int number = 8;

        String evenOdd =
                (number % 2 == 0) ? "Even" : "Odd";

        System.out.println("Number Type = " + evenOdd);
    }
}