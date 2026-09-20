package D_methods;

/**
 ====================================================
 METHODS IN JAVA
 ====================================================

 🔹 What Is a Method (Function)?

 A Method is a block of code that performs a
 specific task.

 Methods help us avoid writing the same code
 repeatedly.

 A method can be called whenever its functionality
 is needed.


 ====================================================
 Why Methods Are Needed
 ====================================================

 Without methods, the same code may be written
 multiple times.

 Example:

 System.out.println("Hello");
 System.out.println("Welcome to Skywards");

 If the same code appears 10 times, maintaining
 it becomes difficult.

 Methods solve this problem by keeping the code
 in one place and reusing it whenever required.


 ====================================================
 Method Creation Syntax
 ====================================================

 accessModifier static returnType methodName() {
 // code
 }

 Example:

 private static void sayHello() {
 System.out.println("Hello");
 }


 ====================================================
 Method Calling Syntax
 ====================================================

 methodName();

 Example:

 sayHello();


 ====================================================
 How Methods Work
 ====================================================

 Step 1:
 Method is defined.

 Step 2:
 Method is called.

 Step 3:
 Control goes to method body.

 Step 4:
 Method executes statements.

 Step 5:
 Control returns back to caller.


 ====================================================
 Example 1 : Simple Method
 ====================================================

 Method:

 private static void sayHello() {
 System.out.println("Hello");
 System.out.println("Welcome to Skywards");
 }

 Method Call:

 sayHello();

 Output:

 Hello
 Welcome to Skywards


 ====================================================
 Method Reusability
 ====================================================

 A method can be called multiple times.

 Example:

 sayHello();
 sayHello();
 sayHello();

 This executes the same code three times
 without rewriting it.


 ====================================================
 Method Parameters
 ====================================================

 Parameters are variables that receive values
 when a method is called.

 Syntax:

 returnType methodName(dataType parameterName)

 Example:

 private static void sayHello(String name)

 Here:

 String → Data Type
 name → Parameter


 ====================================================
 Method Arguments
 ====================================================

 Arguments are actual values passed to
 parameters.

 Example:

 sayHello("John");

 Here:

 "John" → Argument


 ====================================================
 Example 2 : Method With Parameter
 ====================================================

 Method:

 private static void sayHello(String name) {
 System.out.println("Hello, " + name);
 }

 Calls:

 sayHello("John");
 sayHello("Michael");
 sayHello("Mohan");
 sayHello("Sunil");

 Output:

 Hello, John
 Hello, Michael
 Hello, Mohan
 Hello, Sunil


 ====================================================
 Return Type
 ====================================================

 A method may return a value after execution.

 Syntax:

 returnType methodName() {
 return value;
 }

 Example:

 private static int add(int a, int b)

 Return Type:

 int


 ====================================================
 Example 3 : Method Returning Value
 ====================================================

 int add(int a, int b) {
 return a + b;
 }

 Method Call:

 add(10, 20);

 Output:

 30


 ====================================================
 Advantages of Methods
 ====================================================

 ✓ Code Reusability
 ✓ Less Code Duplication
 ✓ Easier Maintenance
 ✓ Better Readability
 ✓ Modular Programming
 ✓ Easier Debugging

 */

public class Methods {

    public static void main(String[] args) {

        // ==================================================
        // Example 1 : Calling Simple Method
        // ==================================================

        sayHello();

        System.out.println();

        // ==================================================
        // Example 2 : Calling Same Method Multiple Times
        // Demonstrates Reusability
        // ==================================================

        sayHello();
        sayHello();
        sayHello();

        System.out.println();

        // ==================================================
        // Example 3 : Method With Arguments
        // Different values passed to same method
        // ==================================================

        sayHello("John");
        sayHello("Michael");
        sayHello("Mohan");
        sayHello("Sunil");

        System.out.println();

        // ==================================================
        // Example 4 : Method Returning Value
        // ==================================================

        int result = add(10, 20); //arguments

        System.out.println("Addition = " + result);
    }

    // ==================================================
    // Simple Method
    // No Parameters
    // No Return Value
    // ==================================================

    private static void sayHello() {  // private is used so other class cant get this method and static used becuz we using method without object creation

        System.out.println("Hello");
        System.out.println("Welcome to Skywards");
    }

    // ==================================================
    // Method With Parameter
    // Receives name from caller
    // ==================================================

    private static void sayHello(String name) {

        System.out.println("Hello, " + name);
        System.out.println("Welcome to Skywards");
    }

    // ==================================================
    // Method Returning Value
    // Takes two numbers and returns sum
    // ==================================================

    private static int add(int a, int b) { //parameters

        return a + b;
    }
}
