/**
 * This bad boy of an enum is where all the operators live, along with the help menu.
 * */

public enum Operators {
    PLUS, MINUS, TIMES, DIVIDED, MODULUS, ROOT, POWER, HELP, PI;

    @Override
    public String toString() {
        String op = "";
        if (name().equals("PLUS")) {
            op = "+";
        } else if (name().equals("MINUS")) {
            op = "-";
        } else if (name().equals("TIMES")) {
            op = "*";
        } else if (name().equals("DIVIDED")) {
            op = "/";
        } else if (name().equals("MODULUS")) {
            op = "%";
        } else if (name().equals("ROOT")) {
            op = "~";
        } else if (name().equals("POWER")) {
            op = "^";
        } else if (name().equals("PI")) {
            op = "pi";
        } else if (name().equals("HELP")) {
            op = "--- Operators ---%n%n%n"
                    + "+  -  The plus sign will add your 2 numbers together, giving you the sum.\n"
                    + "-  -  The minus sign will subtract the second number from your first\n"
                    + "*  -  The star will multiply your first number by the second\n"
                    + "/  -  The foward slash will divde your first number by the second\n"
                    + "%  -  The percent sign will find the remainder the first number after subracting\n "
                    + "     the second number from it as many times as it can\n"
                    + "~  -  The tilde will got you the root\n"
                    + "^  -  The carrot rais your first number by the power of the second%n%n\n"
                    + "--- Instructions ---\n\n"
                    + "Once the calculator is on, you will be prompted to enter your first number,\n"
                    + "once you do and hit enter the next input you'll do is an operator (See above\n"
                    + "for your available options. Last youll be prompted to enter your last number\n"
                    + "once you do and you select enter, your calculation will appear!\n\n";
        }
        return op;
    }
}
