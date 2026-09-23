package B_OOPs_Principles.D_Polymorphism.CompileTimePolymorphism;

public class Objects {

    public static void main(String[] args) {

        // Creating Object
        Class calc = new Class();

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
         public void add(int a)
         public void add(int b)

         Java treats both methods as: add(int)

         Parameter names do not matter when identifying overloaded methods.

         Therefore, both methods have the same parameter list and cannot be overloaded.
         */
    }

}
