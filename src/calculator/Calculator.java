package calculator;

public class Calculator {
    private double firstNumber;
    private double secondNumber;
    private char operation;
    private double result;

    public Calculator() {
    }

    public Calculator(double firstNumber, double secondNumber, char operation) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operation = operation;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }
    public void result() {
        if (operation == '+') {
            result = firstNumber + secondNumber;
        } else if (operation == '-') {
            result = firstNumber - secondNumber;
        } else if (operation == '*') {
            result = firstNumber * secondNumber;
        } else if (operation == '/') {
            result = firstNumber / secondNumber;
        }
    }
    public double getResult() throws ArithmeticException {
        if (Double.isNaN(result)){
            throw (new ArithmeticException("Nan"));
        }else if (Double.isInfinite(result)){
            throw (new ArithmeticException("Infinite"));
        }
        return result;
    }
}
