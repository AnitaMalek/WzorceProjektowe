package sda.Stan.TrafficLights;

public class SwitchOffMode implements LightState {


    @Override
    public void next(TrafficLight light) {
        System.out.println("Wyłączam sygnalizator");
        light.disable();
    }

    @Override
    public void prev(TrafficLight light) {
        System.out.println("Włączam sygnalizator");
        light.able();
    }

    @Override
    public void printStatus() {
        System.out.println("Swiatło wyłączone");
    }
}
