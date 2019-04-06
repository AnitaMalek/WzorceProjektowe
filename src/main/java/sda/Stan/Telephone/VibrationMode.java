package sda.Stan.Telephone;

public class VibrationMode implements SoundState {

    @Override
    public void louder(Phone phone) {
        System.out.println("Volume set up");
        phone.setStatus(new LoudMode());
    }

    @Override
    public void quieter(Phone phone) {
        System.out.println("Volume set down");
        phone.setStatus(new QuietMode());
    }

    @Override
    public void printStatus() {
        System.out.println(" Vibration mode ");

    }
}
