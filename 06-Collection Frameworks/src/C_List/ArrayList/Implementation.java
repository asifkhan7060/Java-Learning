package C_List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// In Which areas list interface are used ?
// Hold ctrl and move cursor to List keyword -> go to that file hold again ctrl and move to list and click -> dropdown project files and keep All Places to see where list are implemented

public class Implementation {
    static void main() {

        // Uncontrolled Datatypes (Without TypeSafety - default Object)
        List<Object> users = new ArrayList<>(); // or List users = new ArrayList<>();
        users.add("Alice");
        users.add(1);

        // Using For Each
        for (Object user : users){
            System.out.println("Using For Each: "+user);
        }

        System.out.println();


        //Controlled Datatypes (Applying Concept of Generics <>)
        ArrayList<String> users1 = new ArrayList<>(); // List or ArrayList Both can use as reference datatype but List keyword cant use at object creation (i.e after a new keyword)
        users1.add("Rudra");
        users1.add("Haya");
        users1.add("Arman");
        users1.add("Arman"); // Duplicates Allowed
        // users1.add(1); // Shows error

        // Using For Each
        for (String user : users1){  // Object also can be used but if we know confirmed datatype then this recommended
            System.out.println("User: "+user); // Output is ordered
        }

        // Using For
        for (int i = 0; i < users1.size(); i++) {
            System.out.println("Using For loop: "+users1.get(i));
        }

        // Iterator
        int a=0;
        Iterator<String> it = users1.iterator();
        while (it.hasNext()){
            System.out.println("Using Iterator [" +a+ "]:"+it.next());
            a++;
        }

        // Work with Class
        Car car1 = new Car("BMW",900);

        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(new Car("Toyota",500));

        System.out.println("All Cars");
        for (Car car : carList){
            System.out.println("Brand: "+car.brand+", Speed: "+car.speed);
        }

        System.out.println(carList); //Need to implement to String method to get clear values instead Garbage Values


        System.out.println("Collections Methods that Used by List");
        // ArrayList is a Class that implements List interface
        // List extends Collection, therefore ArrayList inherits all Collection methods.

        ArrayList<Integer> nums = new ArrayList<>(); // or List<Integer> nums = new ArrayList<>();

        // add()
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);

        System.out.println("After add(): " + nums);

        // size()
        System.out.println("Size : " + nums.size());

// contains()
        System.out.println("Contains 20 ? " + nums.contains(20));
        System.out.println("Contains 100 ? " + nums.contains(100));

// isEmpty()
        System.out.println("Is Empty ? " + nums.isEmpty());

// remove(Object)
        nums.remove(Integer.valueOf(20)); // Removes element 20
        System.out.println("After remove(20): " + nums);

// addAll()
        ArrayList<Integer> other = new ArrayList<>();

        other.add(50);
        other.add(60);

        nums.addAll(other);

        System.out.println("After addAll(): " + nums);
        System.out.println("Other List : " + other);

// containsAll()
        System.out.println(
                "Contains All (50 & 60)? " + nums.containsAll(other)
        );

// equals()
        ArrayList<Integer> compareList = new ArrayList<>();

        compareList.add(10);
        compareList.add(30);
        compareList.add(40);
        compareList.add(50);
        compareList.add(60);

        System.out.println("\ncompareList : " + compareList);
        System.out.println("nums : " + nums);

        System.out.println("equals() ? " + nums.equals(compareList));

// hashCode()
        System.out.println("nums hashCode : " + nums.hashCode());
        System.out.println("compareList hashCode : " + compareList.hashCode());

// toArray()
        Object[] arr = nums.toArray();

        System.out.println("\nArray Elements");

        for (Object obj : arr) {

            System.out.println(obj);

        }

// toArray(T[] a)
        Integer[] typedArray = nums.toArray(new Integer[0]);

        System.out.println("\nTyped Array Elements");

        for (Integer value : typedArray) {

            System.out.println(value);

        }

// stream()

        System.out.println("\nUsing stream()");

        nums.stream().forEach(System.out::println);

// parallelStream()

        System.out.println("\nUsing parallelStream()");

        nums.parallelStream().forEach(System.out::println);

// retainAll()

        ArrayList<Integer> retainDemo = new ArrayList<>();

        retainDemo.add(10);
        retainDemo.add(50);

        System.out.println("\nItems in nums : " + nums);
        System.out.println("Items in retainDemo : " + retainDemo);

        nums.retainAll(retainDemo);

        System.out.println("After retainAll(): " + nums);

// removeAll()

        nums.add(100);
        nums.add(200);

        System.out.println("\nBefore removeAll() nums : " + nums);
        System.out.println("retainDemo : " + retainDemo);

        nums.removeAll(retainDemo);

        System.out.println("After removeAll(): " + nums);

// clear()

        nums.clear();

        System.out.println("\nAfter clear(): " + nums);

// isEmpty()

        System.out.println("Is Empty ? " + nums.isEmpty());
    }


}

class Car {
    String brand;
    int speed;

    Car(String brand,int speed){
        this.brand = brand;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                '}';
    }
}
