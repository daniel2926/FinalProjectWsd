package Final.wsd.Life.Coffe.order;

public class Order {
    private String size;
    private String itemName;
    private int itemPrice;
    private int discountPrice;

    public Order(String size, String itemName, int itemPrice, int discountPrice) {
        this.size = size;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.discountPrice = discountPrice;
    }

    public int calculatePrice() {
        return itemPrice - discountPrice;
    }

    public String getSize() {
        return size;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "size=" + size +
                ",itemName='" + itemName + "\'" +
                ", itemPrice=" + itemPrice +
                ", discountPrice=" + discountPrice + '}';
    }
}

