package E_OOPsFourPrinciples.C_Polymorphism.CompileTimePolyOverloading;

/**
 * Method Overloading (Compile Time Polymorphism)

 Method Overloading allows multiple methods with the same name but different parameters.
 Java decides which method to call during compilation based on the arguments passed.

 */

public class Calculator {

    // Different Number of Parameters
    public int add(int a, int b) {
        System.out.println("Calling add(int,int)");
        return a + b;
    }

    // Different Number of Parameters
    public int add(int a, int b, int c) {
        System.out.println("Calling add(int,int,int)");
        return a + b + c;
    }

    // Different Data Types
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