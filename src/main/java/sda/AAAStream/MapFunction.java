package sda.AAAStream;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class MapFunction {

    public static void main(String[] args) {

        List <String> names = Arrays.asList("PiOTr", "joANNa", "krzYsztof");

        names.stream()
                .map(name -> name.toUpperCase())
                .forEach((String names1)-> {
                    System.out.println(names1);
                });

        List <Integer> numbers = Arrays.asList(10, 200, 300);

        numbers.stream()
                .map(number -> number + (10))
                .forEach((Integer numbers1)-> {
                    System.out.println(numbers1);
                });

        List <String> times = Arrays.asList("12:34", "07:07");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        times.stream()
                .map(time -> LocalTime.parse(time, formatter))
                .forEach((LocalTime times1) -> {
                    System.out.println(times1);
                });

        List<Cars> cars = Arrays.asList(new Cars("VW", 250), new Cars("Audi", 300));

        cars.stream().map((Cars samochod) -> {
            return samochod.getSpeed();
        })
                .forEach((Integer speeds) -> {
                    System.out.println(speeds);
                });

    }
}


