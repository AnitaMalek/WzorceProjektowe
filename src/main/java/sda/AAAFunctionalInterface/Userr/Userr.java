package sda.AAAFunctionalInterface.Userr;

public class Userr {

    String name;
    String lastName;
    int age;

    public Userr(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Userr{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
