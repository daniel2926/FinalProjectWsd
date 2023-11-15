package Final.wsd.Life.Coffe.controller;

import Final.wsd.Life.Coffe.product.Product;
import Final.wsd.Life.Coffe.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public Product create(@RequestBody Product product) {
        return productService.save(product);
    }

    @GetMapping
    public Iterable<Product> findAll() {
        return productService.findAll();
    }
}
