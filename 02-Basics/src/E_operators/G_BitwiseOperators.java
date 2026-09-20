package E_operators;

/**
 ====================================================
 BITWISE OPERATORS IN JAVA
 ====================================================

 Study : Bitwise Operators (&, |, ^, ~, <<, >>, >>>) in Java

 🔹 What Are Bitwise Operators?

 Bitwise Operators perform operations directly on
 the binary representation (bits) of numbers.

 These operators work bit-by-bit instead of working
 on the entire number at once.

 Example:

 int a = 5;     // 0101
 int b = 3;     // 0011


 ====================================================
 1) Bitwise AND Operator (&)
 ====================================================

 Purpose:
 Returns 1 only when both bits are 1.

 Example:

 5 = 0101
 3 = 0011
 ---------
 & = 0001

 Output:
 1


 ====================================================
 2) Bitwise OR Operator (|)
 ====================================================

 Purpose:
 Returns 1 if at least one bit is 1.

 Example:

 5 = 0101
 3 = 0011
 ---------
 | = 0111

 Output:
 7


 ====================================================
 3) Bitwise XOR Operator (^)
 ====================================================

 Purpose:
 Returns 1 when bits are different.

 Example:

 5 = 0101
 3 = 0011
 ---------
 ^ = 0110

 Output:
 6


 ====================================================
 4) Bitwise Complement Operator (~)
 ====================================================

 Purpose:
 Flips all bits (0 becomes 1 and 1 becomes 0).

 Example:

 ~5

 Output:
 -6

 Note:
 Java uses 2's complement representation
 for negative numbers.


 ====================================================
 5) Left Shift Operator (<<)
 ====================================================

 Purpose:
 Shifts bits to the left.

 Syntax:
 number << positions

 Example:

 5 << 1

 Output:
 10

 Explanation:
 5 × 2¹ = 10


 ====================================================
 6) Right Shift Operator (>>)
 ====================================================

 Purpose:
 Shifts bits to the right.

 Syntax:
 number >> positions

 Example:

 10 >> 1

 Output:
 5

 Explanation:
 10 ÷ 2¹ = 5


 ====================================================
 7) Unsigned Right Shift Operator (>>>)
 ====================================================

 Purpose:
 Shifts bits to the right and fills
 leftmost bits with 0.

 Syntax:
 number >>> positions

 Example:

 20 >>> 2

 Output:
 5


 ====================================================
 Applications of Bitwise Operators
 ====================================================

 Used in:

 - Competitive Programming
 - Cryptography
 - Device Drivers
 - Embedded Systems
 - Performance Optimization

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