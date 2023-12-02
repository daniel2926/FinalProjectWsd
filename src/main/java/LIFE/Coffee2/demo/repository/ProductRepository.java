package LIFE.Coffee2.demo.repository;

import LIFE.Coffee2.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{


}
