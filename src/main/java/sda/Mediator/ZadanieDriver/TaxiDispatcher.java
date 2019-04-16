package sda.Mediator.ZadanieDriver;

import java.io.IOException;
import java.rmi.Remote;
import java.rmi.server.RemoteCall;
import java.util.ArrayList;
import java.util.List;

public class TaxiDispatcher implements Dispatcher {

    private List<Driver> drivers = new ArrayList<>();
    private List<String> orders = new ArrayList<>();



    @Override
    public void newOrder(String order) {
        orders.add(order);
    }

    @Override
    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    public void run() {
        for (String str: orders){
            for (Driver drv: drivers) {
                if (drv.isStan()){
                    drv.onNewOrder(str);
                    drv.setStan(false);
                    break;
                }
            }
        }
    }
}
