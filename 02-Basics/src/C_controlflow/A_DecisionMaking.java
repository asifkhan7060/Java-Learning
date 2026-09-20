package C_controlflow;

/**
 ====================================================
 DECISION MAKING IN JAVA
 ====================================================

 Study : Decision Making Statements in Java

 🔹 What Is Decision Making?

 Decision Making allows Java to choose different
 execution paths based on conditions.

 Instead of executing every statement sequentially,
 Java evaluates a condition and decides which block
 of code should be executed.

 Decision Making is one of the most important parts
 of Control Flow because it enables programs to
 make choices and take actions accordingly.


 ====================================================
 Why Decision Making Is Needed?
 ====================================================

 Real-world applications constantly make decisions:

 ✓ Login Validation
 ✓ ATM Operations
 ✓ Voting Eligibility Check
 ✓ Grade Calculation
 ✓ Online Shopping Discounts
 ✓ Banking Transactions

 Without decision making, every statement would
 execute regardless of the situation.


 ====================================================
 Types of Decision Making Statements
 ====================================================

 Java provides the following decision-making
 statements:

 1. if Statement
 Executes code when condition is true.

 2. if-else Statement
 Chooses between two blocks.

 3. else-if Ladder
 Chooses from multiple conditions.

 4. Nested if
 if statement inside another if.

 5. switch Statement
 Selects one option from many choices.


 ====================================================
 How Decision Making Works
 ====================================================

 Step 1:
 A condition is evaluated.

 Step 2:
 If condition is true,
 corresponding block executes.

 Step 3:
 If condition is false,
 another block executes
 or program continues.


 ====================================================
 Example 1 : if Statement
 ====================================================

 int age = 20;

 if(age >= 18)
 {
 System.out.println("Eligible to Vote");
 }

 Output:
 Eligible to Vote


 ====================================================
 Example 2 : if-else Statement
 ====================================================

 int marks = 35;

 if(marks >= 40)
 {
 System.out.println("Pass");
 }
 else
 {
 System.out.println("Fail");
 }

 Output:
 Fail


 ====================================================
 Example 3 : else-if Ladder
 ====================================================

 int marks = 85;

 if(marks >= 90)
 {
 System.out.println("Grade A");
 }
 else if(marks >= 75)
 {
 System.out.println("Grade B");
 }
 else
 {
 System.out.println("Grade C");
 }

 Output:
 Grade B


 ====================================================
 Example 4 : Nested if
 ====================================================

 if(usernameCorrect)
 {
 if(passwordCorrect)
 {
 System.out.println("Login Successful");
 }
 }

 Output:
 Login Successful


 ====================================================
 Example 5 : switch Statement
 ====================================================

 int day = 2;

 switch(day)
 {
 case 1 -> System.out.println("Monday");
 case 2 -> System.out.println("Tuesday");
 }

 Output:
 Tuesday
 */

public class A_DecisionMaking {

    public static void main(String[] args) {

        // Example 1 : if Statement
        int age = 20;

        if (age >= 18) {
            System.out.println("Eligible to Vote");
        }

        // Example 2 : if-else Statement
        int marks = 35;

        if (marks >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // Example 3 : else-if Ladder
        int score = 85;

        if (score >= 90) {
            System.out.println("Grade A");
        } else if (score >= 75) {
            System.out.println("Grade B");
        } else {
            System.out.println("Grade C");
        }

        // Example 4 : Nested if
        boolean usernameCorrect = true;
        boolean passwordCorrect = true;

        if (usernameCorrect) {
            if (passwordCorrect) {
                System.out.println("Login Successful");
            }
        }

        // Example 5 : switch Statement
        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            default:
                System.out.println("Invalid Day");
        }

        // Another Form of Switch case (Arrow Syntax)

        int Day = 2;

        switch(Day) {

            case 1 -> System.out.println("Monday");

            case 2 -> System.out.println("Tuesday");

            case 3 -> System.out.println("Wednesday");

            default -> System.out.println("Invalid Day");
        }

        // Another Form of Switch case (new to ver 25)

        char grade = 'A';

        System.out.println(
                switch (grade) {

                    case 'A' -> "Excellent";

                    case 'B' -> "Very Good";

                    case 'C' -> "Good";

                    case 'D' -> "Average";

                    case 'F' -> "Fail";

                    default -> "Invalid Grade";
                }
        );
    }
}