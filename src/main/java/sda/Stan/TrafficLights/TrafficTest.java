package sda.Stan.TrafficLights;

public class TrafficTest {

    public static void main(String[] args) {
        TrafficLight light = new TrafficLight();

        light.printStatus();

        light.nextMode();
        light.printStatus();

        light.prevMode();
        light.printStatus();

        light.nextMode();
        light.printStatus();

        light.disable();
        light.printStatus();

        light.able();

    }
}
