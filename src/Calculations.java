/**
 * @see QuickMathable
 * */

public class Calculations implements QuickMathable {

    @Override
    public String add(String firstInput, String secondInput) {
        Double answer;
        answer = Double.parseDouble(firstInput) + Double.parseDouble(secondInput);
        return answer.toString();
    }

    @Override
    public String sub(String firstInput, String secondInput) {
        Double answer;
        answer = Double.parseDouble(firstInput) - Double.parseDouble(secondInput);
        return answer.toString();
    }

    @Override
    public String multiply(String firstInput, String secondInput) {
        Double answer;
        answer = Double.parseDouble(firstInput) * Double.parseDouble(secondInput);
        return answer.toString();
    }

    @Override
    public String divide(String firstInput, String secondInput) {
        Double answer;
        answer = Double.parseDouble(firstInput) / Double.parseDouble(secondInput);
        return answer.toString();
    }

    @Override
    public String power(String firstInput, String secondInput) {
        Double answer;
        answer = Math.pow(Double.parseDouble(firstInput), Double.parseDouble(secondInput));
        return answer.toString();
    }
    @Override
    public String mod(String firstInput, String secondInput) {
        Double answer;
        answer = Double.parseDouble(firstInput) % Double.parseDouble(secondInput);
        return answer.toString();
    }

    @Override
    public String root(String firstInput, String secondInput) {
            Double answer;
            answer = Math.pow(Double.parseDouble(firstInput), 1 / Double.parseDouble(secondInput));
            return answer.toString();
    }
}

