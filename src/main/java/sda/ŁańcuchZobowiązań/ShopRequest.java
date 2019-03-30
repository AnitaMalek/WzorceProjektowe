package sda.ŁańcuchZobowiązań;

public class ShopRequest {

    private String telephone;
    private int telephonesQuantity;

    public ShopRequest (String telephone, int telephonesQuantity) {
        this.telephone = telephone;
        this.telephonesQuantity = telephonesQuantity;
    }

    public String getTelephone() {
        return telephone;
    }

    public int getTelephonesQuantity() {
        return telephonesQuantity;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setTelephonesQuantity(int telephonesQuantity) {
        this.telephonesQuantity = telephonesQuantity;
    }
}
