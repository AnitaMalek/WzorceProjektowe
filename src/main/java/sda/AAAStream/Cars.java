package sda.AAAStream;

public class Cars {

    private String carName;

    private int speed;

    public Cars(String carName, int speed) {
        this.carName = carName;
        this.speed = speed;
    }

    public String getCarName() {
        return carName;
    }

    public int getSpeed() {
        return speed;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
