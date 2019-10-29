package gradle_pure_function;


public class ObjectWithPureFunction{

    private int value = 0;

    public int add(int nextValue) {
        this.value += nextValue;
        return this.value;
    }

    public int sum(int a, int b) {
        return a + b;
    }
}
