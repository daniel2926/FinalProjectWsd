package Final.wsd.Life.Coffe.product;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.modelmapper.internal.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.springframework.data.annotation.Id;

@Entity


public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
    private double price;
    private String temperature;
    private String size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    
}
