package calculator;

public class Multiplication extends Operation {

    public Multiplication(double number1, double number2) {
        super(number1, number2);
    }

    @Override
    public double calculate() {
        return number1 * number2;
    }
}
