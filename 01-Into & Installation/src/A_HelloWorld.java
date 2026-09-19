/**
        FLOW

 .java file (this file)
         ↓
 Compile by javac behind ide
         ↓
 out/bin folder created (run and see it)
         ↓
 .class file (Bytecode) stored in out/bin
         ↓
   JVM loads class
         ↓
 Java Launcher finds main()
         ↓
   main() executes
         ↓
      Output
         ↓
        End

 **/

// Code :
public class A_HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

/**

 Lets breakdown code and understand :-

 --------------------------------------------------
 1. public class HelloWorld01
 --------------------------------------------------

 - public → It is called Access modifier (Allows the JVM to access the method)
 - class → Keyword used to declare a class.
 - HelloWorld01 → Name of the class.

 Class ?
 A class defines the structure and behavior of objects (blueprint)
 It can contain variables, methods, constructors, etc.

 WHY do we need a class?
 Java organizes program code using classes.
 A class provides the structure in which we define methods, variables, constructors, etc.

 IMPORTANT:
 Because A_HelloWorld is a public class, the source file should be named: A_HelloWorld.java


 --------------------------------------------------
 2. public static void main(String[] args)
 --------------------------------------------------

 This is the standard entry point of a traditional standalone Java application.

 public
 → It is called Access modifier (Allows the JVM to access the method)

 static
 → Makes the method belong to the class rather than an object.
 → Allows the JVM to invoke main() without creating an object first.

 void
 → A Return type.
 → Means the method does not return a value.

 main
 → Standard method name recognized by the Java launcher as the entry point of a traditional standalon Java application.

 String[] args
 → Array of String values used to receive command-line arguments.


 WHY is main() public?
 The JVM needs to access main() from outside the class when starting the application.
 Therefore, main() is declared public.

 WHY is main() static?
 The JVM needs to start program execution before an object of the class has been created.
 Since static methods belong to the class itself, the JVM can invoke main() without creating an object.

 WHY is main() void?
 The main() method does not need to return a value to the JVM. Therefore, its return type is void.

 WHY is it called main()?
 main is the standard method name recognized by the Java launcher as the starting point of a traditional standalone Java application.

 Interview point
 Is main keyword compulsory?
 Yes, for the traditional Java application's entry point, the method must be named main. The Java launcher uses this method to begin execution.

 WHAT is String[] args?
 String[] args is an array of String values used to receive arguments passed from the command line.

 Example:
 java A_HelloWorld Hello Java

 Then:
 args[0] = "Hello"
 args[1] = "Java"


 CAN we change the name args?
 Yes.
 args is only the parameter name.

 The important part is the parameter type: String[]


 --------------------------------------------------
 3. System.out.println()
 --------------------------------------------------

 System.out.println() is used to display output on the console.


 System?
 System is a predefined class from the java.lang package.
 It provides access to system-related functionality.

 out?
 out is a standard output stream provided by the System class.
 It is used to send output to the console.
 More precisely, System.out refers to a PrintStream object.


 println()?
 println() is a method of PrintStream.
 It:
 1. Prints the supplied value.
 2. Moves the cursor to the next line.


 WHY use println()?
 It is commonly used to display information, debugging messages, and program results on the console.

 */


// IDE Documentation setting
// 1) go to setting -> build,execution,deployment section -> build tools -> maven -> Importing -> check sources,documentation and Annotations
// 2) Go to Editor -> code editing -> check (show quick documentation on hover)
