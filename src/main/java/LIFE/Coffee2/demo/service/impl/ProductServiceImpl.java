package LIFE.Coffee2.demo.service.impl;

import LIFE.Coffee2.demo.entity.Product;
import LIFE.Coffee2.demo.repository.ProductRepository;
import LIFE.Coffee2.demo.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductRepository productRepository;
	
	public ProductServiceImpl(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public List<Product> getAllStudents() {
		return productRepository.findAll();
	}

	@Override
	public Product saveStudent(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product getStudentById(Long id) {
		return productRepository.findById(id).get();
	}

	@Override
	public Product updateStudent(Product product) {
		return productRepository.save(product);
	}

	@Override
	public void deleteStudentById(Long id) {
		productRepository.deleteById(id);
	}
}
