// Study : Variable Naming Rules, Naming Conventions, Valid & Invalid Identifiers, Constants and Case Sensitivity in Java

package A_variables;

/**
 Naming Rules and Naming Conventions in Java.

 Variable names are identifiers used to represent variables that store data.
 Java follows specific rules and conventions for naming variables to improve
 readability, maintainability, and code quality.

 Explanation:

 1) Case Sensitivity

 - Java is a case-sensitive programming language.
 - Variables with different letter cases are treated as different identifiers.
 - Example:
 int number = 10;
 int Number = 20;
 - Both variables are different because of letter casing.

 2) First Character Rules

 - A variable name must begin with a letter, underscore (_) or dollar sign ($).
 - Starting a variable name with a digit is not allowed.

 3) Allowed Characters

 - After the first character, a variable name may contain letters, digits,
 underscores (_) and dollar signs ($).

 4) Invalid Characters

 - Spaces are not allowed in variable names.
 - Special characters such as %, #, @, -, etc. are not allowed.

 5) Reserved Keywords

 - Java keywords cannot be used as variable names.
 - Examples:
 int class = 1;   // Invalid
 int for = 5;     // Invalid

 6) Meaningful Variable Names

 - Variable names should clearly describe their purpose.

 Preferred:
 studentCount
 totalMarks
 gearRatio

 Avoid:
 x1
 a2
 temp123

 7) Naming Conventions

 - Use lowerCamelCase for normal variables.
 - Examples:
 studentCount
 gearRatio
 totalMarks

 8) Constant Naming Convention

 - Constants are declared using the final keyword.
 - Use UPPER_CASE_WITH_UNDERSCORES for constants.
 - Example:
 final int MAX_SPEED = 120;

 9) Valid Variable Name Examples

 - age
 - studentCount
 - _score
 - $total
 - gearRatio
 - MAX_SPEED

 10) INVALID Variable Names

 int 1fast = 50;           // Cannot start with a digit
 int student-count = 40;   // Hyphen not allowed
 int total marks = 100;    // Spaces not allowed
 int for = 5;              // 'for' is a Java keyword
 int @rate = 10;           // '@' is not allowed
 int class = 1;            // 'class' is a Java keyword

 11) Program Output

 - The program prints values stored in valid variables.
 - It demonstrates proper naming conventions and case sensitivity in Java.

 Key Concepts Covered:

 - Variable Naming Rules
 - Valid and Invalid Identifiers
 - Naming Conventions
 - Constants
 - Case Sensitivity
 */


public class B_VariableNamingRules {

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
        Invalid variable names
        Uncomment one or more lines to see compiler errors.

        int 1fast = 50;           // Cannot start with a digit
        int student-count = 40;   // Hyphen not allowed
        int total marks = 100;    // Spaces not allowed
        int for = 5;              // 'for' is a Java keyword
        int @rate = 10;           // '@' is not allowed
        int class = 1;            // 'class' is a Java keyword
        */

        // Example showing case sensitivity
        int number = 10;
        int Number = 20;

        System.out.println("number = " + number);
        System.out.println("Number = " + Number);
    }
}