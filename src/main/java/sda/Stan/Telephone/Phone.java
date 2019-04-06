package sda.Stan.Telephone;

public class Phone {

    private SoundState status = new VibrationMode();

    public SoundState getStatus() {
        return status;
    }

    public void setStatus(SoundState status) {
        this.status = status;
    }

    public void louderState() {
        status.louder(this);
    }

    public void quieterState() {
        status.quieter(this);
    }

    public void printStatus() {
        status.printStatus();
    }
}
