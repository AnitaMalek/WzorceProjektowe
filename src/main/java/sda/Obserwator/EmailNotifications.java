package sda.Obserwator;

public class EmailNotifications extends Observer {

    public EmailNotifications(TemperatureProvider temperatureProvider) {
        this.provider = temperatureProvider;
        temperatureProvider.add(this);
    }

    @Override
    public void update() {
        System.out.println("Email Temperatura powietrza = " + provider.getTemperature());
    }

}
