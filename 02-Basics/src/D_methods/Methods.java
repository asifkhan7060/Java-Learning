package D_methods;

/**
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;METHODS IN JAVA<br>
 * ====================================================<br><br>
 *
 * Study : Methods (Functions) in Java<br><br>
 *
 * 🔹 What Is a Method?<br><br>
 *
 * A Method is a block of code that performs a
 * specific task.<br><br>
 *
 * Methods help us avoid writing the same code
 * repeatedly.<br><br>
 *
 * A method can be called whenever its functionality
 * is needed.<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Why Methods Are Needed<br>
 * ====================================================<br><br>
 *
 * Without methods, the same code may be written
 * multiple times.<br><br>
 *
 * Example:<br><br>
 *
 * System.out.println("Hello");<br>
 * System.out.println("Welcome to Skywards");<br><br>
 *
 * If the same code appears 10 times, maintaining
 * it becomes difficult.<br><br>
 *
 * Methods solve this problem by keeping the code
 * in one place and reusing it whenever required.<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Method Creation Syntax<br>
 * ====================================================<br><br>
 *
 * accessModifier static returnType methodName() {<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;// code<br>
 * }<br><br>
 *
 * Example:<br><br>
 *
 * private static void sayHello() {<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;System.out.println("Hello");<br>
 * }<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Method Calling Syntax<br>
 * ====================================================<br><br>
 *
 * methodName();<br><br>
 *
 * Example:<br><br>
 *
 * sayHello();<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;How Methods Work<br>
 * ====================================================<br><br>
 *
 * Step 1:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Method is defined.<br><br>
 *
 * Step 2:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Method is called.<br><br>
 *
 * Step 3:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Control goes to method body.<br><br>
 *
 * Step 4:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Method executes statements.<br><br>
 *
 * Step 5:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Control returns back to caller.<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Example 1 : Simple Method<br>
 * ====================================================<br><br>
 *
 * Method:<br><br>
 *
 * private static void sayHello() {<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;System.out.println("Hello");<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;System.out.println("Welcome to Skywards");<br>
 * }<br><br>
 *
 * Method Call:<br><br>
 *
 * sayHello();<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Hello<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Welcome to Skywards<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Method Reusability<br>
 * ====================================================<br><br>
 *
 * A method can be called multiple times.<br><br>
 *
 * Example:<br><br>
 *
 * sayHello();<br>
 * sayHello();<br>
 * sayHello();<br><br>
 *
 * This executes the same code three times
 * without rewriting it.<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Method Parameters<br>
 * ====================================================<br><br>
 *
 * Parameters are variables that receive values
 * when a method is called.<br><br>
 *
 * Syntax:<br><br>
 *
 * returnType methodName(dataType parameterName)<br><br>
 *
 * Example:<br><br>
 *
 * private static void sayHello(String name)<br><br>
 *
 * Here:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;String → Data Type<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;name → Parameter<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Method Arguments<br>
 * ====================================================<br><br>
 *
 * Arguments are actual values passed to
 * parameters.<br><br>
 *
 * Example:<br><br>
 *
 * sayHello("John");<br><br>
 *
 * Here:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;"John" → Argument<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Example 2 : Method With Parameter<br>
 * ====================================================<br><br>
 *
 * Method:<br><br>
 *
 * private static void sayHello(String name) {<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;System.out.println("Hello, " + name);<br>
 * }<br><br>
 *
 * Calls:<br><br>
 *
 * sayHello("John");<br>
 * sayHello("Michael");<br>
 * sayHello("Mohan");<br>
 * sayHello("Sunil");<br><br>
 *
 * Output:<br><br>
 *
 * Hello, John<br>
 * Hello, Michael<br>
 * Hello, Mohan<br>
 * Hello, Sunil<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Return Type<br>
 * ====================================================<br><br>
 *
 * A method may return a value after execution.<br><br>
 *
 * Syntax:<br><br>
 *
 * returnType methodName() {<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;return value;<br>
 * }<br><br>
 *
 * Example:<br><br>
 *
 * private static int add(int a, int b)<br><br>
 *
 * Return Type:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;int<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Example 3 : Method Returning Value<br>
 * ====================================================<br><br>
 *
 * int add(int a, int b) {<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;return a + b;<br>
 * }<br><br>
 *
 * Method Call:<br><br>
 *
 * add(10, 20);<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;30<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Advantages of Methods<br>
 * ====================================================<br><br>
 *
 * ✓ Code Reusability<br>
 * ✓ Less Code Duplication<br>
 * ✓ Easier Maintenance<br>
 * ✓ Better Readability<br>
 * ✓ Modular Programming<br>
 * ✓ Easier Debugging<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Important Terminology<br>
 * ====================================================<br><br>
 *
 * Method Definition → Creating a method<br>
 * Method Call → Executing a method<br>
 * Parameter → Variable in method declaration<br>
 * Argument → Actual value passed<br>
 * Return Type → Type of value returned<br>
 * void → Returns nothing<br><br>
 *
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
