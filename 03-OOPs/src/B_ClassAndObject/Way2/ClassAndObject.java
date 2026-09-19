package B_ClassAndObject.Way2;

public class ClassAndObject {

    // Properties or state
    String brand;
    String colour;
    int speed;

    // Behaviour
    public void drive(){
        System.out.println(brand+" is driving at "+speed);
    }

    public static class ABC {
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


}

// Rule to Note : In Java, if a class is declared as public, the file name must be exactly the same as the public class name.

/**

public class XYZ {         Error : java: class XYZ is public, should be declared in a file named XYZ.java
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