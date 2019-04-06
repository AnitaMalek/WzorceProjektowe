package sda.Stan.Telephone;

public class QuietMode implements SoundState {

    @Override
    public void louder(Phone phone) {
        System.out.println("Volume set up");
        phone.setStatus(new LoudMode());
    }

    @Override
    public void quieter(Phone phone) {
        System.out.println(" Volume is muted ");

    }

    @Override
    public void printStatus() {
        System.out.println(" Volume quiet");
    }
}
