package sda.Kompozyt.Pliki;

public class ExecutableFile extends SystemFile {

public ExecutableFile(String name){
    super(name);
}
    @Override
    protected String getFileName() {
        return name;
    }

    @Override
    public void addFile(SystemFile systemFile) {
        System.out.println("nie mozna wykonac");
    }

    @Override
    public void removeFile(SystemFile systemFile) {
        System.out.println("nie mozna wykonac");
    }
}
