package sda.Kompozyt.Pliki;

import java.util.ArrayList;
import java.util.List;

public class Directory extends SystemFile {

    private List<SystemFile> systemFiles = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    @Override
    public void showMe() {
        super.showMe();
       for (SystemFile systemFile: systemFiles){
           systemFile.showMe();
       }
    }

    @Override
    protected String getFileName() {
        return name;
    }

    @Override
    public void addFile(SystemFile systemFile) {
        systemFiles.add(systemFile);
    }

    @Override
    public void removeFile(SystemFile systemFile) {
        systemFiles.remove(systemFile);
    }
}
