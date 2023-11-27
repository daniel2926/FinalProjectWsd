package Final.wsd.Life.Coffe.service;

import Final.wsd.Life.Coffe.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductService {
    @Autowired
    private ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public Product findOne(String name){
        return productRepo.findById(name).get();
    }

    public Iterable<Product>findAll(){
        return productRepo.findAll();
    }

    public void removeOne(String name){
        productRepo.deleteById(name);
    }

    public List<Product> findByName(String name) {
        return productRepo.findByNameContains(name);
    }

    public Product save(Product product) {
        return productRepo.save(product);

    }
}
