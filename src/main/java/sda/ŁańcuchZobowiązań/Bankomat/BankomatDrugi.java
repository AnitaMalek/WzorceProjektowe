package sda.ŁańcuchZobowiązań.Bankomat;

public class BankomatDrugi extends MoneyAvailability {

    @Override
    public void addBankNote() {
        bankNote.put(500, 5);
        bankNote.put(200, 0);
        bankNote.put(100, 12);
        bankNote.put(50, 3);
        bankNote.put(20, 20);
        bankNote.put(10, 15);
    }

    @Override
    protected String getRole() {
        return " Bankomat drugi ";
    }
}
