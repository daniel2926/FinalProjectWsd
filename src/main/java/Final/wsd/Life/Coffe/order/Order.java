package Final.wsd.Life.Coffe.order;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long MemberId;
    private String size;
    private String itemName;
    private int itemPrice;

    public Order(Long id, String size, String itemName, int itemPrice) {
        this.MemberId = id;
        this.size = size;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }


    public Long getId() {
        return MemberId;
    }

    public int calculatePrice() {
        return itemPrice;
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


    @Override
    public String toString() {
        return "Order{" +
                "MemberId=" + MemberId +
                ", size='" + size + '\'' +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                '}';
    }
}

