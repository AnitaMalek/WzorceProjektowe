package sda.ŁańcuchZobowiązań.Bankomat;

public class MoneyRequest {

    private int amount;
    private int value;
    private int quantity;

    public void setAmount(int value, int quantity) {
        this.value = value;
        this.quantity = quantity;
    }

    public MoneyRequest (int amount) {
       this.amount = amount;
    }

    public int getValue() {
        return value;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getAmount() {
        return amount;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
