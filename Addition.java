package calculator;

public class Addition extends Operation {

    public Addition(double number1, double number2) {
        super(number1, number2);
    }

    @Override
    public double calculate() {
        return number1 + number2;
    }
}
