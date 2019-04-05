package sda.ŁańcuchZobowiązań.Bankomat;

public class BankomatPierwszy extends MoneyAvailability {


    @Override
    public void addBankNote() {
        bankNote.put(500, 1);
        bankNote.put(200, 1);
        bankNote.put(100, 0);
        bankNote.put(50, 20);
        bankNote.put(20, 0);
    }

    @Override
    protected String getRole() {
        return " Bankomat pierwszy ";
    }
}
