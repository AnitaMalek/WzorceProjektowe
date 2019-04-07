package sda.AAAFunctionalInterface.Function.Account;

import java.util.function.Function;

public class AccountParserMain {

    public static void main(String[] args) {

        String name = "Tadeusz" ;
        Function<String,Account> convert = (String str) -> {
            Account account = new Account(str);
            return account;
        };

        Account account = convert.apply(name);
        System.out.println(account);

    }
}
