package sda;

import sda.Adapter.AccountService;
import sda.Adapter.AccountServiceAdapter;
import sda.Builder.Room;
import sda.Dekorator.JavaText;
import sda.Dekorator.PHPText;
import sda.Dekorator.RawText;

public class App {
    public static void main( String[] args ) {

//        Room apartament = new Room.Builder(1, 30)
//                .withBathroom(true)
//                .available(true)
//                .clean(true)
//                .build();

//        AccountService accountService = new AccountService();
//
//        AccountServiceAdapter adapter = new AccountServiceAdapter();
//        adapter.save("jan", "kowalski");

        RawText rawText = new RawText();

        JavaText javaText = new JavaText(rawText);
        PHPText phpText = new PHPText(rawText);


        System.out.println(rawText.getText());

        System.out.println(javaText.getText());

        System.out.println(phpText.getText());
    }
}
