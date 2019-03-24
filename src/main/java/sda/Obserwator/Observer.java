package sda.Obserwator;

public abstract class Observer {

    protected TemperatureProvider provider;
    public abstract void update();
}
