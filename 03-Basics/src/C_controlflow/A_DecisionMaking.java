package C_controlflow;

/**
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;DECISION MAKING IN JAVA<br>
 * ====================================================<br><br>
 *
 * Study : Decision Making Statements in Java<br><br>
 *
 * 🔹 What Is Decision Making?<br><br>
 *
 * Decision Making allows Java to choose different
 * execution paths based on conditions.<br><br>
 *
 * Instead of executing every statement sequentially,
 * Java evaluates a condition and decides which block
 * of code should be executed.<br><br>
 *
 * Decision Making is one of the most important parts
 * of Control Flow because it enables programs to
 * make choices and take actions accordingly.<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Why Decision Making Is Needed?<br>
 * ====================================================<br><br>
 *
 * Real-world applications constantly make decisions:<br><br>
 *
 * ✓ Login Validation<br>
 * ✓ ATM Operations<br>
 * ✓ Voting Eligibility Check<br>
 * ✓ Grade Calculation<br>
 * ✓ Online Shopping Discounts<br>
 * ✓ Banking Transactions<br><br>
 *
 * Without decision making, every statement would
 * execute regardless of the situation.<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Types of Decision Making Statements<br>
 * ====================================================<br><br>
 *
 * Java provides the following decision-making
 * statements:<br><br>
 *
 * 1. if Statement<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Executes code when condition is true.<br><br>
 *
 * 2. if-else Statement<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Chooses between two blocks.<br><br>
 *
 * 3. else-if Ladder<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Chooses from multiple conditions.<br><br>
 *
 * 4. Nested if<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;if statement inside another if.<br><br>
 *
 * 5. switch Statement<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Selects one option from many choices.<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;How Decision Making Works<br>
 * ====================================================<br><br>
 *
 * Step 1:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;A condition is evaluated.<br><br>
 *
 * Step 2:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;If condition is true,
 * &nbsp;&nbsp;&nbsp;&nbsp;corresponding block executes.<br><br>
 *
 * Step 3:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;If condition is false,
 * &nbsp;&nbsp;&nbsp;&nbsp;another block executes
 * &nbsp;&nbsp;&nbsp;&nbsp;or program continues.<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Example 1 : if Statement<br>
 * ====================================================<br><br>
 *
 * int age = 20;<br><br>
 *
 * if(age >= 18)<br>
 * {<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;System.out.println("Eligible to Vote");<br>
 * }<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Eligible to Vote<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Example 2 : if-else Statement<br>
 * ====================================================<br><br>
 *
 * int marks = 35;<br><br>
 *
 * if(marks >= 40)<br>
 * {<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;System.out.println("Pass");<br>
 * }<br>
 * else<br>
 * {<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;System.out.println("Fail");<br>
 * }<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Fail<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Example 3 : else-if Ladder<br>
 * ====================================================<br><br>
 *
 * int marks = 85;<br><br>
 *
 * if(marks >= 90)<br>
 * {<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Grade A<br>
 * }<br>
 * else if(marks >= 75)<br>
 * {<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Grade B<br>
 * }<br>
 * else<br>
 * {<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Grade C<br>
 * }<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Grade B<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Example 4 : Nested if<br>
 * ====================================================<br><br>
 *
 * if(usernameCorrect)<br>
 * {<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;if(passwordCorrect)<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;{<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Login Successful<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;}<br>
 * }<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Login Successful<br><br>
 *
 *
 * ====================================================<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Example 5 : switch Statement<br>
 * ====================================================<br><br>
 *
 * int day = 2;<br><br>
 *
 * switch(day)<br>
 * {<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;case 1 -> Monday<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;case 2 -> Tuesday<br>
 * }<br><br>
 *
 * Output:<br>
 * &nbsp;&nbsp;&nbsp;&nbsp;Tuesday<br><br>
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