/**
 * QuickMaths is your one stop shop for all your operator needs. This Class implements QuickMathable as the interface.
 * */
public abstract class QuickMaths implements QuickMathable {

    static Validation valid = new Validation();

    public static String quickMaths(String inputFirst, String inputOperator, String inputSecond) {
        Calculations calculations = new Calculations();

        String op = inputOperator;
        String output = null;

        if (op.equals("+")) {
            output = calculations.add(inputFirst, inputSecond);
        } else if (op.equals("-")) {
            output = calculations.sub(inputFirst, inputSecond);
        } else if (op.equals("*")) {
            output = calculations.multiply(inputFirst, inputSecond);
        } else if (op.equals("/")) {
            output = calculations.divide(inputFirst, inputSecond);
        } else if (op.equals("%")) {
            output = calculations.mod(inputFirst, inputSecond);
        } else if (op.equals("~")) {
            output = calculations.root(inputFirst, inputSecond);
        } else if (op.equals("^")) {
            output = calculations.power(inputFirst, inputSecond);
        }
        return output;

    }
}
