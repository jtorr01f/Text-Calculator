/**
 * an interface for all calculations done by the Text Calculator
 * */
public interface QuickMathable {
    public String add(String x, String y);
    public String sub(String x, String y);
    public String multiply(String x, String y);
    public String divide(String x, String y);
    public String mod(String x, String y);
    public String power(String x, String y);
    public String root(String x, String y);
}
