package LIFE.Coffee2.demo.service;

import LIFE.Coffee2.demo.entity.Product;

import java.util.List;

public interface ProductService {
	List<Product> getAllStudents();

	Product saveStudent(Product product);

	Product getStudentById(Long id);

	Product updateStudent(Product product);
	
	void deleteStudentById(Long id);

}
