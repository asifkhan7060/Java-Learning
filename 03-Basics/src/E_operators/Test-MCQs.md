# Java Operators — Complete MCQ Test

> **Goal:** If you can answer around **80% of these questions correctly without referring back to the notes**, you should have a strong understanding of the complete Operators topic.
>
> This is intentionally a **combined mastery test** rather than a separate test for every operator file. The questions focus on concept application, expression evaluation, output prediction, operator selection, precedence, and common mistakes.

## Topics Covered

* Operators and operands
* Arithmetic operators
* Relational operators
* Logical operators
* Assignment operators
* Unary operators
* Pre-increment / post-increment
* Pre-decrement / post-decrement
* Logical NOT
* Bitwise operators
* Bitwise AND / OR / XOR
* Bitwise complement
* Left shift / right shift / unsigned right shift
* Ternary operator
* Unary / binary / ternary classification
* Operator precedence
* Integer division
* Decimal division and casting
* Compound assignment
* Relational vs assignment
* Logical truth tables
* Short-circuit evaluation
* Code tracing
* Output prediction
* Selecting the appropriate operator
* Combined expressions

---

# Section A — Operators & Operands

### 1.

What is the main purpose of an operator in Java?

* A. To perform an operation on one or more operands
* B. To create a class
* C. To define a method
* D. To store values permanently

---

### 2.

Consider:

```java
int a = 10;
int b = 20;
int sum = a + b;
```

Which statement correctly identifies the parts?

* A. `a` and `b` are operators, `+` is an operand
* B. `a` and `b` are operands, `+` is the operator
* C. `sum` is the operator
* D. `10` and `20` are operators

---

### 3.

Why can the same symbol such as `+` represent different kinds of operations in the operator categories?

* A. Its role depends on the context in which it is used
* B. Every `+` always has exactly three operands
* C. `+` is always a logical operator
* D. `+` can only be used with integers

---

### 4.

Which statement best describes the role of operators in Java according to the document?

* A. They support calculations, comparisons, logical decisions, assignments, and bit-level operations
* B. They are used only for arithmetic
* C. They are used only for comparisons
* D. They are used only with variables of type `boolean`

---

### 5.

Which expression contains one operator and two operands?

* A. `++a`
* B. `a + b`
* C. `!flag`
* D. `condition ? a : b`

---

### 6.

Which expression demonstrates a unary operation?

* A. `a + b`
* B. `a > b`
* C. `++a`
* D. `a && b`

---

### 7.

Which expression demonstrates a ternary operation?

* A. `a + b`
* B. `++a`
* C. `condition ? value1 : value2`
* D. `a == b`

---

# Section B — Operator Categories

### 8.

Which category is specifically used for mathematical calculations?

* A. Arithmetic
* B. Logical
* C. Relational
* D. Bitwise

---

### 9.

Which category is used to compare two values?

* A. Assignment
* B. Relational
* C. Unary
* D. Arithmetic

---

### 10.

Which category combines or manipulates boolean expressions?

* A. Logical
* B. Arithmetic
* C. Assignment
* D. Bitwise

---

### 11.

Which category can both assign a value and perform an operation before assigning the result back to the same variable?

* A. Assignment
* B. Relational
* C. Ternary
* D. Unary only

---

### 12.

Which category works directly on the binary representation of numbers?

* A. Logical
* B. Bitwise
* C. Relational
* D. Ternary

---

### 13.

Which operator category is described as a shorthand form of `if-else`?

* A. Unary
* B. Arithmetic
* C. Ternary
* D. Bitwise

---

### 14.

Which option contains only operators classified as unary in the document?

* A. `+`, `-`, `++`, `--`, `!`
* B. `+`, `-`, `*`, `/`, `%`
* C. `==`, `!=`, `>`, `<`
* D. `&&`, `||`, `? :`

---

### 15.

Which option correctly classifies `a + b`?

* A. Unary
* B. Binary
* C. Ternary
* D. Zero-operand

---

### 16.

Which option correctly classifies `++a`?

* A. Unary
* B. Binary
* C. Ternary
* D. Relational

---

### 17.

Which option correctly classifies:

```java
condition ? value1 : value2
```

* A. Unary
* B. Binary
* C. Ternary
* D. Assignment

---

### 18.

How are operators classified based on the number of operands in the document?

* A. Unary, binary, ternary
* B. Arithmetic, logical, assignment
* C. Primitive, non-primitive, reference
* D. Prefix, postfix, equality

---

# Section C — Arithmetic Operators

### 19.

Which expression correctly adds two values?

* A. `10 + 5`
* B. `10 == 5`
* C. `10 && 5`
* D. `10 % 5`

---

### 20.

What is the result of:

```java
10 + 5
```

* A. `5`
* B. `15`
* C. `50`
* D. `2`

---

### 21.

What is the result of:

```java
10 - 5
```

* A. `15`
* B. `10`
* C. `5`
* D. `50`

---

### 22.

What is the result of:

```java
10 * 5
```

* A. `15`
* B. `2`
* C. `50`
* D. `5`

---

### 23.

What is the result of:

```java
10 / 5
```

when both operands are integers?

* A. `0`
* B. `2`
* C. `5`
* D. `10`

---

### 24.

What does the `%` operator provide?

* A. Quotient
* B. Remainder
* C. Product
* D. Average

---

### 25.

What is the result of:

```java
10 % 3
```

* A. `0`
* B. `1`
* C. `3`
* D. `3.33`

---

### 26.

Why is:

```java
10 % 3
```

equal to `1`?

* A. `10 ÷ 3` leaves a remainder of `1`
* B. `10 × 3 = 1`
* C. `10 - 3 = 1`
* D. The `%` operator returns the quotient

---

# Section D — Integer Division & Decimal Division

### 27.

What happens in:

```java
int result = 10 / 3;
```

according to the document?

* A. `3.333...` is stored
* B. `3` is stored
* C. `4` is stored
* D. Compilation error

---

### 28.

Why is the decimal portion discarded in:

```java
int result = 10 / 3;
```

?

* A. Both operands are integers, so integer division is performed
* B. Java always rounds decimals down
* C. `/` never supports decimals
* D. `int` automatically converts to `double`

---

### 29.

Which statement demonstrates the technique shown in the document for obtaining decimal division?

* A. `double result = 10 / 3;`
* B. `double result = (double)10 / 3;`
* C. `int result = (double)10 / 3;`
* D. `float result = 10 / 3;`

---

### 30.

What is the purpose of `(double)` in:

```java
double result = (double)10 / 3;
```

* A. It makes the division operate with a decimal value
* B. It converts the result into `int`
* C. It removes the decimal part
* D. It performs modulus

---

### 31.

What output does the document show for:

```java
double result = (double)10 / 3;
```

* A. `3`
* B. `3.0`
* C. `3.3333333333333335`
* D. `1`

---

### 32.

Which pair demonstrates the difference between integer and decimal division?

* A. `10 / 3` and `(double)10 / 3`
* B. `10 % 3` and `10 + 3`
* C. `10 - 3` and `10 * 3`
* D. `10 == 3` and `10 != 3`

---

### 33.

What will be stored in `a`?

```java
int a = 7 / 2;
```

* A. `3`
* B. `3.5`
* C. `4`
* D. `2`

---

### 34.

What will be stored in `a`?

```java
double a = (double)7 / 2;
```

* A. `3`
* B. `3.5`
* C. `4`
* D. `2`

---

# Section E — Relational Operators

### 35.

What do relational operators produce?

* A. An integer
* B. A String
* C. A boolean result
* D. A remainder

---

### 36.

Which operator checks equality?

* A. `=`
* B. `==`
* C. `!=`
* D. `<=`

---

### 37.

What is the result of:

```java
10 == 10
```

* A. `true`
* B. `false`
* C. `10`
* D. Compilation error

---

### 38.

What is the result of:

```java
10 != 5
```

* A. `true`
* B. `false`
* C. `5`
* D. `10`

---

### 39.

What does `>` check?

* A. Whether the left value is greater than the right value
* B. Whether both values are equal
* C. Whether the left value is less than the right value
* D. Whether the values are different

---

### 40.

What is the result of:

```java
10 > 5
```

* A. `true`
* B. `false`
* C. `5`
* D. `10`

---

### 41.

What is the result of:

```java
10 < 5
```

* A. `true`
* B. `false`
* C. `5`
* D. `10`

---

### 42.

What does `>=` allow that `>` does not?

* A. It also considers equality as true
* B. It checks only equality
* C. It checks whether the left side is smaller
* D. It returns an integer

---

### 43.

What is the result of:

```java
10 >= 10
```

* A. `true`
* B. `false`
* C. `10`
* D. Compilation error

---

### 44.

What is the result of:

```java
5 <= 10
```

* A. `true`
* B. `false`
* C. `15`
* D. `5`

---

### 45.

Which expression is true?

* A. `10 < 5`
* B. `10 == 5`
* C. `10 != 5`
* D. `5 > 10`

---

# Section F — `=` vs `==`

### 46.

What is the key difference between `=` and `==` in the document?

* A. `=` assigns a value; `==` compares values
* B. `=` compares values; `==` assigns values
* C. Both perform assignment
* D. Both perform comparison

---

### 47.

What does this statement do?

```java
int a = 10;
```

* A. Compares `a` with `10`
* B. Assigns `10` to `a`
* C. Checks whether `a` is greater than `10`
* D. Returns `true`

---

### 48.

What does this expression do?

```java
a == 10
```

* A. Assigns `10` to `a`
* B. Checks whether `a` equals `10`
* C. Adds `10` to `a`
* D. Converts `a` into a boolean variable

---

### 49.

Which expression is suitable for a condition that checks whether `a` contains `10`?

* A. `a = 10`
* B. `a == 10`
* C. `a += 10`
* D. `a := 10`

---

### 50.

Why is confusing `=` with `==` especially problematic in conditional logic?

* A. One changes a variable while the other performs comparison
* B. Both always return the same result
* C. Both are arithmetic operators
* D. Both are unary operators

---

# Section G — Logical Operators

### 51.

What is the purpose of logical operators?

* A. To combine or manipulate boolean expressions
* B. To perform integer division
* C. To modify bits directly
* D. To assign numbers

---

### 52.

What does `&&` require for the final result to be true?

* A. Both conditions must be true
* B. At least one condition must be true
* C. Both conditions must be false
* D. The first condition must be false

---

### 53.

Which expression evaluates to `true`?

* A. `true && false`
* B. `false && true`
* C. `true && true`
* D. `false && false`

---

### 54.

Which expression evaluates to `false`?

* A. `true && true`
* B. `true && false`
* C. `false && true`
* D. Both B and C

---

### 55.

What does `||` require for the final result to be true?

* A. Both conditions must be true
* B. At least one condition must be true
* C. Both must be false
* D. Neither condition is evaluated

---

### 56.

Which expression evaluates to `false`?

* A. `true || false`
* B. `false || true`
* C. `true || true`
* D. `false || false`

---

### 57.

What does `!` do to a boolean value?

* A. Reverses it
* B. Adds one
* C. Compares it
* D. Assigns it

---

### 58.

What is:

```java
!true
```

?

* A. `true`
* B. `false`
* C. `1`
* D. `0`

---

### 59.

What is:

```java
!false
```

?

* A. `true`
* B. `false`
* C. `0`
* D. Compilation error

---

### 60.

Which statement best compares `&&` and `||`?

* A. `&&` requires both true; `||` requires at least one true
* B. `&&` requires one true; `||` requires both true
* C. Both require both conditions to be true
* D. Both reverse the boolean value

---

# Section H — Short-Circuit Evaluation

### 61.

What happens with `&&` when the first condition is false?

* A. Java does not evaluate the second condition
* B. Java must evaluate both
* C. Java evaluates the second condition first
* D. Java reverses the first condition

---

### 62.

What happens with `||` when the first condition is true?

* A. Java does not evaluate the second condition
* B. Java must evaluate both
* C. Java evaluates the second first
* D. The result becomes false

---

### 63.

Why can short-circuit evaluation matter when reading a logical expression?

* A. The second part may never be evaluated
* B. Logical operators stop working
* C. Boolean values become integers
* D. It changes `&&` into `||`

---

### 64.

Suppose:

```java
false && someCondition
```

What does the document's short-circuit rule imply?

* A. `someCondition` is not evaluated
* B. `someCondition` must be true
* C. Both sides are always evaluated
* D. The result is always true

---

### 65.

Suppose:

```java
true || someCondition
```

What does the document's short-circuit rule imply?

* A. `someCondition` is not evaluated
* B. `someCondition` must be false
* C. The result becomes false
* D. `true` is ignored

---

### 66.

Which pair correctly represents the short-circuit rules?

* A. `false && X` skips `X`; `true || X` skips `X`
* B. `true && X` always skips `X`; `false || X` always skips `X`
* C. Both operators always evaluate both operands
* D. Both operators skip their second operands

---

# Section I — Assignment Operators

### 67.

What is the purpose of the basic assignment operator `=`?

* A. Assign a value to a variable
* B. Compare two values
* C. Add two values
* D. Reverse a boolean

---

### 68.

What is the equivalent form of:

```java
x += 5;
```

* A. `x = x + 5`
* B. `x = 5`
* C. `x = x - 5`
* D. `x = x * 5`

---

### 69.

What is the equivalent form of:

```java
x -= 5;
```

* A. `x = x + 5`
* B. `x = x - 5`
* C. `x = x * 5`
* D. `x = 5 - x`

---

### 70.

What is the equivalent form of:

```java
x *= 5;
```

* A. `x = x + 5`
* B. `x = x - 5`
* C. `x = x * 5`
* D. `x = x / 5`

---

### 71.

What is the equivalent form of:

```java
x /= 5;
```

* A. `x = x / 5`
* B. `x = x * 5`
* C. `x = 5 / x`
* D. `x = x - 5`

---

### 72.

What is the equivalent form of:

```java
x %= 3;
```

* A. `x = x + 3`
* B. `x = x - 3`
* C. `x = x % 3`
* D. `x = 3 % x`

---

### 73.

If:

```java
int x = 10;
x += 5;
```

what is the final value of `x`?

* A. `5`
* B. `10`
* C. `15`
* D. `50`

---

### 74.

If:

```java
int x = 10;
x -= 3;
```

what is the final value?

* A. `7`
* B. `13`
* C. `30`
* D. `3`

---

### 75.

If:

```java
int x = 10;
x *= 2;
```

what is the final value?

* A. `12`
* B. `20`
* C. `5`
* D. `2`

---

### 76.

If:

```java
int x = 10;
x /= 4;
```

what is the final value under integer arithmetic?

* A. `2`
* B. `2.5`
* C. `4`
* D. `6`

---

### 77.

If:

```java
int x = 10;
x %= 3;
```

what is the final value?

* A. `3`
* B. `1`
* C. `0`
* D. `10`

---

### 78.

Which of these is especially useful when repeatedly updating a variable such as a counter?

* A. Compound assignment operators
* B. Relational operators only
* C. Ternary operators only
* D. Bitwise complement only

---

# Section J — Unary Operators

### 79.

What makes an operator unary?

* A. It operates on one operand
* B. It always returns a boolean
* C. It operates on exactly two operands
* D. It must use `? :`

---

### 80.

Which set contains the unary operators explicitly covered?

* A. `+`, `-`, `++`, `--`, `!`
* B. `+`, `-`, `*`, `/`, `%`
* C. `==`, `!=`, `>`, `<`
* D. `&&`, `||`, `? :`

---

### 81.

What does unary `+` represent?

* A. A positive value
* B. Addition of two operands
* C. Increment
* D. Bitwise OR

---

### 82.

What is the result of:

```java
+10
```

* A. `10`
* B. `-10`
* C. `0`
* D. `100`

---

### 83.

What does unary `-` do in the example?

* A. Converts the positive value into a negative value
* B. Subtracts two variables
* C. Decrements a variable automatically
* D. Performs modulus

---

### 84.

What is the result of:

```java
-10
```

* A. `10`
* B. `-10`
* C. `0`
* D. `-1`

---

# Section K — Increment Operators

### 85.

What does `++` do?

* A. Increases a variable's value by 1
* B. Decreases a variable's value by 1
* C. Multiplies by 2
* D. Reverses a boolean

---

### 86.

Which two forms of increment are shown?

* A. `++variable` and `variable++`
* B. `+variable` and `variable+`
* C. `variable +=` and `+= variable`
* D. `++` only

---

### 87.

Consider:

```java
int x = 5;
System.out.println(++x);
```

What is printed?

* A. `5`
* B. `6`
* C. `4`
* D. `7`

---

### 88.

Why does `++x` print `6` when `x` starts at `5`?

* A. It increments first and then uses the value
* B. It uses first and increments later
* C. It does not change `x`
* D. It decrements first

---

### 89.

Consider:

```java
int x = 5;
System.out.println(x++);
```

What is printed?

* A. `5`
* B. `6`
* C. `4`
* D. `0`

---

### 90.

After:

```java
int x = 5;
System.out.println(x++);
```

what is the final value of `x`?

* A. `5`
* B. `6`
* C. `4`
* D. `0`

---

### 91.

Which statement correctly describes post-increment?

* A. It uses the current value first, then increments it
* B. It increments first, then uses the value
* C. It only increments when printed
* D. It decrements after use

---

### 92.

Which statement correctly describes pre-increment?

* A. It increments first, then uses the new value
* B. It uses the old value, then increments
* C. It never changes the variable
* D. It decreases the variable

---

### 93.

What is the output?

```java
int x = 5;
System.out.println(++x);
System.out.println(x);
```

* A.
  `5`
  `6`
* B.
  `6`
  `6`
* C.
  `6`
  `5`
* D.
  `5`
  `5`

---

### 94.

What is the output?

```java
int x = 5;
System.out.println(x++);
System.out.println(x);
```

* A.
  `5`
  `6`
* B.
  `6`
  `6`
* C.
  `5`
  `5`
* D.
  `6`
  `5`

---

# Section L — Decrement Operators

### 95.

What does `--` do?

* A. Decreases a variable's value by 1
* B. Increases a variable's value by 1
* C. Multiplies by 1
* D. Converts it to boolean

---

### 96.

What is the output?

```java
int x = 5;
System.out.println(--x);
```

* A. `5`
* B. `6`
* C. `4`
* D. `3`

---

### 97.

Why does `--x` print `4` when `x` starts at `5`?

* A. It decrements first and then uses the value
* B. It uses first and decrements later
* C. It does not change `x`
* D. It increments first

---

### 98.

What is the output?

```java
int x = 5;
System.out.println(x--);
```

* A. `5`
* B. `4`
* C. `6`
* D. `3`

---

### 99.

What is the final value of `x` after:

```java
int x = 5;
System.out.println(x--);
```

* A. `5`
* B. `4`
* C. `6`
* D. `0`

---

### 100.

What is the key difference between `--x` and `x--`?

* A. Pre-decrement changes the value before using it; post-decrement uses the old value before changing it
* B. Both behave exactly the same
* C. `x--` increments while `--x` decrements
* D. Neither changes the variable

---

# Section M — Logical NOT as Unary

### 101.

Which operator is both listed under logical operators and unary operators?

* A. `!`
* B. `&&`
* C. `||`
* D. `==`

---

### 102.

What is the result of:

```java
!true
```

* A. `true`
* B. `false`
* C. `1`
* D. `0`

---

### 103.

What is the result of:

```java
!false
```

* A. `true`
* B. `false`
* C. `0`
* D. Compilation error

---

### 104.

What does `!` demonstrate about unary operators?

* A. A single operand can be transformed or manipulated by the operator
* B. Unary operators always perform arithmetic
* C. Unary operators always require two operands
* D. Unary operators cannot work with booleans

---

# Section N — Bitwise Operators

### 105.

What is the defining feature of bitwise operators?

* A. They operate directly on binary bits
* B. They only compare strings
* C. They only work with booleans
* D. They always return decimals

---

### 106.

Given:

```text
5 = 0101
3 = 0011
```

what is:

```text
5 & 3
```

?

* A. `0001`
* B. `0111`
* C. `0110`
* D. `1111`

---

### 107.

What is the decimal result of:

```java
5 & 3
```

?

* A. `1`
* B. `3`
* C. `5`
* D. `7`

---

### 108.

What rule does bitwise AND follow?

* A. A bit becomes 1 only when both corresponding bits are 1
* B. A bit becomes 1 when either bit is 1
* C. A bit becomes 1 when the bits differ
* D. Every bit is flipped

---

### 109.

What is:

```java
5 | 3
```

based on the documented binary example?

* A. `1`
* B. `3`
* C. `6`
* D. `7`

---

### 110.

What rule does bitwise OR follow?

* A. A bit becomes 1 if at least one corresponding bit is 1
* B. A bit becomes 1 only if both are 1
* C. A bit becomes 1 only if they differ
* D. All bits are inverted

---

### 111.

What is:

```java
5 ^ 3
```

according to the example?

* A. `1`
* B. `5`
* C. `6`
* D. `7`

---

### 112.

What rule does XOR follow?

* A. A bit becomes 1 when the corresponding bits are different
* B. A bit becomes 1 when both are equal
* C. A bit becomes 1 when both are 1
* D. It always produces zero

---

### 113.

Which operation would be useful when you want bits to produce `1` only when they differ?

* A. `&`
* B. `|`
* C. `^`
* D. `~`

---

# Section O — Bitwise Complement

### 114.

What does `~` do?

* A. Flips all bits
* B. Sets all bits to 1
* C. Shifts bits left
* D. Adds 1

---

### 115.

What is the result of:

```java
~5
```

according to the document?

* A. `5`
* B. `-5`
* C. `-6`
* D. `6`

---

### 116.

Why can the result of `~5` be negative?

* A. Java uses two's complement representation for negative numbers
* B. `~` automatically performs subtraction
* C. `~` converts integers to boolean
* D. The binary representation is discarded

---

# Section P — Shift Operators

### 117.

What does the left-shift operator `<<` do?

* A. Shifts bits to the left
* B. Shifts bits to the right
* C. Flips all bits
* D. Compares bits

---

### 118.

What is:

```java
5 << 1
```

according to the example?

* A. `2`
* B. `5`
* C. `10`
* D. `20`

---

### 119.

The document explains `5 << 1` using which mathematical interpretation?

* A. `5 × 2¹`
* B. `5 ÷ 2¹`
* C. `5 × 1`
* D. `5 + 2`

---

### 120.

What does `>>` do?

* A. Shifts bits to the right
* B. Shifts bits to the left
* C. Flips bits
* D. Performs OR

---

### 121.

What is:

```java
10 >> 1
```

according to the example?

* A. `20`
* B. `10`
* C. `5`
* D. `2`

---

### 122.

The document explains `10 >> 1` using which mathematical interpretation?

* A. `10 × 2¹`
* B. `10 ÷ 2¹`
* C. `10 + 2`
* D. `10 % 2`

---

### 123.

What does `>>>` do according to the document?

* A. Shifts bits right and fills the leftmost bits with zero
* B. Shifts bits left
* C. Flips all bits
* D. Performs signed addition

---

### 124.

What is:

```java
20 >>> 2
```

in the example?

* A. `5`
* B. `10`
* C. `20`
* D. `40`

---

### 125.

Which operator specifically differs from `>>` in the documented description because it fills leftmost bits with `0`?

* A. `<<`
* B. `>>`
* C. `>>>`
* D. `~`

---

# Section Q — Ternary Operator

### 126.

What is the ternary operator described as?

* A. A shorthand form of `if-else`
* B. A replacement for every loop
* C. A binary bitwise operator
* D. A special assignment operator

---

### 127.

What is the general ternary syntax?

* A. `condition ? expression1 : expression2`
* B. `condition : expression1 ? expression2`
* C. `condition ? expression1`
* D. `condition : expression1`

---

### 128.

What happens when the ternary condition is true?

* A. `expression1` is selected
* B. `expression2` is selected
* C. Both expressions execute
* D. Neither executes

---

### 129.

What happens when the condition is false?

* A. `expression1` is selected
* B. `expression2` is selected
* C. Both are selected
* D. The operator returns `false` automatically

---

### 130.

What is the result?

```java
int age = 20;
String result = (age >= 18) ? "Adult" : "Minor";
```

* A. `Minor`
* B. `Adult`
* C. `20`
* D. `true`

---

### 131.

What is the result?

```java
int a = 10;
int b = 20;

int max = (a > b) ? a : b;
```

* A. `10`
* B. `20`
* C. `30`
* D. `false`

---

### 132.

What is the result?

```java
int number = 8;
String result = (number % 2 == 0) ? "Even" : "Odd";
```

* A. `Odd`
* B. `Even`
* C. `8`
* D. `0`

---

### 133.

Which situation is a good fit for the ternary operator according to the document?

* A. A simple two-choice decision
* B. A large multi-branch control structure
* C. Repeating code
* D. Traversing an array

---

### 134.

Which advantage of the ternary operator is explicitly described?

* A. It can reduce code length for simple conditions
* B. It eliminates every `if-else`
* C. It works only with integers
* D. It automatically improves program speed

---

### 135.

Which application is explicitly associated with ternary operators?

* A. Maximum/minimum finding
* B. Eligibility checking
* C. Even/odd checking
* D. All of the above

---

# Section R — Operator Precedence

### 136.

Why is operator precedence important?

* A. It determines the order in which operators in an expression are evaluated
* B. It determines the variable's data type
* C. It changes method visibility
* D. It determines whether an operator is unary

---

### 137.

According to the precedence table, which category has the highest priority among those listed?

* A. Assignment
* B. Postfix
* C. Ternary
* D. Logical OR

---

### 138.

According to the precedence table, which comes before multiplication?

* A. Postfix
* B. Assignment
* C. Logical AND
* D. Ternary

---

### 139.

Which has higher precedence according to the provided table?

* A. `+` / `-`
* B. `*` / `/` / `%`
* C. `&&`
* D. Assignment

---

### 140.

Which has higher precedence?

* A. `+`
* B. `*`
* C. `||`
* D. `?:`

---

### 141.

Which has higher precedence according to the table?

* A. Relational operators
* B. Equality operators
* C. Logical AND
* D. Assignment

---

### 142.

Which comes before equality in the precedence table?

* A. Relational
* B. Logical OR
* C. Ternary
* D. Assignment

---

### 143.

Which comes before logical OR according to the precedence table?

* A. Logical AND
* B. Assignment
* C. Ternary
* D. None of these

---

### 144.

Which category has the lowest priority in the provided precedence table?

* A. Postfix
* B. Unary
* C. Assignment
* D. Multiplicative

---

### 145.

Put these categories in the correct high-to-low order:

* A. Multiplicative → Additive → Assignment → Unary
* B. Unary → Multiplicative → Additive → Assignment
* C. Assignment → Additive → Unary → Multiplicative
* D. Additive → Unary → Assignment → Multiplicative

---

### 146.

Which order is correct from higher to lower precedence?

* A. Relational → Equality → Bitwise AND → Logical AND
* B. Logical AND → Equality → Relational → Bitwise AND
* C. Equality → Relational → Logical AND → Bitwise AND
* D. Assignment → Ternary → Logical AND → Relational

---

### 147.

According to the precedence table, where does `?:` fall relative to logical OR and assignment?

* A. Higher than logical OR but lower than assignment
* B. Lower than logical OR but higher than assignment
* C. Higher than both
* D. Lower than both

---

### 148.

Which category includes:

```text
expr++
expr--
```

in the precedence table?

* A. Postfix
* B. Unary
* C. Additive
* D. Assignment

---

### 149.

Which category includes:

```text
++expr
--expr
+expr
-expr
~
!
```

?

* A. Postfix
* B. Unary
* C. Multiplicative
* D. Relational

---

### 150.

Which category includes:

```text
*
/
%
```

?

* A. Multiplicative
* B. Additive
* C. Shift
* D. Bitwise AND

---

# Section S — Combined Expression Reasoning

### 151.

What will this expression produce?

```java
int result = 10 + 5 * 2;
```

* A. `30`
* B. `20`
* C. `25`
* D. `15`

---

### 152.

Why does the previous expression produce that result?

* A. Multiplication has higher precedence than addition
* B. Addition has higher precedence than multiplication
* C. Assignment is performed first
* D. Operators are evaluated randomly

---

### 153.

What will this produce?

```java
int result = 20 - 8 / 2;
```

* A. `6`
* B. `16`
* C. `12`
* D. `24`

---

### 154.

What is the result of:

```java
boolean result = 10 > 5 && 20 > 10;
```

* A. `true`
* B. `false`
* C. `30`
* D. Compilation error

---

### 155.

What is the result of:

```java
boolean result = 10 < 5 || 20 > 10;
```

* A. `true`
* B. `false`
* C. `15`
* D. `20`

---

### 156.

What is the result of:

```java
boolean result = !(10 > 5);
```

* A. `true`
* B. `false`
* C. `10`
* D. `5`

---

### 157.

What is the final value?

```java
int x = 5;
x += 3;
x *= 2;
```

* A. `8`
* B. `10`
* C. `16`
* D. `13`

---

### 158.

What is the final value?

```java
int x = 10;
x -= 2;
x /= 4;
```

* A. `2`
* B. `8`
* C. `4`
* D. `32`

---

### 159.

What is the result?

```java
int x = 5;
int result = ++x;
```

* A. `result = 5`, `x = 6`
* B. `result = 6`, `x = 6`
* C. `result = 5`, `x = 5`
* D. `result = 6`, `x = 5`

---

### 160.

What is the result?

```java
int x = 5;
int result = x++;
```

* A. `result = 5`, `x = 6`
* B. `result = 6`, `x = 6`
* C. `result = 5`, `x = 5`
* D. `result = 6`, `x = 5`

---

### 161.

What is the result?

```java
int x = 5;
int result = --x;
```

* A. `result = 5`, `x = 4`
* B. `result = 4`, `x = 4`
* C. `result = 5`, `x = 5`
* D. `result = 6`, `x = 4`

---

### 162.

What is the result?

```java
int x = 5;
int result = x--;
```

* A. `result = 5`, `x = 4`
* B. `result = 4`, `x = 4`
* C. `result = 5`, `x = 5`
* D. `result = 4`, `x = 5`

---

# Section T — Mixed Operator Selection

### 163.

You need to determine whether two values are equal. Which operator should be selected?

* A. `=`
* B. `==`
* C. `+=`
* D. `&&`

---

### 164.

You need to assign `10` to `x`. Which operator should be used?

* A. `==`
* B. `=`
* C. `!=`
* D. `>=`

---

### 165.

You need to check whether at least one of two conditions is true. Which operator should be selected?

* A. `&&`
* B. `||`
* C. `!`
* D. `&`

---

### 166.

You need both conditions to be true before the combined result becomes true. Which operator should be selected?

* A. `||`
* B. `&&`
* C. `^`
* D. `!`

---

### 167.

You need to reverse a boolean result. Which operator should be selected?

* A. `!`
* B. `!=`
* C. `~`
* D. `--`

---

### 168.

You need to increase a variable by exactly one. Which operator is most direct?

* A. `++`
* B. `+= 0`
* C. `+`
* D. `--`

---

### 169.

You need the remainder after division. Which operator should be used?

* A. `/`
* B. `%`
* C. `//`
* D. `mod`

---

### 170.

You need to choose one of two values based on a condition in a compact expression. Which operator should be used?

* A. `?:`
* B. `&&`
* C. `==`
* D. `~`

---

### 171.

You need to compare bits and produce `1` only when both corresponding bits are `1`. Which operator is appropriate?

* A. `|`
* B. `^`
* C. `&`
* D. `~`

---

### 172.

You need to flip all bits. Which operator is appropriate?

* A. `^`
* B. `~`
* C. `!`
* D. `>>`

---

### 173.

You need to shift bits to the left. Which operator is appropriate?

* A. `>>`
* B. `>>>`
* C. `<<`
* D. `~`

---

### 174.

You need a right shift that fills the leftmost bits with zero. Which operator from the document matches this description?

* A. `>>`
* B. `>>>`
* C. `<<`
* D. `^`

---

# Section U — Final Mastery

### 175.

Which statement best summarizes the difference between arithmetic, relational, logical, assignment, unary, bitwise and ternary operators?

* A. They perform different categories of operations such as calculation, comparison, boolean combination, assignment, single-operand manipulation, bit-level manipulation, and two-choice selection
* B. They all perform arithmetic
* C. They are simply different names for the same operations
* D. All operators return integers

---

### 176.

Which statement best summarizes operator classification by number of operands?

* A. Unary uses one operand, binary uses two, ternary uses three
* B. Unary uses two, binary uses one, ternary uses four
* C. All operators use two operands
* D. Number of operands has no relationship with operator classification

---

### 177.

Which statement best explains why operator precedence matters in a complex expression?

* A. Different operator categories are evaluated in a defined priority order
* B. Every operator has equal priority
* C. Only assignment operators have precedence
* D. Precedence changes variable types

---

### 178.

Which statement best explains the difference between logical AND and bitwise AND as presented in the documents?

* A. Logical AND combines boolean conditions, while bitwise AND works directly on binary bits
* B. Both are identical
* C. Bitwise AND works only on Strings
* D. Logical AND always returns an integer

---

### 179.

Which statement best explains the difference between logical NOT `!` and bitwise complement `~`?

* A. `!` reverses a boolean value, while `~` flips bits of a number
* B. Both reverse boolean values
* C. Both flip bits
* D. `~` is a relational operator

---

### 180.

Which statement best explains the difference between `++x` and `x++`?

* A. `++x` increments before the value is used, while `x++` uses the current value before incrementing
* B. Both always produce different final variable values
* C. `x++` decrements the variable
* D. `++x` does not change the variable

---

### 181.

Which statement best explains the difference between `--x` and `x--`?

* A. `--x` decrements before use, while `x--` uses the current value before decrementing
* B. Both increment the variable
* C. `x--` decrements twice
* D. `--x` never changes the variable

---

### 182.

Which statement best explains the role of compound assignment operators?

* A. They combine an operation with assignment to update the same variable
* B. They compare two variables
* C. They only work with booleans
* D. They create new variables

---

### 183.

Which statement best explains integer division in the document?

* A. When both operands are integers, the decimal portion of the division result is discarded
* B. Integer division always produces a decimal
* C. Integer division rounds every result upward
* D. Integer division is identical to floating-point division

---

### 184.

Which statement best explains how the ternary operator relates to `if-else`?

* A. It provides a compact two-choice expression based on a condition
* B. It replaces every possible `if-else` structure
* C. It is a looping construct
* D. It performs bitwise operations

---

### 185.

Which statement best summarizes short-circuit evaluation?

* A. `&&` can stop when the first condition is false, while `||` can stop when the first condition is true
* B. Both always evaluate every condition
* C. Only `!` short-circuits
* D. Bitwise operators always short-circuit

---

### 186.

A learner can correctly trace arithmetic, relational, logical, assignment, unary, bitwise, ternary, and precedence-based expressions from this test. What does that most strongly indicate?

* A. Strong understanding of the Operators topic covered in these documents
* B. Only memorization of symbols
* C. Understanding of variables but not operators
* D. Understanding of methods only

---

# Answer Key

|  Q | Ans |  Q | Ans |   Q | Ans |   Q | Ans |   Q | Ans |
| -: | :-: | -: | :-: | --: | :-: | --: | :-: | --: | :-: |
|  1 |  A  | 38 |  A  |  75 |  B  | 112 |  A  | 149 |  B  |
|  2 |  B  | 39 |  A  |  76 |  A  | 113 |  C  | 150 |  A  |
|  3 |  A  | 40 |  A  |  77 |  B  | 114 |  A  | 151 |  B  |
|  4 |  A  | 41 |  B  |  78 |  A  | 115 |  C  | 152 |  A  |
|  5 |  B  | 42 |  A  |  79 |  A  | 116 |  A  | 153 |  B  |
|  6 |  C  | 43 |  A  |  80 |  A  | 117 |  A  | 154 |  A  |
|  7 |  C  | 44 |  A  |  81 |  A  | 118 |  C  | 155 |  A  |
|  8 |  A  | 45 |  C  |  82 |  A  | 119 |  A  | 156 |  B  |
|  9 |  B  | 46 |  A  |  83 |  A  | 120 |  A  | 157 |  C  |
| 10 |  A  | 47 |  B  |  84 |  B  | 121 |  C  | 158 |  A  |
| 11 |  A  | 48 |  B  |  85 |  A  | 122 |  B  | 159 |  B  |
| 12 |  B  | 49 |  B  |  86 |  A  | 123 |  A  | 160 |  A  |
| 13 |  C  | 50 |  A  |  87 |  B  | 124 |  A  | 161 |  B  |
| 14 |  A  | 51 |  A  |  88 |  A  | 125 |  C  | 162 |  A  |
| 15 |  B  | 52 |  A  |  89 |  A  | 126 |  A  | 163 |  B  |
| 16 |  A  | 53 |  C  |  90 |  B  | 127 |  A  | 164 |  B  |
| 17 |  C  | 54 |  D  |  91 |  A  | 128 |  A  | 165 |  B  |
| 18 |  A  | 55 |  B  |  92 |  A  | 129 |  B  | 166 |  B  |
| 19 |  A  | 56 |  D  |  93 |  B  | 130 |  B  | 167 |  A  |
| 20 |  B  | 57 |  A  |  94 |  A  | 131 |  B  | 168 |  A  |
| 21 |  C  | 58 |  B  |  95 |  A  | 132 |  B  | 169 |  B  |
| 22 |  C  | 59 |  A  |  96 |  C  | 133 |  A  | 170 |  A  |
| 23 |  B  | 60 |  A  |  97 |  A  | 134 |  A  | 171 |  C  |
| 24 |  B  | 61 |  A  |  98 |  A  | 135 |  A  | 172 |  B  |
| 25 |  B  | 62 |  A  |  99 |  B  | 136 |  A  | 173 |  C  |
| 26 |  A  | 63 |  A  | 100 |  A  | 137 |  B  | 174 |  B  |
| 27 |  B  | 64 |  A  | 101 |  A  | 138 |  A  | 175 |  A  |
| 28 |  A  | 65 |  A  | 102 |  B  | 139 |  B  | 176 |  A  |
| 29 |  B  | 66 |  A  | 103 |  A  | 140 |  B  | 177 |  A  |
| 30 |  A  | 67 |  A  | 104 |  A  | 141 |  A  | 178 |  A  |
| 31 |  C  | 68 |  A  | 105 |  A  | 142 |  A  | 179 |  A  |
| 32 |  A  | 69 |  B  | 106 |  A  | 143 |  A  | 180 |  A  |
| 33 |  A  | 70 |  C  | 107 |  A  | 144 |  C  | 181 |  A  |
| 34 |  B  | 71 |  A  | 108 |  A  | 145 |  B  | 182 |  A  |
| 35 |  C  | 72 |  C  | 109 |  D  | 146 |  A  | 183 |  A  |
| 36 |  B  | 73 |  C  | 110 |  A  | 147 |  A  | 184 |  A  |
| 37 |  A  | 74 |  A  | 111 |  C  | 148 |  A  | 185 |  A  |
|    |     |    |     |     |     |     |     | 186 |  A  |

---

# Coverage

This test consolidates the complete material from the uploaded operator documents:

* What operators are
* Operands
* Results
* Arithmetic operators
* Addition
* Subtraction
* Multiplication
* Division
* Modulus
* Integer division
* Decimal division
* Explicit casting with `(double)`
* Relational operators
* Equality
* Inequality
* Greater than
* Less than
* Greater than or equal
* Less than or equal
* `=` vs `==`
* Logical AND
* Logical OR
* Logical NOT
* Truth tables
* Short-circuit evaluation
* Assignment
* Add and assign
* Subtract and assign
* Multiply and assign
* Divide and assign
* Modulus and assign
* Unary plus
* Unary minus
* Increment
* Pre-increment
* Post-increment
* Decrement
* Pre-decrement
* Post-decrement
* Unary logical NOT
* Bitwise AND
* Bitwise OR
* Bitwise XOR
* Bitwise complement
* Two's complement note
* Left shift
* Right shift
* Unsigned right shift
* Ternary operator
* Ternary syntax
* Ternary execution flow
* Adult/minor example
* Maximum of two numbers
* Even/odd example
* Equivalent `if-else`
* Ternary advantages
* Ternary applications
* Unary operators
* Binary operators
* Ternary operators
* Operator precedence
* Postfix precedence
* Unary precedence
* Multiplicative precedence
* Additive precedence
* Shift precedence
* Relational precedence
* Equality precedence
* Bitwise AND precedence
* Bitwise XOR precedence
* Bitwise OR precedence
* Logical AND precedence
* Logical OR precedence
* Ternary precedence
* Assignment precedence
* Combined expressions
* Output prediction
* Operator selection
* Practical operator application

# 80% Mastery Benchmark

**Total Questions: 186**

**80% = 149 correct answers**

|     Score | Understanding                                          |
| --------: | ------------------------------------------------------ |
|   168–186 | Excellent mastery                                      |
|   149–167 | Strong understanding — topic can be considered covered |
|   130–148 | Partial understanding — review weak areas              |
|   112–129 | Significant gaps — study the topic again               |
| Below 112 | Topic needs thorough revision                          |

> **Target: 149/186 or higher.**
>
> A learner scoring at least 80% should have a strong understanding of the Operators material covered in these documents and can reasonably move forward to the next topic.
