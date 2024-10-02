package calculator;

public class Division extends Operation {

    public Division(double number1, double number2) {
        super(number1, number2);
    }

    @Override
    public double calculate() {
        if (number2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return number1 / number2;
    }
}
