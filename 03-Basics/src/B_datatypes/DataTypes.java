// Study : Variable Naming Rules, Naming Conventions, Valid & Invalid Identifiers, Constants and Case Sensitivity in Java

package B_datatypes;

/**
 * This program demonstrates Variable Naming Rules and Naming Conventions in Java.<br><br>
 *
 * Variable names are identifiers used to represent memory locations that store data.
 * Java follows specific rules and conventions for naming variables to improve
 * readability, maintainability, and code quality.<br><br>
 *
 * Explanation:<br><br>
 *
 * 1) Case Sensitivity<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Java is a case-sensitive programming language.<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Variables with different letter cases are treated as different identifiers.<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Example:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;int number = 10;<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;int Number = 20;<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Both variables are different because of letter casing.<br><br>
 *
 * 2) First Character Rules<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- A variable name must begin with a letter, underscore (_),
 * or dollar sign ($).<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Starting a variable name with a digit is not allowed.<br><br>
 *
 * 3) Allowed Characters<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- After the first character, a variable name may contain
 * letters, digits, underscores (_), and dollar signs ($).<br><br>
 *
 * 4) Invalid Characters<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Spaces are not allowed in variable names.<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Special characters such as %, #, @, -, etc. are not allowed.<br><br>
 *
 * 5) Reserved Keywords<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Java keywords cannot be used as variable names.<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Examples:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;int class = 1; // Invalid<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;int for = 5;   // Invalid<br><br>
 *
 * 6) Meaningful Variable Names<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Variable names should clearly describe their purpose.<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Preferred:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;studentCount, totalMarks, gearRatio<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Avoid:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;x1, a2, temp123<br><br>
 *
 * 7) Naming Conventions<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Use lowerCamelCase for normal variables.<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Examples:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;studentCount<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;gearRatio<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;totalMarks<br><br>
 *
 * 8) Constant Naming Convention<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Constants are declared using the final keyword.<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Use UPPER_CASE_WITH_UNDERSCORES for constants.<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Example:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;final int MAX_SPEED = 120;<br><br>
 *
 * 9) Valid Variable Name Examples<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- age<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- studentCount<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- _score<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- $total<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- gearRatio<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- MAX_SPEED<br><br>
 *
 * 10) ❌ INVALID Variable Names<br><br>
 *
 * int 1fast = 50; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;// Cannot start with a digit<br>
 * nt student-count = 40; // Hyphen not allowed<br>
 * int total marks = 100; &nbsp;// Spaces not allowed<br>
 * int for = 5; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;// Java keyword<br>
 * int @rate = 10; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;// Special character not allowed<br>
 * int class = 1; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;// Reserved keyword<br><br>
 *
 *
 * 11) Program Output<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- The program prints values stored in valid variables.<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- It demonstrates proper naming conventions and
 * case-sensitivity in Java.<br><br>
 *
 * Key Concepts Covered:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Variable Naming Rules<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Valid and Invalid Identifiers<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Naming Conventions<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Constants<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;- Case Sensitivity
 */




public class DataTypes {

    public static void main(String[] args) {

        // Valid variable names
        int age = 25;
        int studentCount = 100;
        int _score = 95;          // Legal but not recommended
        int $total = 500;         // Legal but not recommended
        int gearRatio = 6;

        // Constant naming convention
        final int MAX_SPEED = 120;

        // Printing valid variables
        System.out.println("Age: " + age);
        System.out.println("Student Count: " + studentCount);
        System.out.println("Gear Ratio: " + gearRatio);
        System.out.println("Max Speed: " + MAX_SPEED);

        /*
         * Invalid variable names
         * Uncomment to see compiler errors
         */

        /*
        int 1fast = 50;           // Cannot start with a digit
        int student-count = 40;  // Hyphen not allowed
        int total marks = 100;   // Spaces not allowed
        int for = 5;             // 'for' is a keyword
        int @rate = 10;          // '@' not allowed
        int class = 1;           // Reserved keyword
        */

        // Example showing case-sensitivity
        int number = 10;
        int Number = 20;

        System.out.println("number = " + number);
        System.out.println("Number = " + Number);
    }
}