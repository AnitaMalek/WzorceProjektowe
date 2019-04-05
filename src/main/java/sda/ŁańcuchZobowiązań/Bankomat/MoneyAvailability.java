package sda.ŁańcuchZobowiązań.Bankomat;

import java.util.HashMap;
import java.util.Map;

public abstract class MoneyAvailability {

    protected Map <Integer, Integer> bankNote = new HashMap<>();
    protected MoneyAvailability nextCashMashine;

    public abstract void addBankNote();

    public MoneyAvailability () {
        addBankNote();
    }

    public void addNextBankNote(MoneyAvailability moneyAvailability) {
        this.nextCashMashine = moneyAvailability;
    }

    abstract protected String getRole();

    public void setNextCashMashine(MoneyAvailability nextCashMashine) {
        this.nextCashMashine = nextCashMashine;
    }

    public void payment(MoneyRequest amount) {
        boolean isAvailable = bankNote.containsKey(amount.getAmount());

        if (isAvailable) {
            int amountQuantity = bankNote.get(amount.getAmount());
            if (amount.getAmount() <= amountQuantity) {
                System.out.println("Wypłacam w: " + getRole());
            } else if (nextCashMashine != null){
                System.out.println("Brak odpowiedniej ilości. Oddelegowano do: " + nextCashMashine.getRole());
                nextCashMashine.payment(amount);
            } else {
                System.out.println("Banknoty niedostępne");
            }
        }
    }


}
