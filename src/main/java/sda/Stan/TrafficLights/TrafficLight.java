package sda.Stan.TrafficLights;

public class TrafficLight {

    private LightState lights = new RedMode();

    public LightState getLights() {
        return lights;
    }

    public void setLights(LightState lights) {
        this.lights = lights;
    }

    public void nextMode() {
        lights.next(this);
    }

    public void prevMode() {
        lights.prev(this);
    }

    public void disable(){
        lights = new SwitchOffMode();
        System.out.println("Wyłączam sygnalizator");
    }

    public void able(){
        lights = new SwitchOffMode();
        System.out.println("Włączam sygnalizator");
    }

    public void printStatus(){
        lights.printStatus();
    }
}
