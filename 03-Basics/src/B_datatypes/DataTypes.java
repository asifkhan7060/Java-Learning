package B_datatypes;


/**
     * ====================================================<br>
     * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;DATA TYPES IN JAVA (Summary)<br>
     * ====================================================<br><br>
     *
     * 🔹 What Are Data Types?<br><br>
     *
     * A data type defines what kind of data a variable can store.<br><br>
     *
     * Example:<br>
     * &nbsp;&nbsp;&nbsp;&nbsp;int age = 25; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;→ age is an integer<br>
     * &nbsp;&nbsp;&nbsp;&nbsp;String name = "Faisal"; → name is text<br><br>
     *
     * 💡 Think of a data type as the "shape" or "category" of data.<br><br>
     *
     * ====================================================<br>
     * &nbsp;&nbsp;&nbsp;&nbsp;Categories of Data Types in Java<br>
     * ====================================================<br><br>
     *
     * 💡 1. Primitive Data Types (8 Total)<br><br>
     *
     * These are the most basic data types and are stored directly in memory.<br><br>
     *<pre>
     *  Type      Size              Example
     *  ------------------------------------------
     *  byte      8-bit             byte b = 10;
     *  short     16-bit            short s = 200;
     *  int       32-bit            int age = 25;
     *  long      64-bit            long views = 1000000L;
     *  float     32-bit Decimal    float pi = 3.14f;
     *  double    64-bit Decimal    double price = 99.99;
     *  char      16-bit Unicode    char grade = 'A';
     *  boolean   true / false      boolean isActive = true;
     *  </pre>
     *
     *
     *
     * 💡 2. Non-Primitive Data Types<br><br>
     *
     * Examples:<br>
     * &nbsp;&nbsp;&nbsp;&nbsp;- String<br>
     * &nbsp;&nbsp;&nbsp;&nbsp;- Arrays<br>
     * &nbsp;&nbsp;&nbsp;&nbsp;- Classes<br>
     * &nbsp;&nbsp;&nbsp;&nbsp;- Interfaces<br><br>
     *
     * These data types are created by Java or by the programmer.<br><br>
     *
     * ====================================================<br>
     *
     * ✅ Primitive Data Types<br>
     * &nbsp;&nbsp;&nbsp;&nbsp;- byte<br>
     * &nbsp;&nbsp;&nbsp;&nbsp;- short<br>
     * &nbsp;&nbsp;&nbsp;&nbsp;- int<br>
     * &nbsp;&nbsp;&nbsp;&nbsp;- long<br>
     * &nbsp;&nbsp;&nbsp;&nbsp;- float<br>
     * &nbsp;&nbsp;&nbsp;&nbsp;- double<br>
     * &nbsp;&nbsp;&nbsp;&nbsp;- char<br>
     * &nbsp;&nbsp;&nbsp;&nbsp;- boolean<br><br>
     *
     * ✅ Non-Primitive Data Types<br>
     * &nbsp;&nbsp;&nbsp;&nbsp;- String<br>
     * &nbsp;&nbsp;&nbsp;&nbsp;- Arrays<br>
     * &nbsp;&nbsp;&nbsp;&nbsp;- Classes<br>
     * &nbsp;&nbsp;&nbsp;&nbsp;- Interfaces<br><br>
     *
     * ====================================================
     */

    /*

    Type      Size      Range                                         Default Value
    -------------------------------------------------------------------------------------
    byte      1 byte    -128 to 127                                      0

    short     2 bytes   -32,768 to 32,767                                0

    int       4 bytes   -2,147,483,648 to 2,147,483,647                  0

    long      8 bytes   -9,223,372,036,854,775,808 to
                        9,223,372,036,854,775,807                        0L

    float     4 bytes   ±3.4E−38 to ±3.4E+38                             0.0f

    double    8 bytes   ±1.7E−308 to ±1.7E+308                           0.0d

    char      2 bytes   0 to 65,535 (Unicode Characters)                 '\u0000'

    */

    public class DataTypes {

        public static void main(String[] args) {

            // Primitive Data Types
            char grade = 'A';
            boolean isActive = false;
            System.out.println(grade);
            System.out.println(isActive);

            byte b1 = 127;
            System.out.println(b1);

            float pi = 3.1483467575376975f; // f indication is compulsory
            double price = 99.9938637463476370567;
            System.out.println(pi); // less precise
            System.out.println(price); // more precise

            // Unicode Character Example
            char unicodeDemo = '\u20AC'; // Euro Symbol (€) (Always use single quote)
            System.out.println(unicodeDemo);
            // More unicodes : https://en.wikipedia.org/wiki/List_of_Unicode_characters

            // Non-Primitive Data Type
            String name = "Java";
            System.out.println(name);

            // Arrays (Non-Primitive Data Type)
            float[] marks = {1, 2, 3, 4};

            // System.out.println(marks); Gives garbage value
            System.out.println(marks[0]);
            System.out.println(marks[2]);
            // System.out.println(marks[8]);  Error : Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException

        }
    }
