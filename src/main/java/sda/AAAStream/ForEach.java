package sda.AAAStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(6, 3);
        for (int i = 0; i < integers.size(); i++) {
            System.out.println("stary v1");
            System.out.println(integers.get(i));
        }
        for (Integer integer : integers) {
            System.out.println("stary v2");
            System.out.println(integer);
        }
        integers.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("stream - Bez lambdy");
                System.out.println(integer);
            }
        });
        integers.stream().forEach((Integer value) -> {
            System.out.println("stream - lambda");
            System.out.println(value);
        });


        List <String> imiona = Arrays.asList("Piotr", "Joanna", "Krzysztof");

        imiona.stream().forEach((String imie) -> {
            System.out.println(imie);
        });

        imiona.stream().forEach((String imie) -> {
            System.out.println(imie.length());
        });

/*        imiona.stream()
        .filter(imionka-> imionka.length()%2 == 0)
        .forEach(System.out::println );
        System.out.println("Imiona o parzystej liczbie znaków");*/

        imiona.stream()
                .forEach((String param) -> {
                    if (param.length() % 2 == 0){
                        System.out.println("Parzysta");
                    }else {
                        System.out.println("Nieparzysta");
                    }
                });

    }
}
