package sda.AAAWyrazeniaLambda.Calculate;

public class CalculatorMain {

    public static void main(String[] args) {

        //Sposób 1:
        Calculator calculator = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };
        calculator.calculate(10, 20);
        testCalculation(calculator, 10, 20);



        //Sposób 2:
        Calculator calculator1 = (int a, int b) -> {
            return (a + b) * 2;
        };
        calculator1.calculate(10, 20);
        testCalculation(calculator1, 10, 20);



        //Spopsób 3:
        testCalculation((int a, int b) -> {
            return (a+b)*3;
        }, 10, 20);
    }

    public static void testCalculation(Calculator calculator, int a, int b) {
            int result = calculator.calculate(a, b);
            System.out.println(result);
        }
    }
