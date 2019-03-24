package sda.Pełnomocnik;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class DataLoaderlpml implements DataLoader {


    @Override
    public void fetchData() throws IOException {
        File file = new File("C:\\Users\\aohaj\\IdeaProjects\\WzorceProjektowe\\src\\main\\resources\\Products.txt");
        List<String> lines = FileUtils.readLines(file, "UTF-8");
        String date = " ";

        for (String str: lines){
            date += str;
        }

        System.out.println(date);
    }


}