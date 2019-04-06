package sda.Pełnomocnik;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

import java.util.List;

//public class ProxyDataLoader implements DataLoader {

//    private DataLoaderlpml data;
//    private int counter = 0;
//    private List<String> lists;
//    private LocalDateTime time = LocalDateTime.now();
//
//
//    @Override
//    public void fetchData() throws IOException {
//        Duration d = Duration.between(time,LocalDateTime.now());
//
//        if(d.getSeconds() > 10 || counter == 0) {
//
//            File file = new File("C:\\Users\\aohaj\\IdeaProjects\\WzorceProjektowe\\src\\main\\resources\\Products.txt");
//            lists = FileUtils.readLines(file, "UTF-8");
//
//            time = LocalDateTime.now();
//
//            counter ++;
//            System.out.println("Wyswietlam nowe dane");
//        }else{
//            System.out.println( "Wyswietlam stare dane");
//        }
//
//        show();
//    }
//
//    public void show(){
//        String date = " ";
//
//        for (String str: lists){
//            date += str;
//        }
//
//        System.out.println(date);
//
//    }

//}