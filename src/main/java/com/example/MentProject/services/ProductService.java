package com.example.MentProject.services;

import com.example.MentProject.entity.Product;
import com.example.MentProject.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

     private final ProductRepository productRepository;

     public ProductService(ProductRepository productRepository) {
          this.productRepository = productRepository;
     }

     public List<Product> getProduct (String name) {
          //TODO split into two methods
          if (name != null) {
               return productRepository.findByTitle(name);
          }
          return productRepository.findAll();
     }


     public void deleteProduct(Long id) {
          productRepository.deleteById(id);
     }

     public void saveProduct(Product product) {
          productRepository.save(product);
     }

     public Product updateProduct(Product product){
          return productRepository.save(product);
     }
}
