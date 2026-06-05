package E_operators;
/**
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ARITHMETIC OPERATORS IN JAVA<br>
 * ====================================================<br><br>
 *
 * Study : Arithmetic Operators (+, -, *, /, %) in Java<br><br>
 *
 * 🔹 What Are Arithmetic Operators?<br><br>
 *
 * Arithmetic Operators are used to perform mathematical
 * calculations on numeric values.<br><br>
 *
 * Example:<br><br>
 *
 * int a = 10;<br>
 * int b = 5;<br><br>
 *
 * Here:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;a and b → Operands<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;+ → Operator<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1) Addition Operator (+)<br>
 * ====================================================<br><br>
 *
 * Purpose:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Used to add two values.<br><br>
 *
 * Syntax:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;operand1 + operand2<br><br>
 *
 * Example:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;int result = 10 + 5;<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;15<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;2) Subtraction Operator (-)<br>
 * ====================================================<br><br>
 *
 * Purpose:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Used to subtract one value from another.<br><br>
 *
 * Syntax:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;operand1 - operand2<br><br>
 *
 * Example:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;int result = 10 - 5;<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;5<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;3) Multiplication Operator (*)<br>
 * ====================================================<br><br>
 *
 * Purpose:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Used to multiply two values.<br><br>
 *
 * Syntax:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;operand1 * operand2<br><br>
 *
 * Example:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;int result = 10 * 5;<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;50<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;4) Division Operator (/)<br>
 * ====================================================<br><br>
 *
 * Purpose:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Used to divide one value by another.<br><br>
 *
 * Syntax:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;operand1 / operand2<br><br>
 *
 * Example:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;int result = 10 / 5;<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;2<br><br>
 *
 * Important Note:<br><br>
 *
 * When both operands are integers,
 * Java performs Integer Division.<br><br>
 *
 * Example:<br><br>
 *
 * &nbsp;&nbsp;&nbsp;&nbsp;int result = 10 / 3;<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;3<br><br>
 *
 * The decimal part (0.333...) is discarded.<br><br>
 *
 * To obtain decimal output:<br><br>
 *
 * &nbsp;&nbsp;&nbsp;&nbsp;double result = (double)10 / 3;<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;3.3333333333333335<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;5) Modulus Operator (%)<br>
 * ====================================================<br><br>
 *
 * Purpose:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Returns the remainder after division.<br><br>
 *
 * Syntax:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;operand1 % operand2<br><br>
 *
 * Example:<br><br>
 *
 * &nbsp;&nbsp;&nbsp;&nbsp;int result = 10 % 3;<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;1<br><br>
 *
 * Explanation:<br><br>
 *
 * &nbsp;&nbsp;&nbsp;&nbsp;10 ÷ 3 = 3 remainder 1<br><br>
 *
 * Therefore:<br><br>
 *
 * &nbsp;&nbsp;&nbsp;&nbsp;10 % 3 = 1<br><br>

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


