package sda.Kompozyt.Corporation;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {

    private List<Employee> pracownicy = new ArrayList<>();

    public Manager(String name, int salary){
        super(name, salary);
    }

    @Override
    public void showMe(){
        super.showMe();
        for (Employee employee: pracownicy){
            employee.showMe();
        }
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
        pracownicy.add(employee);
    }

    @Override
    public void removeEmployee(Employee employee) {

        pracownicy.remove(employee);
    }
}
