package sda;

import sda.Adapter.AccountService;
import sda.Adapter.AccountServiceAdapter;
import sda.Builder.Room;

public class App {
    public static void main( String[] args ) {

//        Room apartament = new Room.Builder(1, 30)
//                .withBathroom(true)
//                .available(true)
//                .clean(true)
//                .build();

        AccountService accountService = new AccountService();

        AccountServiceAdapter adapter = new AccountServiceAdapter();
        adapter.save("jan", "kowalski");

    }
}
