import java.util.Scanner;

/**
 * @author Justin Torres
 * The valid variable calls the 'Validation' class which holds all of the
 * calculator validationd.
 * The math variable calls the 'QuickMaths' calss which does all the
 * calculations in the program
 */

public abstract class CalculatorMain extends QuickMaths {

    static Validation valid = new Validation();

    /**
     * Main method drives the user interface
     * Power is the user input that turns te program on or off. The user can
     * input off at any time to turn it off
     * inputFirst First user input, can input 'help' to pull up the help menu,
     * inputOperator User input Operator. can choose between all operators or
     * phrases in the 'Operators' enum, can input 'help' to pull up
     * the help menu
     * inputSecond Second user input, can input 'help' to pull up the help menu
     */
    public static void main(String[] arg) {

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Calculator is currently OFF, Input ON to start.  ");
            String power = scan.nextLine();

            if (power.equalsIgnoreCase("help")) {
                System.out.println(Operators.HELP.toString());
            }

            while (valid.onOff(power)) {
                System.out.printf("%nCalculator is currently ON%n%n");
                System.out.printf("--* Input 'HELP' to pull up the instructions *--%n%n");
                System.out.println("Enter your first number!  - ");
                String inputFirst = scan.nextLine();

                if (valid.isValidInput(inputFirst)) {
                    System.out.printf("%nWhat operator would you like to use?  - ");
                    String inputOperator = scan.nextLine();
                    if (valid.isOperator(inputOperator)) {
                        System.out.printf("%nEnter your second number!  - ");
                        String inputSecond = scan.nextLine();

                        if (valid.isValidInput(inputSecond)) {
                            System.out.printf("%nThe answer is -  " + quickMaths(inputFirst, inputOperator, inputSecond)
                                    + "%n%n");
                        }
                        if (inputSecond.equalsIgnoreCase("off")) {
                            power = "off";
                        } else if (inputSecond.equalsIgnoreCase("help")) {
                            System.out.println(Operators.HELP.toString());
                        }
                    } else if (inputOperator.equalsIgnoreCase("off")) {
                        power = "off";
                    } else if (inputOperator.equalsIgnoreCase("help")) {
                        System.out.println(Operators.HELP.toString());
                    }
                } else if (inputFirst.equalsIgnoreCase("off")) {
                    power = "off";
                } else if (inputFirst.equalsIgnoreCase("help")) {
                    System.out.println(Operators.HELP.toString());
                }
            }
            if (power.equalsIgnoreCase("off")) {
                System.out.printf("%n%nCalculator is now OFF! Goodbye!");
                scan.close();
                break;
            }
        }
    }
}