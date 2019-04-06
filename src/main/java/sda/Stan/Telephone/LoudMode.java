package sda.Stan.Telephone;

public class LoudMode implements SoundState{

    @Override
    public void louder(Phone phone) {
        System.out.println(" Volume on maximum level ");
    }

    @Override
    public void quieter(Phone phone) {
        System.out.println("Volume set down");
        phone.setStatus(new QuietMode());
    }

    @Override
    public void printStatus() {
        System.out.println(" Volume loud");
    }
}
