package B_OOPs_Principles.D_Polymorphism.CompileTimePolymorphism;

/**
 Polymorphism allows the same method name to perform different actions depending on the situation.

 Method Overloading / Compile-Time Polymorphism / static polymorphism

 Method overloading allows multiple methods with the same name but different parameter lists.
 Java determines which overloaded method to call at compile time based on:

 1. Number of Parameters
 add(int a)
 add(int a, int b)

 2. Data Types of Parameters
 add(int a)
 add(double a)

 3. Order of Parameter Data Types
 add(int a, double b)
 add(double a, int b)
 */

public class Class {

    // 2 Parameters with all int datatype
    public int add(int a, int b) {
        System.out.println("Calling add(int,int)");
        return a + b;
    }

    // 3 parameters with all int datatype
    public int add(int a, int b, int c) {
        System.out.println("Calling add(int,int,int)");
        return a + b + c;
    }

    // 2 parameters with all double datatype
    public double add(double a, double b) {
        System.out.println("Calling add(double,double)");
        return a + b;
    }

    // Different Order of Data Types
    public void add(int a, double b) {
        System.out.println("Calling add(int,double)");
    }

    // Different Order of Data Types
    public void add(double a, int b) {
        System.out.println("Calling add(double,int)");
    }
}