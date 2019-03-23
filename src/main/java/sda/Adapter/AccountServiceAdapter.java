package sda.Adapter;

import java.util.Random;

public class AccountServiceAdapter {

    private AccountService accountService;

    public void save(String name, String lastName) {
        accountService.saveUser(name, lastName, getRandomDigits(4), getRandomDigits(9), true);
    }

    private String getRandomDigits(int size) {
        Random random = new Random();
        String value = "";

        for (int i = 0; i < size; i++) {
            int randomValue = random.nextInt(10);
            value += randomValue;
        }
        return value;
    }

}
