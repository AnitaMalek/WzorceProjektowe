package sda.Mediator.ZadanieDriver;

public abstract class Driver {

    protected  String name;
    private  boolean stan = true;


    public Driver(String name) {
        this.name = name;
    }

    public void onNewOrder(String orderName){
        System.out.println("Zlecenie: " + orderName +", name->" + name);
    }


    public boolean isStan() {
        return stan;
    }

    public void setStan(boolean stan) {
        this.stan = stan;
    }
}
