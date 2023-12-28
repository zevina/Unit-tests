package seminar4.task4;

public class DummyMathOperations implements MathOperations {
    @Override
    public int add(int a, int b) {
// В данном случае, фиктивный объект не выполняет никаких операций и всегда возвращает 0.
        return 0;
    }
}