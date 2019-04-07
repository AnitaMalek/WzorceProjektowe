package sda.AAAFunctionalInterface.Predicate;

import sda.AAAFunctionalInterface.Function.Userr.Userr;

import java.time.LocalDate;
import java.time.Year;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<Integer> predicate = (Integer value)-> {
            if (value>0){
                return true;
            } else {
                return false;
            }
        };
        System.out.println("Czy większe niż 0? :" + predicate.test(5));


        Predicate<Integer> predicateIfIsEven = (Integer value)-> {
            if (value%2 == 0) {
                return true;
            } else {
                return false;
            }
        };
        System.out.println("Czy liczba jest parzysta?: " + predicateIfIsEven.test(5));


        Predicate<LocalDate> predicateIfIsLeapYear = (LocalDate date)-> {
            if (date.getYear()%4 == 0) {
                return true;
            } else {
                return false;
            }
        };
        System.out.println("Czy jest przestępny?: " + predicateIfIsLeapYear.test(LocalDate.now()));


        Predicate<LocalDate> localDatePredicate  = (LocalDate date) -> {
            if (Year.isLeap(date.getYear())){
                return true;
            } else {
                return false;
            }
        };
        System.out.println("Czy jest przestępny?: " + localDatePredicate.test(LocalDate.of(2020, 8, 30)));


        Userr userr = new Userr("anna", "kowlaska", 17);
        Predicate<Userr> predicateIfIsAdult = (Userr age)-> {
            if (userr.getAge() >= 18) {
                return true;
            } else {
                return false;
            }
        };
        System.out.println("Czy użytkownik jest pełnoletni?: " + predicateIfIsAdult.test(userr));


        Predicate<String> predicateIfNumberIsCorrect = (String number)-> {
            String numberPart = number.substring(3);
            long numberInt;
            try {
                numberInt = Long.parseLong(numberPart);
            }catch (NumberFormatException e) {
                numberInt = -1;
            }
            if (number.startsWith("+48") && number.length()== 12 && numberInt != -1){
                return true;
            } else {
                return false;
            }
        };
        System.out.println("Czy numer jest poprawny?: " + predicateIfNumberIsCorrect.test("+48500521522"));
    }
}
