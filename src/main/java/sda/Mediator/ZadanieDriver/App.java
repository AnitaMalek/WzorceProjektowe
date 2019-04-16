package sda.Mediator.ZadanieDriver;

public class App {

    public static void main(String[] args) {


        Dispatcher dispatcher = (Dispatcher) new TaxiDispatcher();

        Driver taxiDriver = new TaxiDriver("Taxi nr 456");
        Driver uberDriver = new UberDriver("Uber nr 675");


        dispatcher.addDriver(taxiDriver);
        dispatcher.addDriver(uberDriver);

        dispatcher.newOrder("Zlecenia: ul. Emili Gierczak 38");
        dispatcher.newOrder("Zlecenia: ul. Piastow 38");

        dispatcher.run();

    }
}


