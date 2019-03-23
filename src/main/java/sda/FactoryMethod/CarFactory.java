package sda.FactoryMethod;

public class CarFactory {

    public enum CarType {
        Diesel,
        Petrol,
        Electric
    }

    public static Car createCar(CarType carType) {
        switch (carType) {
            case Diesel:
                return new DieselCar();

            case Petrol:
                return new PetrolCar();

            case Electric:
                return new ElectricCar();
        }

        throw new IllegalArgumentException("The car type " + carType + " is not recognized.");
    }

}
