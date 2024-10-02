package calculator;

public class Calculator {

    public double executeOperation(String operation, double num1, double num2) {
        Operation op = null;

        switch (operation.toLowerCase()) {
            case "add":
                op = new Addition(num1, num2);
                break;
            case "subtract":
                op = new Subtraction(num1, num2);
                break;
            case "multiply":
                op = new Multiplication(num1, num2);
                break;
            case "divide":
                op = new Division(num1, num2);
                break;
            default:
                throw new UnsupportedOperationException("Invalid operation.");
        }

        return op.calculate();
    }
}
