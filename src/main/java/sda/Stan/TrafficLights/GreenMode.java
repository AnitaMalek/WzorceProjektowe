package sda.Stan.TrafficLights;

public class GreenMode implements LightState {

    @Override
    public void next(TrafficLight light) {
        System.out.println(" Green light - drive! ");
    }

    @Override
    public void prev(TrafficLight light) {
        System.out.println(" Light switched to yellow mode ");
        light.setLights(new YellowMode());
    }

    @Override
    public void printStatus() {
        System.out.println(" Green light ");

    }
}
