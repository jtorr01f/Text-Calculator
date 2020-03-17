/**
 * @author justint
 * @about The Validation class holds all of the calculator validationd.
 */
public class Validation {
    /**
     * @ @param input - User input, on to turn the program on and off to turn it
     *          off.
     * @return Returns a boolean value true = on, false = off.
     */
    public boolean onOff(String input) {
        boolean power = false;
        if (input.equalsIgnoreCase("on")) {
            power = true;
        } else {
            power = false;
        }
        return power;
    }

    /**
     * isValidInput validates whether or not the user input is a valid number.
     *
     * @param input - User input
     * @return Returns a boolean value - true if the user input equals a number,
     *         false if the input is anything else.
     */

    public boolean isValidInput(String input) {
        boolean intValid = false;
        String pi = Operators.PI.toString();
        try {
            if (!input.matches("[0-9.]+")) {
                intValid = false;
            } else {
                intValid = true;
            }

            if (intValid == true || input.equals(pi)) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;

    }

    /**
     * isOperator validates whether or not the user input is a valid operator
     *
     * @param input - User input
     * @return Returns a boolean value, true if the user input is within the Enum
     *         'Operators', false, if its anything else
     */

    public boolean isOperator(String input) {
        String plus = Operators.PLUS.toString();
        String minus = Operators.MINUS.toString();
        String times = Operators.TIMES.toString();
        String divide = Operators.DIVIDED.toString();
        String mod = Operators.MODULUS.toString();
        String root = Operators.ROOT.toString();
        String pow = Operators.POWER.toString();

        if (input.equalsIgnoreCase(plus) || input.equalsIgnoreCase(minus) || input.equalsIgnoreCase(times)
                || input.equalsIgnoreCase(divide) || input.equalsIgnoreCase(mod) || input.equalsIgnoreCase(root)
                || input.equalsIgnoreCase(pow)) {

            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * @param input - User input
     * @return Returns a boolean value, true if the user input 'pi', false if it is
     *         anything else.
     */
    public Double ifPi(String input) {
        String piStr = Operators.PI.toString();
        Double pi = Math.PI;
        Double output = null;
        try {
            if (input.equals(piStr)) {
                output = pi;
                return output;
            } else
                output = Double.parseDouble(input);
        } catch (Exception e) {

        }
        return output;
    }

    /**
     *
     * @param input - User input
     * @return Returns a boolean value, true if the User input 'help', false if
     *         anything else.
     */
    public boolean isHelp(String input) {
        boolean isHelp = false;
        if (input.equalsIgnoreCase("help")) {
            isHelp = true;
        }
        return isHelp;
    }
}