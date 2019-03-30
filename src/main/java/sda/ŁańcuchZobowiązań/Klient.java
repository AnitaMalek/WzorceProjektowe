package sda.ŁańcuchZobowiązań;

public class Klient {

    public static void main(String[] args) {

        ShopRequest shopRequest = new ShopRequest("Iphone 7", 2);
        Sklep sklep = new Sklep();
        SklepCentralny sklepCentralny = new SklepCentralny();
        Hurtownia hurtownia = new Hurtownia();
        sklep.setNextShop(sklepCentralny);
        sklepCentralny.setNextShop(hurtownia);
        sklep.sell(shopRequest);
    }
}
