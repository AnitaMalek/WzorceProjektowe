package sda.ŁańcuchZobowiązań;

import java.util.Map;

public class SklepCentralny extends ShopAvailability{


    @Override
    public void addShopItems() {
        shopItems.put("Galaxy S8+", 20);
        shopItems.put("Iphone 7", 4);
        shopItems.put("Iphone XS", 10);
    }

    @Override
    protected String getRole() {
        return "SklepCentralny";
    }


}
