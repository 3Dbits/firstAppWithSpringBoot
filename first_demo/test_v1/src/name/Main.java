package name;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.plus(8);
        System.out.println(calculator.getResult());
        calculator.minus(2);
        System.out.println(calculator.getResult());
        calculator.divided(3);
        System.out.println(calculator.getResult());
        calculator.times(2);
        System.out.println(calculator.getResult());

    }
}