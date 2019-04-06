package sda.AAAFunctionalInterface.Userr;

import java.util.function.Function;

public class UserrParserMain {

    public static void main(String[] args) {
        String line = "Anita,Malek,99";
        Function<String, Userr> convertUserr = (String lineFromFile)-> {
            String lineArray[] = lineFromFile.split(",");
            String name = lineArray[0];
            String lastName = lineArray[1];
            int age = Integer.valueOf(lineArray[2]);
            Userr userr = new Userr(name, lastName, age);
            return userr;
        };
        Userr userr = convertUserr.apply(line);
        System.out.println(userr);

        Function<Userr, String> convertString = (Userr userFromFile)-> {
            String csv = "";
            csv+=userFromFile.name;
            csv+=",";
            csv+=userFromFile.lastName;
            csv+=",";
            csv+=userFromFile.age;
            return csv;
        };
        String csv = convertString.apply(userr);
        System.out.println(csv);
    }






}
