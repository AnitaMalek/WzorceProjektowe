package sda.Kompozyt.Pliki;

public abstract class SystemFile {

    protected String name;

    public SystemFile (String name) {
        this.name = name;
    }

    protected abstract String getFileName();

    public void showMe(){
        System.out.println("Plik: " + this.getFileName());
    }

    public abstract void addFile(SystemFile systemFile);

    public abstract void removeFile(SystemFile systemFile);


}
