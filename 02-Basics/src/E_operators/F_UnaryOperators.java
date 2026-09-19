package E_operators;

/**
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;UNARY OPERATORS IN JAVA<br>
 * ====================================================<br><br>
 *
 * Study : Unary Operators (+, -, ++, --, !) in Java<br><br>
 *
 * 🔹 What Are Unary Operators?<br><br>
 *
 * Unary Operators are operators that work on only
 * one operand (single value or variable).<br><br>
 *
 * Example:<br><br>
 *
 * int a = 10;<br><br>
 *
 * Here:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;++a → Unary Operation<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;a → Operand<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;1) Unary Plus Operator (+)<br>
 * ====================================================<br><br>
 *
 * Purpose:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Indicates a positive value.<br><br>
 *
 * Syntax:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;+operand<br><br>
 *
 * Example:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;+10<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;10<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;2) Unary Minus Operator (-)<br>
 * ====================================================<br><br>
 *
 * Purpose:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Converts a positive value into a negative value.<br><br>
 *
 * Syntax:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;-operand<br><br>
 *
 * Example:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;-10<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;-10<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;3) Increment Operator (++)<br>
 * ====================================================<br><br>
 *
 * Purpose:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Increases the value by 1.<br><br>
 *
 * Syntax:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;++variable<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;variable++<br><br>
 *
 * Example:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;int x = 5;<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;x++;<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;6<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Pre-Increment (++x)<br>
 * ====================================================<br><br>
 *
 * Purpose:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;First increments the value,
 * &nbsp;&nbsp;&nbsp;&nbsp;then uses it.<br><br>
 *
 * Example:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;int x = 5;<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;System.out.println(++x);<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;6<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Post-Increment (x++)<br>
 * ====================================================<br><br>
 *
 * Purpose:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;First uses the value,
 * &nbsp;&nbsp;&nbsp;&nbsp;then increments it.<br><br>
 *
 * Example:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;int x = 5;<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;System.out.println(x++);<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;5<br><br>
 *
 * Final Value of x:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;6<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;4) Decrement Operator (--)<br>
 * ====================================================<br><br>
 *
 * Purpose:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Decreases the value by 1.<br><br>
 *
 * Syntax:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;--variable<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;variable--<br><br>
 *
 * Example:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;int x = 5;<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;x--;<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;4<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Pre-Decrement (--x)<br>
 * ====================================================<br><br>
 *
 * Purpose:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;First decreases the value,
 * &nbsp;&nbsp;&nbsp;&nbsp;then uses it.<br><br>
 *
 * Example:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;int x = 5;<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;System.out.println(--x);<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;4<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Post-Decrement (x--)<br>
 * ====================================================<br><br>
 *
 * Purpose:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;First uses the value,
 * &nbsp;&nbsp;&nbsp;&nbsp;then decreases it.<br><br>
 *
 * Example:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;int x = 5;<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;System.out.println(x--);<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;5<br><br>
 *
 * Final Value of x:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;4<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;5) Logical NOT Operator (!)<br>
 * ====================================================<br><br>
 *
 * Purpose:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Reverses a boolean value.<br><br>
 *
 * Syntax:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;!condition<br><br>
 *
 * Example:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;!true<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;false<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Applications of Unary Operators<br>
 * ====================================================<br><br>
 *
 * Used in:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Counters<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Loops<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Boolean Reversal<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Mathematical Operations<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Variable Updates<br><br>
 *
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