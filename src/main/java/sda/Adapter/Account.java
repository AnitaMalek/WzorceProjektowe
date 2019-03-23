package sda.Adapter;

public class Account {

    private String name;
    private String lastName;
    private String phoneNumber;
    private String pin;
    private boolean active;

    public Account(String name, String lastName, String phoneNumber, String pin, boolean active) {
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.pin = pin;
        this.active = active;
    }
}
