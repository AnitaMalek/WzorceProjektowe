package sda.AAAFunctionalInterface.Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class AccountMain {

    public static void main(String[] args) {
        /*User user = new User(150);
        Consumer <User> accountModifier = (User userToModify)-> {
            userToModify.saldo+=100;
        };
        accountModifier.accept(user);
        Consumer <User> presenter = (User userToDisplay)-> {
            System.out.println("User: " + userToDisplay.saldo);
        };
        presenter.accept(user);*/


        User user = new User(01, "Jan", "Kowalski", 27, Position.DEVELOPER);
        Consumer<User> accountShower = (User userToShow)-> {
            System.out.println("Imie: " + userToShow.getName());
            System.out.println("Nazwisko: " + userToShow.getLastName());
            System.out.println("Wiek: " + userToShow.getAge());
            System.out.println("Zawód: " + userToShow.getPosition());
        };
        accountShower.accept(user);

        Consumer<List<User>> accountsShower = (List<User> usersToShow)-> {
            for (User userToShow : usersToShow) {
                System.out.println("Imie: " + userToShow.getName());
                System.out.println("Nazwisko: " + userToShow.getLastName());
                System.out.println("Wiek: " + userToShow.getAge());
                System.out.println("Zawód: " + userToShow.getPosition());
            }
        };

        List<User> listOfUsers = new ArrayList<>();
        Consumer<User> accountCreator = (User userToCreate)-> {
            listOfUsers.add(userToCreate);
            for (User userToShow : listOfUsers) {
                System.out.println("Imie: " + userToShow.getName());
                System.out.println("Nazwisko: " + userToShow.getLastName());
                System.out.println("Wiek: " + userToShow.getAge());
                System.out.println("Zawód: " + userToShow.getPosition());
            }
        };
        User user1 = new User(1, "Anna", "Janna", 25, Position.DEVELOPER);
        User user2 = new User(2, "Adam", "Małysz", 26, Position.MANAGER);
        User user3 = new User(3, "Ewa", "Mewa", 27, Position.MANAGER);
        User user4 = new User(4, "Jan", "Sian", 28, Position.DEVELOPER);
        accountCreator.accept(user1);
        accountCreator.accept(user2);
        accountCreator.accept(user3);
        accountCreator.accept(user4);
        accountsShower.accept(listOfUsers);


        Consumer<Integer> removeById = (Integer idNumber)-> {
            for (User userToFind : listOfUsers){
                if (userToFind.getId() == idNumber){
                    listOfUsers.remove(userToFind);
                    return;
                }
            }
        };
        removeById.accept(2);
        System.out.println("Po usunieciu");
        accountsShower.accept(listOfUsers);





    }
}
