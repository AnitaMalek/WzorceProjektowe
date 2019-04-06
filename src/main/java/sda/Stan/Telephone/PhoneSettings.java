package sda.Stan.Telephone;

public class PhoneSettings {

    public static void main(String[] args) {
        Phone phone = new Phone();

        phone.printStatus();

        phone.louderState();
        phone.printStatus();


        phone.louderState();
        phone.printStatus();

        phone.quieterState();
        phone.printStatus();



    }
}
