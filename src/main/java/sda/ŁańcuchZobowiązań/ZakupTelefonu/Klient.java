package sda.ŁańcuchZobowiązań.ZakupTelefonu;

public class Klient {

    public static void main(String[] args) {

        ShopRequest shopRequest = new ShopRequest("Iphone 7", 6);
        Sklep sklep = new Sklep();
        SklepCentralny sklepCentralny = new SklepCentralny();
        Hurtownia hurtownia = new Hurtownia();
        sklep.setNextShop(sklepCentralny);
        sklepCentralny.setNextShop(hurtownia);
        sklep.sell(shopRequest);
    }
}
