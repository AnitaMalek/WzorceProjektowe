package sda.AAAFunctionalInterface.Supplier;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class RandomNumberSupplier {

    public static void main(String[] args) {

        Supplier<Integer> getRandomNumber = ()->{
            Random random = new Random();
            int randomValue = random.nextInt(100);
            return randomValue;
        };
        System.out.println("Wylosoana liczba: " + getRandomNumber.get());


        Supplier<List<Integer>> getRandomNumbers = ()-> {
            List<Integer> liczby = new ArrayList<>(10);
            Random random = new Random();

            for (int i=0; i<=10; i++){
                int randomValue = random.nextInt(100);
                liczby.add(randomValue);
            }
            return liczby;
        };
        System.out.println("Wylosowane liczby: " + getRandomNumbers.get());


        Supplier<LocalDate> getActualDate = ()-> {
            LocalDate localDate = LocalDate.now();
            return localDate;
        };
        System.out.println("Aktulna data: " + getActualDate.get());


        Supplier<String> formattedDate = ()-> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String formatDate = formatter.format(LocalDate.now());
            return formatDate;
        };
        System.out.println("Data po formatowaniu: " + formattedDate.get());


        Supplier<String> formattedDate1 = ()-> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE");
            String formatDate1 = formatter.format(LocalDate.now());
            return formatDate1;
        };
        System.out.println("Dzień tygodnia po polsku: " + formattedDate1.get());


        Supplier<DayOfWeek> getDayOfWeek = ()-> {
            DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
            return dayOfWeek;
        };
        System.out.println("Dzień tygodnia po angielsku: " + getDayOfWeek.get());

    }
}
