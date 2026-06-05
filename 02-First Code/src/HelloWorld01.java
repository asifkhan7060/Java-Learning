public class HelloWorld01 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

// public : The class/method can be accessed from other classes.
// class : Blueprint or template used to create objects.
// HelloWorld01 : Name of the class.
// static : Allows a method or variable to belong to the class itself (We can use it without creating an object of the class.)
// void : This method does not return any value.
// main : Starting point of the Java program (Execution begins from this method.)
// String[] args : Stores command-line arguments passed to the program.
// System : Predefined Java class.
// out : Object inside the System class used for output.
// println() : Prints the message and moves the cursor to the next line.
// "Hello World!" : String (text) to be displayed on the screen.

/**

 FLOW

 .java file
  ↓
 Compile by javac behind ide
  ↓
 out/bin folder created
  ↓
 .class file (Bytecode) stored in out/bin
  ↓
 JVM loads class
  ↓
 main() executes
  ↓
 Output
  ↓
 End

**/

// IDE Documentation setting
// 1) go to setting -> build,execution,deployment section -> build tools -> maven -> Importing -> check sources,documentation and Annotations
// 2) Go to Editor -> code editing -> check (show quick documentation on hover)

