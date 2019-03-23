package sda.FactoryMethod;

public class CarLover {

    public static void main (String args[]) {
        for (CarFactory.CarType carType : CarFactory.CarType.values()) {
            System.out.println("Type of " + carType + " is " + CarFactory.createCar(carType).getFuel());
        }
    }
}

