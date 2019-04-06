package sda.AAAFunctionalInterface.User;

import java.util.function.Function;

public class UserParserMain {

    public static void main(String[] args) {
        String line = "Piotr;Brzozowski;Szczecin";
        Function<String, User> convertUser = (String lineFromFile) -> {
            String lineArray[] = lineFromFile.split(";");
            String name = lineArray[0];
            String lastName = lineArray[1];
            String city = lineArray[2];
            User user = new User(name, lastName, city);
            return user;
        };
        User user = convertUser.apply(line);
        System.out.println(user);
    }
}
