package sda.Mediator.ZadanieDriver;

import java.io.IOException;
import java.rmi.Remote;
import java.rmi.server.RemoteCall;
import java.util.ArrayList;
import java.util.List;

public class TaxiDispatcher implements Dispatcher {

    private List<Driver> drivers = new ArrayList<>();
    private  List<Driver> orders = new ArrayList<>();



    @Override
    public void newOrder(String order) {
        System.out.println("kurs");
    }

    @Override
    public void addDriver(Driver driver) {
        System.out.println("kierowca");
    }
}
