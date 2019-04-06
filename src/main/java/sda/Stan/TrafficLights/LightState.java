package sda.Stan.TrafficLights;

public interface LightState {

    void next (TrafficLight light);

    void prev (TrafficLight light);

    void printStatus();

}
