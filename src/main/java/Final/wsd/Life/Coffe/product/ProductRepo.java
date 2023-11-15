package Final.wsd.Life.Coffe.product;

import Final.wsd.Life.Coffe.member.Member;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public interface ProductRepo extends CrudRepository<Product,String > {
    static Map<String,Double> store = new HashMap<>();
    default Optional<Product> findByName(Product name){
        name.setName("Cappucino");
        name.setPrice(15000);
        store.put(name.getName(),name.getPrice());
        return Optional.of(name);
    }
    List<Product> findByNameContains (String name);

}
