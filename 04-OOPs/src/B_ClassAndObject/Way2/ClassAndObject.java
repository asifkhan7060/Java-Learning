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
