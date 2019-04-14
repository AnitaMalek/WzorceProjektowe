package sda.AAAStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapFunction {

    public static void main(String[] args) {

        //wyjaśnienie różnicy map i flatmap:

        /*List<User> users = Arrays.asList(new User("Piotr"), new User("Wacław"));

        users.stream().map(new Function<User, String>() {
            @Override
            public String apply(User user) {
                return user.name;
            }
        });

        List<String> strings = users.stream().flatMap(
                new Function<User, Stream<String>>() {
                    @Override
                    public Stream<String> apply(User user) {
                        return Stream.of(user.name);
                    }
                })*/

        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6));

        System.out.println(list);
        list.stream().flatMap((List<Integer> sublist) -> {
            return sublist.stream();
        }).forEach((Integer number) -> {
            System.out.println(number);
        });

    }
}
