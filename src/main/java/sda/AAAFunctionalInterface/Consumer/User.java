package sda.AAAFunctionalInterface.Consumer;

public class User {

//public int saldo;

   // public User(int saldo) {
     //   this.saldo = saldo;
    //}

    private int id;
    private String name;
    private String lastName;
    private int age;
    private Position position;

    public User(int id, String name, String lastName, int age, Position position) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", position=" + position +
                '}';
    }
}
