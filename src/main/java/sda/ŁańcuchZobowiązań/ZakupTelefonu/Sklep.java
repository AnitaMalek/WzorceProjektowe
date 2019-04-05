package sda.ŁańcuchZobowiązań.ZakupTelefonu;

public class Sklep extends ShopAvailability{


    @Override
    public void addShopItems() {
        shopItems.put("Galaxy S10", 2);
        shopItems.put("Galaxy S10+", 1);
        shopItems.put("Galaxy S9", 5);
        shopItems.put("Iphone 8", 11);
    }


    @Override
    protected String getRole() {
        return "Sklep";
    }
}
