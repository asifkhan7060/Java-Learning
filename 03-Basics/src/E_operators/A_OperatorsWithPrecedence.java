// Study : Introduction to Operators, Types of Operators and Operator Classification in Java

package E_operators;

public class A_OperatorsWithPrecedence {

/**
 ====================================================
 OPERATORS IN JAVA
 ====================================================

 What Are Operators?

 Operators are special symbols used to perform
 operations on operands (variables or values).

 Example:

 int a = 10;
 int b = 20;
 int sum = a + b;

 Here:

 a and b  -> Operands
 +        -> Operator
 sum      -> Result

 Operators help perform calculations, comparisons,
 logical decisions, assignments, and bit-level operations.


 ====================================================
 TYPES OF OPERATORS IN JAVA
 ====================================================

 1) Arithmetic Operators

 Used to perform mathematical operations.

 Operators:
 +   Addition
 -   Subtraction
 *   Multiplication
 /   Division
 %   Modulus (Remainder)

 2) Relational Operators

 Used to compare two values.

 Operators:
 ==   Equal To
 !=   Not Equal To
 >    Greater Than
 <    Less Than
 >=   Greater Than or Equal To
 <=   Less Than or Equal To

 Result:
 Always returns true or false.

 3) Logical Operators

 Used to combine multiple conditions.

 Operators:
 &&   Logical AND
 ||   Logical OR
 !    Logical NOT

 4) Assignment Operators

 Used to assign values to variables.

 Operators:
 =    Assign
 +=   Add and Assign
 -=   Subtract and Assign
 *=   Multiply and Assign
 /=   Divide and Assign
 %=   Modulus and Assign

 5) Unary Operators

 Unary operators work on a single operand.

 Operators:
 +    Unary Plus
 -    Unary Minus
 ++   Increment
 --   Decrement
 !    Logical NOT

 6) Bitwise Operators

 Used to perform operations directly on binary bits.

 Operators:
 &    Bitwise AND
 |    Bitwise OR
 ^    Bitwise XOR
 ~    Bitwise Complement
 <<   Left Shift
 >>   Right Shift
 >>>  Unsigned Right Shift

 7) Ternary Operator

 A shorthand form of if-else.

 Operator:
 ? :

 Syntax:
 condition ? value1 : value2


 ====================================================
 OPERATOR CATEGORIES
 ====================================================

 Based on Number of Operands:

 Unary Operators
 Work on 1 operand.

 Example:
 ++a

 Binary Operators
 Work on 2 operands.

 Example:
 a + b

 Ternary Operators
 Work on 3 operands.

 Example:
 condition ? value1 : value2
 */


/**
 | Priority (High → Low) | Category           | Operators                                                       |
 | --------------------- | ------------------ | --------------------------------------------------------------- |
 | 1                     | **Postfix**        | `expr++` `expr--`                                               |
 | 2                     | **Unary**          | `++expr` `--expr` `+expr` `-expr` `~` `!`                       |
 | 3                     | **Multiplicative** | `*` `/` `%`                                                     |
 | 4                     | **Additive**       | `+` `-`                                                         |
 | 5                     | **Shift**          | `<<` `>>` `>>>`                                                 |
 | 6                     | **Relational**     | `<` `>` `<=` `>=` `instanceof`                                  |
 | 7                     | **Equality**       | `==` `!=`                                                       |
 | 8                     | **Bitwise AND**    | `&`                                                             |
 | 9                     | **Bitwise XOR**    | `^`                                                             |
 | 10                    | **Bitwise OR**     | `\|`                                                            |
 | 11                    | **Logical AND**    | `&&`                                                            |
 | 12                    | **Logical OR**     | `\|\|`                                                          |
 | 13                    | **Ternary**        | `? :`                                                           |
 | 14                    | **Assignment**     | `=` `+=` `-=` `*=` `/=` `%=` `&=` `^=` `\|=` `<<=` `>>=` `>>>=` |
 */


}
