package sda.AAAFunctionalInterface.Function.Userr;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        Function<Integer, String> convertNumber = (Integer liczba) -> {
            if (liczba % 2 == 0) {
                return "parzysta";
            } else {
               return "nieparzysta";
            }
        };
        System.out.println(convertNumber.apply(8));


        Function<Double, Double> convertTemperature = (Double celsjusz)-> {
            Double kelwin = celsjusz*274.15;
            return kelwin;
        };
        System.out.println("Kelwiny: " + convertTemperature.apply(1.0));






    }

}
