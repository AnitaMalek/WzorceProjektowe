package sda.ŁańcuchZobowiązań.Bankomat;

public class BankomatTrzeci extends MoneyAvailability {

    @Override
    public void addBankNote() {
        bankNote.put(500, 5);
        bankNote.put(200, 5);
        bankNote.put(100, 5);
        bankNote.put(50, 5);
        bankNote.put(20, 5);
        bankNote.put(10, 5);
    }

    @Override
    protected String getRole() {
        return " Bankomat trzeci";
    }
}
