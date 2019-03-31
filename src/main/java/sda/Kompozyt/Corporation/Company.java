package sda.Kompozyt.Corporation;

public class Company {
    public static void main(String[] args) {


        //Napisz mechanizm realizujący strukturę drzewiastą przedstawiającą strukturę korporacji IT.
        // Do tego celu wykorzystaj wzorzec projektowy kompozyt:
        //Pojedynczym element (leaf) będzie w tym przypadku developer
        //Kompozytem będzie natomiast manager który może koordynować pracę wielu developerów
        // oraz managerów. Zaimplementuj mechanizm który pozwoli wyświetlić listę zarobków każdego pracownika w firmie.

        Employee mainManager = new Manager("Jan", 10000);
        Employee manager = new Manager("Sebastian", 8000);
        mainManager.addEmployee(new Developer("Bronisław", 5000));
        mainManager.addEmployee(new Developer("Edward", 5000));
        mainManager.addEmployee(new Developer("Anna", 5000));

        manager.addEmployee(new Developer("Eleonora", 4000));


        mainManager.addEmployee(manager);

        mainManager.showMe();
    }

}
