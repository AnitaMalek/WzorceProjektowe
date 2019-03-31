package sda.Kompozyt.Pliki;

public class Files {

    public static void main(String[] args) {

        //Napisz mechanizm realizujący strukturę drzewiastą przedstawiającą strukturę plików systemowych.
        // Do tego celu wykorzystaj wzorzec projektowy kompozyt:
        //Pojedynczym element (leaf) będzie w tym przypadku plikiem wykonywalnym.
        //Kompozytem będzie natomiast katalogiem który może zawierać wiele plików oraz innych katalogów.
        // Zaimplementuj mechanizm który pozwoli wyświetlić wszystkie pliki systemowe (pliki wykonywalne, katalogi)

        //Klasa abstrakcyjna: SystemFile
        //Obiekt pojedynczy: ExecutableFile - nie możemy dodawać do niego innych obiektów SystemFile
        //Kompozyt: Directory - może zawierać w sobie inne SystemFile

        SystemFile main = new Directory("Root");
        SystemFile multimedia = new Directory("Multimedia");
        main.addFile(new ExecutableFile("Test.txt"));

        multimedia.addFile(new ExecutableFile("t"));
        SystemFile music = new Directory("Music");
        music.addFile(new ExecutableFile("mp3"));
        multimedia.addFile(music);
        SystemFile video = new Directory("Video");
        video.addFile(new ExecutableFile("mp4"));
        multimedia.addFile(video);

        main.addFile(multimedia);

        main.showMe();

    }
}
