package sda.AAAWyrazeniaLambda.Calculate;

public class CalculatorMain {

    public static void main(String[] args) {
        calculateInt(new Calculator() {
            @Override
            public int calculate(int a, int b) {
                System.out.println(a*b);
                return a*b;
            }
        });
        calculateInt((int a, int b)-> {
            System.out.println(a*b);
            return a*b;
        });

    }

    public static void calculateInt(Calculator calculator){
        calculator.calculate(20, 20);
    }
}
