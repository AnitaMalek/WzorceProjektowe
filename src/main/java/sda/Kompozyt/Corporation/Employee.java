package sda.Kompozyt.Corporation;

public abstract class Employee {

    protected String name;
    protected int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    protected abstract String getName();
    protected abstract int getSalary();

    public void showMe(){

        System.out.println("Pracownik: " + this.getName());
        System.out.println("Zarobki: " + this.getSalary());
    }

    public abstract void addEmployee(Employee employee);
    public abstract void removeEmployee(Employee employee);
}
