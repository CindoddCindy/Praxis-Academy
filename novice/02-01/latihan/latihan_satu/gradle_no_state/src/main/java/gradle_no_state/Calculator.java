package gradle_no_state;

public class Calculator {

    private int initVal = 5;
    public int sum(int a) {
       return initVal + a;
    }
    public int sum(int a, int b) {
       return a + b;
    }
}