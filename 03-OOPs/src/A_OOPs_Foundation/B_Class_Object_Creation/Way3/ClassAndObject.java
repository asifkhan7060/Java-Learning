package A_OOPs_Foundation.B_Class_Object_Creation.Way3;

// Way 3 — Nested Static Class (⚠️ Usually avoid - Use Only when the nested-class relationship itself is meaningful)

// Top level Class - Cant be Static
public class ClassAndObject {

    // Properties or state
    String brand;
    String colour;
    int speed;

    // Behaviour
    public void drive(){
        System.out.println(brand+" is driving at "+speed);
    }

    // Nested Class - Can be static or non-static
    // Here, it is static so ABC does not require a ClassAndObject object
    static class ABC {   // public keyword can be added - not compulsory
        public static void main(String[] args) {

            // if static keyword removed from ABC class
            /**
            // Creating ClassAndObject object
            ClassAndObject outer = new ClassAndObject();

            // Creating ABC object
            ClassAndObject.ABC abc = outer.new ABC();
             */

            // Creating car object
            ClassAndObject car1 = new ClassAndObject();

            // Process of Instantiation
            car1.brand = "BMW";
            car1.colour = "Red";
            car1.speed = 100;

            car1.drive();
        }
    }


}

/**

 Error : java: class XYZ is public, should be declared in a file named XYZ.java

public class XYZ {
    public static void main() {

        // Creating car object
        ClassAndObject car1 = new ClassAndObject();

        // Process of Instantiation
        car1.brand = "BMW";
        car1.colour = "Red";
        car1.speed = 100;

        car1.drive();
    }
}

 */