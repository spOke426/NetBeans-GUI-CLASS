package CLASSES;

public class Operate {
    
    private double num1;
    private double num2;
    
    public Operate() {
        num1 = 0;
        num2 = 0;
    }
    public Operate(double x, double y) {
        num1 = x;
        num2 = y;
    }
    public double getnum1() {
        return num1;
    }
    public double getnum2() {
    return num2;
    }
    public void setnum1(double x) {
    num1 = x;
    }
    public void setnum2(double y) {
    num2 = y;
    }
    public double calc_add() {
    return num1 + num2;
    }
    public double calc_minus() {
    return num1 - num2;
    }
    public double calc_multiply() {
    return num1 * num2;
    }
    public double calc_divide() {
    return num1 / num2;
    }
    
}
