package name;

public class Calculator {

    private int result;

    public Calculator() {
    }

    public Calculator(int result) {
        this.result = result;
    }

    public void plus(int a) {
        this.result = this.result + a;
    }

    public void minus(int a) {
        this.result = this.result - a;
    }

    public void times(int a) {
        this.result = this.result * a;
    }

    public void divided(int a) {
        this.result = this.result / a;
    }

    @Override
    public String toString() {
        return "" + result;
    }

    public int getResult() {
        return result;
    }
}
