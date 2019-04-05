package sda.ŁańcuchZobowiązań.Bankomat;

public class Klient {

    public static void main(String[] args) {

        MoneyRequest moneyRequest = new MoneyRequest(550);
        BankomatPierwszy pierwszy = new BankomatPierwszy();
        BankomatDrugi drugi = new BankomatDrugi();
        BankomatTrzeci trzeci = new BankomatTrzeci();
        pierwszy.setNextCashMashine(drugi);
        drugi.setNextCashMashine(trzeci);
        pierwszy.payment(moneyRequest);
    }
}
