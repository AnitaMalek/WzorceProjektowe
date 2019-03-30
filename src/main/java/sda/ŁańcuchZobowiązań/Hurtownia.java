package sda.ŁańcuchZobowiązań;

import java.util.Map;

public class Hurtownia extends ShopAvailability{


    @Override
    public void addShopItems() {
        shopItems.put("Galaxy S10+", 30);
        shopItems.put("Galaxy S9+", 10);
        shopItems.put("Iphone 7", 15);
        shopItems.put("Iphone 6S", 12);
        shopItems.put("Galaxy S8 +", 10);
    }

    @Override
    protected String getRole() {
        return "Hurtownia";
    }
}
