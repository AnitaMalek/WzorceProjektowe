package sda.Stan.TrafficLights;

public class YellowMode implements LightState {

    @Override
    public void next(TrafficLight light) {
        System.out.println(" Light switched to green mode ");
        light.setLights(new GreenMode());
    }

    @Override
    public void prev(TrafficLight light) {
        System.out.println(" Light switched to red mode ");
        light.setLights(new RedMode());
    }

    @Override
    public void printStatus() {
        System.out.println(" Yellow light - be ready to change action");
    }
}
