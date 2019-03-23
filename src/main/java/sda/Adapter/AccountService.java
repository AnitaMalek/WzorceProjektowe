package sda.Adapter;

import java.util.ArrayList;
import java.util.List;

public class AccountService {

    private List<Account> accounts = new ArrayList<>();

    public void saveUser(String name, String lastName, String pin, String phoneNumber, boolean active){
        accounts.add(new Account(name, lastName, pin, phoneNumber, active));
    }

    }
