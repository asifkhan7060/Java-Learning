// Evoluion of Java  : source file mode and reduced boiler plate of main function

void main() {
        System.out.println("Hello World! form File2");
    }

// or (both valid)

/*
public class HelloNewJava{
void main() {
    System.out.println("Hello World! form File2");
}
}
*/

/**

 About source file mode

 Normal Mode:
 Programmer first compiles the .java file to generate a .class file,
 then runs the .class file using the JVM.

 Command:
 javac HelloWorld01.java
 java HelloWorld

 Flow:
 HelloWorld01.java → javac → HelloWorld.class → JVM → main() → Output


 In Evolution in Java we got Source File mode to reduce complexity and time consuming

 Source File Mode:
 Java automatically compiles and runs the .java file in a single command.
 No need to manually create or run the .class file.
 Compiled class file (byte code) saved in Temporary memory instead of visible on screen

 One Command:
 java HelloWorld01.java

 Flow:
 HelloWorld01.java → Automatic Compilation → JVM → main() → Output

**/