package sda.Mediator.ZadanieDriver;

public class App {

    public static void main(String[] args) {


        Dispatcher dispatcher = (Dispatcher) new TaxiDispatcher();

        Driver taxiDriver = new TaxiDriver("Taxi nr 456");
        Driver uberDriver = new UberDriver("Uber nr 675");


        dispatcher.addDriver(taxiDriver);
        dispatcher.addDriver(uberDriver);

        dispatcher.newOrder("Zecenia: ul. Emili Gierczak 38");
        dispatcher.newOrder("Zecenia: ul. Piastow 38");

    }
}


