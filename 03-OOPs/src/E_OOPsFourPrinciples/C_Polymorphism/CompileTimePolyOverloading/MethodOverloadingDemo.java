package E_OOPsFourPrinciples.C_Polymorphism.CompileTimePolyOverloading;

public class MethodOverloadingDemo {


    public static void main(String[] args) {

        // Creating Object
        Calculator calc = new Calculator();

        /**

         Compile Time Polymorphism:

         Java determines which overloaded method should execute during compilation by checking:
         1. Number of Parameters
         2. Data Types
         3. Order of Data Types

         */

        // Calls add(int,int)
        System.out.println(calc.add(10, 20));

        System.out.println();

        // Calls add(int,int,int)
        System.out.println(calc.add(10, 20, 30));

        System.out.println();

        // Calls add(double,double)
        System.out.println(calc.add(10.5, 20.5));

        System.out.println();

        // Calls add(int,double)
        calc.add(10, 20.5);

        System.out.println();

        // Calls add(double,int)
        calc.add(10.5, 20);

        /**

         Not Allowed:

         * public void add(int a)
         * public void add(int b)

         Error shows as:
         * Duplicate Method

         Because Java only checks:
         * add(int)
         * add(int)
         Parameter names do not matter.

         */
    }

}
