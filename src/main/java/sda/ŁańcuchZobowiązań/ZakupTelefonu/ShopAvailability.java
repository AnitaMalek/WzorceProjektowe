package sda.ŁańcuchZobowiązań.ZakupTelefonu;

import java.util.HashMap;
import java.util.Map;

public abstract class ShopAvailability {

    protected Map <String, Integer> shopItems = new HashMap<>();
    protected ShopAvailability nextShop;

    public ShopAvailability() {

        addShopItems();
    }

    public void addNextShop(ShopAvailability shopAvailability) {
        this.nextShop = shopAvailability;
    }

    public abstract void addShopItems();

    abstract protected String getRole();

    public void setNextShop(ShopAvailability nextShop) {
        this.nextShop = nextShop;
    }

    public void sell(ShopRequest telephone) {
        boolean isAvailable = shopItems.containsKey(telephone.getTelephone());
        if (isAvailable) {
            int telephonesQuantity = shopItems.get(telephone.getTelephone());
            if (telephone.getTelephonesQuantity() <= telephonesQuantity) {
                System.out.printf("Sprzedajemy w  " + getRole(),
                        telephone.getTelephone(),
                        getRole());
            } else if (nextShop != null) {
                System.out.println("Brak odpowiedniej ilości. Oddelegowano do: " + nextShop.getRole());
                nextShop.sell(telephone);
            }
        } else if (nextShop != null) {
            System.out.println("Brak w sklepie. Sprawdzamy w: " + nextShop.getRole());
            nextShop.sell(telephone);
        } else {
            System.out.println("Produkt niedostępny");
        }

    }
}
