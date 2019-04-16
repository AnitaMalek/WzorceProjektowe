package sda.AAAStream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Filter {

    public static void main(String[] args) {
        List <Integer> values = Arrays.asList(12, 13, 16);

        values.stream()
                .filter((Integer value) -> {
                    return value%2 == 1;
                })
                .forEach((Integer value) -> {
                    System.out.println("Element nieparzysty: " + value);
                })  ;

        values.stream()
                .filter((Integer value) -> {
                    return value%2 == 0;
                })
                .forEach((Integer value) -> {
                    System.out.println("Element parzysty: " + value);
                });

        List<Rectangle> users = Arrays.asList(new Rectangle(4,4), new Rectangle(6,8));

        users.stream()
                .map((Rectangle rectangle) -> {
                    int pole =  rectangle.a * rectangle.b;
                    Pair pair = new Pair(pole, rectangle);
                    return pair;
                })
                .filter((Pair para) -> {
                    return para.pole > 30;
                })
                .forEach((Pair para) -> {
                    System.out.println("Prostokąty o polach większych niż 30: " + para.rectangle);
                });

        users.stream()
                .filter((Rectangle r) -> {
                   return r.a == r.b;
                })
                .forEach((Rectangle r) -> {
                    System.out.println("Prostokąty o bokach tej samej długości: " + r);
                });
    }

    static class Pair {
        int pole;
        Rectangle rectangle;


        public Pair(int pole, Rectangle rectangle) {
            this.pole = pole;
            this.rectangle = rectangle;
        }
    }

    static class Rectangle {
        int a;
        int b;

        public Rectangle(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public String toString() {
            return "Rectangle{" +
                    "a=" + a +
                    ", b=" + b +
                    '}';
        }
    }
}
