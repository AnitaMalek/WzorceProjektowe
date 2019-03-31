package sda.Kompozyt.Corporation;

public class Developer extends Employee{

    public Developer(String name, int salary){
        super(name, salary);
    }

    @Override
    protected String getName() {
        return name;
    }

    @Override
    protected int getSalary() {
        return salary;
    }

    @Override
    public void addEmployee(Employee employee) {

        System.out.println("nie mozna wykonac");
    }

    @Override
    public void removeEmployee(Employee employee) {

        System.out.println("nie mozna wykonac");
    }
}
