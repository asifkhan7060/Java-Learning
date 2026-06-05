package E_operators;

/**
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;BITWISE OPERATORS IN JAVA<br>
 * ====================================================<br><br>
 *
 * Study : Bitwise Operators (&, |, ^, ~, <<, >>, >>>) in Java<br><br>
 *
 * 🔹 What Are Bitwise Operators?<br><br>
 *
 * Bitwise Operators perform operations directly on
 * the binary representation (bits) of numbers.<br><br>
 *
 * These operators work bit-by-bit instead of working
 * on the entire number at once.<br><br>
 *
 * Example:<br><br>
 *
 * int a = 5; &nbsp;&nbsp;&nbsp;&nbsp;// 0101<br>
 * int b = 3; &nbsp;&nbsp;&nbsp;&nbsp;// 0011<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;1) Bitwise AND Operator (&)<br>
 * ====================================================<br><br>
 *
 * Purpose:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Returns 1 only when both bits are 1.<br><br>
 *
 * Example:<br><br>
 *
 * &nbsp;&nbsp;&nbsp;&nbsp;5 = 0101<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;3 = 0011<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;---------<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;& = 0001<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;1<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;2) Bitwise OR Operator (|)<br>
 * ====================================================<br><br>
 *
 * Purpose:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Returns 1 if at least one bit is 1.<br><br>
 *
 * Example:<br><br>
 *
 * &nbsp;&nbsp;&nbsp;&nbsp;5 = 0101<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;3 = 0011<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;---------<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;| = 0111<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;7<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;3) Bitwise XOR Operator (^)<br>
 * ====================================================<br><br>
 *
 * Purpose:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Returns 1 when bits are different.<br><br>
 *
 * Example:<br><br>
 *
 * &nbsp;&nbsp;&nbsp;&nbsp;5 = 0101<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;3 = 0011<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;---------<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;^ = 0110<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;6<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;4) Bitwise Complement Operator (~)<br>
 * ====================================================<br><br>
 *
 * Purpose:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Flips all bits (0 becomes 1 and 1 becomes 0).<br><br>
 *
 * Example:<br><br>
 *
 * &nbsp;&nbsp;&nbsp;&nbsp;~5<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;-6<br><br>
 *
 * Note:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Java uses 2's Complement representation
 * &nbsp;&nbsp;&nbsp;&nbsp;for negative numbers.<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;5) Left Shift Operator (<<)<br>
 * ====================================================<br><br>
 *
 * Purpose:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Shifts bits to the left.<br><br>
 *
 * Syntax:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;number << positions<br><br>
 *
 * Example:<br><br>
 *
 * &nbsp;&nbsp;&nbsp;&nbsp;5 << 1<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;10<br><br>
 *
 * Explanation:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;5 × 2¹ = 10<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;6) Right Shift Operator (>>)<br>
 * ====================================================<br><br>
 *
 * Purpose:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Shifts bits to the right.<br><br>
 *
 * Syntax:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;number >> positions<br><br>
 *
 * Example:<br><br>
 *
 * &nbsp;&nbsp;&nbsp;&nbsp;10 >> 1<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;5<br><br>
 *
 * Explanation:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;10 ÷ 2¹ = 5<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;7) Unsigned Right Shift Operator (>>>)<br>
 * ====================================================<br><br>
 *
 * Purpose:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Shifts bits to the right and fills
 * &nbsp;&nbsp;&nbsp;&nbsp;leftmost bits with 0.<br><br>
 *
 * Syntax:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;number >>> positions<br><br>
 *
 * Example:<br><br>
 *
 * &nbsp;&nbsp;&nbsp;&nbsp;20 >>> 2<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;5<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Applications of Bitwise Operators<br>
 * ====================================================<br><br>
 *
 * Used in:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Competitive Programming<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Cryptography<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Device Drivers<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Embedded Systems<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Performance Optimization<br><br>
 *
 */

public class G_BitwiseOperators {

    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        // Bitwise AND
        System.out.println("Bitwise AND (5 & 3) = " + (a & b));

        // Bitwise OR
        System.out.println("Bitwise OR (5 | 3) = " + (a | b));

        // Bitwise XOR
        System.out.println("Bitwise XOR (5 ^ 3) = " + (a ^ b));

        // Bitwise Complement
        System.out.println("Bitwise Complement (~5) = " + (~a));

        // Left Shift
        System.out.println("Left Shift (5 << 1) = " + (a << 1));

        // Right Shift
        System.out.println("Right Shift (10 >> 1) = " + (10 >> 1));

        // Unsigned Right Shift
        System.out.println("Unsigned Right Shift (20 >>> 2) = " + (20 >>> 2));
    }
}