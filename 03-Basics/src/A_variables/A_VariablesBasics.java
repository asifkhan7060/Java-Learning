// Study : Variable Declaration, Initialization, Reassignment, Constants, Output Methods and Comments in Java

package A_variables;

public class A_VariablesBasics {
    public static void main(String[] args) {

        // Variables are the Containers to store data (a and name is variables below)

        // Declaration
        int a;
        String name;

        // Initialisation
        a = 10;
        name = "Java";

        // Declaration + Initialisation
        int b = 20;

        // OverRiding the Variable
        a = 80;

        // Displaying Output

        // Normal form
        System.out.println(a);
        System.out.println(name);

        // String Template (Old Feature)
        // System.out.println(STR."Hello, \{name}. You are \{b} years old");

        // Traditional String Concatenation
        System.out.println("Hello! " + name + ". You are " + b + " years old");


        // About Constants - If we need a variable that cant be overRide by anyone then we use const keyword with it (i.e final)
        final int CONST_VALUE = 50;
        System.out.println(CONST_VALUE);
        // x = 100;
        // System.out.println(x);     Error : java: cannot assign a value to final variable x


        // Different types of comments :

        // Single Line Comment

        /* Multi Line Comment */

        /** Documentation (JavaDoc) Comment */

    }
}

