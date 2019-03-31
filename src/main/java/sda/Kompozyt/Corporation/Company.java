package sda.Kompozyt.Corporation;

public class Company {
    public static void main(String[] args) {

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
