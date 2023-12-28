package seminar4.task4;

public class Calculator {
    private MathOperations mathOperations;

    public Calculator(MathOperations mathOperations) {
        this.mathOperations = mathOperations;
    }

    public int add(int a, int b) {
        return mathOperations.add(a, b);
    }
}