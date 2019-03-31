package sda.Kompozyt.Pliki;

public class Files {

    public static void main(String[] args) {
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
