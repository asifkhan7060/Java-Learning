package B_ClassAndObject;

/**
 * ====================================================
 *                BUILT-IN CLASSES IN JAVA
 * ====================================================
 *
 * Study : Built-In (Predefined) Classes
 *
 * 🔹 What are Built-In Classes?
 *
 * Built-In Classes are classes that are already
 * provided by Java.
 *
 * We do not need to create these classes ourselves.
 * We can directly use them in our programs.
 *
 * Examples:
 *
 * • String
 * • Math
 * • System
 * • File
 * • LocalDate
 * • LocalTime
 * • LocalDateTime
 * • Integer
 * • Double
 * • Scanner
 * • Random
 *
 * ----------------------------------------------------
 *
 * 🔹 Why are they called Built-In Classes?
 *
 * Because they are already built by Java developers
 * and stored inside Java Libraries.
 *
 * Instead of creating everything from scratch,
 * we can use these ready-made classes.
 *
 * ----------------------------------------------------
 *
 * 🔹 String Class Example
 *
 * String name = "Asif";
 *
 * Here:
 * • String is a Built-In Class.
 * • "Asif" is an object of String class.
 *
 * ----------------------------------------------------
 *
 * 🔹 Math Class Example
 *
 * Math.sqrt(25);
 *
 * Here:
 * • Math is a Built-In Class.
 * • sqrt() is a method of Math class.
 *
 * ----------------------------------------------------
 *
 * 🔹 System Class Example
 *
 * System.out.println("Hello");
 *
 * Here:
 * • System is a Built-In Class.
 * • out is an object.
 * • println() is a method.
 *
 * ----------------------------------------------------
 *
 * 🔹 File Class Example
 *
 * File file = new File("data.txt");
 *
 * Here:
 * • File is a Built-In Class.
 * • file is an object of File class.
 * • It is used to create, read, write, and manage files.
 *
 * Common Methods:
 * • createNewFile()
 * • exists()
 * • delete()
 * • getName()
 *
 * ----------------------------------------------------
 *
 * 🔹 Date and Time Classes Example
 *
 * LocalDate date = LocalDate.now();
 *
 * LocalTime time = LocalTime.now();
 *
 * LocalDateTime dateTime = LocalDateTime.now();
 *
 * Here:
 * • LocalDate is a Built-In Class.
 * • LocalTime is a Built-In Class.
 * • LocalDateTime is a Built-In Class.
 * • They are used to work with dates and time.
 *
 * ----------------------------------------------------
 *
 * 🔹 Scanner Class Example
 *
 * Scanner sc = new Scanner(System.in);
 *
 * Here:
 * • Scanner is a Built-In Class.
 * • sc is an object of Scanner class.
 * • It is used to take input from the user.
 *
 * ----------------------------------------------------
 *
 * 🔹 Random Class Example
 *
 * Random random = new Random();
 *
 * Here:
 * • Random is a Built-In Class.
 * • random is an object of Random class.
 * • It is used to generate random values.
 *
 * ----------------------------------------------------
 *
 * 🔹 Wrapper Classes (Data Type Classes)
 *
 * Every primitive data type in Java has a corresponding
 * Built-In Class called a Wrapper Class.
 *
 * Primitive Data Type      Wrapper Class
 *
 * byte                     Byte
 * short                    Short
 * int                      Integer
 * long                     Long
 * float                    Float
 * double                   Double
 * char                     Character
 * boolean                  Boolean
 *
 * Examples:
 *
 * Integer num = 100;
 *
 * Double price = 99.99;
 *
 * Character grade = 'A';
 *
 * Boolean status = true;
 *
 * Here:
 * • Integer is a Built-In Class for int.
 * • Double is a Built-In Class for double.
 * • Character is a Built-In Class for char.
 * • Boolean is a Built-In Class for boolean.
 *
 * These classes provide useful methods for
 * conversion, validation, and manipulation of data.
 *
 * ----------------------------------------------------
 *
 * 🔹 Conclusion
 *
 * Java provides many Built-In Classes.
 * These classes save development time and
 * provide ready-made functionality.
 *
 * Examples:
 * String, Math, System, File,
 * LocalDate, LocalTime, LocalDateTime,
 * Scanner, Random, Integer, Double,
 * Character, Boolean, etc.
 */

import java.io.File;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

public class BuiltInClasses {

    public static void main(String[] args) {

        // ====================================================
        // String Class
        // ====================================================

        String name = "Asif";

        System.out.println("Length : " + name.length());
        System.out.println("Uppercase : " + name.toUpperCase());

        // ====================================================
        // Math Class
        // ====================================================

        System.out.println("Square Root : " + Math.sqrt(25));
        System.out.println("Maximum : " + Math.max(10, 20));

        // ====================================================
        // System Class
        // ====================================================

        System.out.println("Learning OOP");

        // ====================================================
        // File Class
        // ====================================================

        File file = new File("data.txt");

        System.out.println("File Name : " + file.getName());
        System.out.println("File Exists : " + file.exists());

        // ====================================================
        // Date and Time Classes
        // ====================================================

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Date : " + date);
        System.out.println("Time : " + time);
        System.out.println("Date & Time : " + dateTime);

        // ====================================================
        // Scanner Class
        // ====================================================

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name : ");
        String userName = sc.nextLine();

        System.out.println("Welcome " + userName);

        // ====================================================
        // Random Class
        // ====================================================

        Random random = new Random();

        int randomNumber = random.nextInt(100);

        System.out.println("Random Number : " + randomNumber);

        // ====================================================
        // Wrapper Classes
        // ====================================================

        Integer num = 100;
        Double price = 99.99;
        Character grade = 'A';
        Boolean status = true;

        System.out.println("Integer : " + num);
        System.out.println("Double : " + price);
        System.out.println("Character : " + grade);
        System.out.println("Boolean : " + status);

        sc.close();
    }
}
