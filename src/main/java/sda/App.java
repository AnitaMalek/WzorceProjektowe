package sda;

import sda.Iterator.ListWithId;
import sda.Pełnomocnik.DataLoader;
import sda.Pełnomocnik.DataLoaderlpml;
import sda.Pełnomocnik.ProxyDataLoader;
import sda.Strategia.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Iterator;

import static java.awt.Color.white;
import static java.awt.SystemColor.info;

public class App {
    public static void main(String[] args) {

//        Room apartament = new Room.Builder(1, 30)
//                .withBathroom(true)
//                .available(true)
//                .clean(true)
//                .build();

//        AccountService accountService = new AccountService();
//
//        AccountServiceAdapter adapter = new AccountServiceAdapter();
//        adapter.save("jan", "kowalski");

//        RawText rawText = new RawText();
//
//        JavaText javaText = new JavaText(rawText);
//        PHPText phpText = new PHPText(rawText);
//
//
//        System.out.println(rawText.getText());
//
//        System.out.println(javaText.getText());
//
//        System.out.println(phpText.getText());

//        DataLoader plik = new DataLoaderlpml();
//        System.out.println("Object without proxy: ");
//        System.out.println("First access: " + plik.fetchData());
//        System.out.println("Second access: " + plik.fetchData());
//
//        plik = new ProxyDataLoader();
//        System.out.println("Object with proxy: ");
//        System.out.println("First access: " + plik.fetchData());
//        System.out.println("Second access: " +plik.fetchData());

//    public static void main(String[] args) throws IOException, InterruptedException {
//
//
//        ProxyDataLoader proxy = new ProxyDataLoader();
//
//
//        proxy.fetchData();
//
//        Thread.sleep(20000);
//        proxy.fetchData();

//        ListWithId<String> strings = new ListWithId<>();
//    strings.add("abc");
//    strings.add("def");
//    strings.add("ghi");
//
//    printData(strings, "ajdbjn");
//    }

//        private static void printData (Iterator iterator, String info){
//            if (iterator != null) {
//                System.out.println("Dane: " + info);
//                while (iterator.hasNext()) {
//                    System.out.print(iterator.next() + ", ");
//                }
//                System.out.println("");
//                System.out.println("");
//            }
//        }

        TaxContext context = new TaxContext(new TaxEn());

        System.out.println(context.calculateTax(BigDecimal.valueOf(100)));

    }
}






