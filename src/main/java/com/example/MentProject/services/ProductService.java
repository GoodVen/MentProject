package com.example.MentProject.services;

import com.example.MentProject.models.Product;
import com.example.MentProject.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

     private final ProductRepository productRepository;

     public ProductService(ProductRepository productRepository) {
          this.productRepository = productRepository;
     }


     public List<Product> getProduct (String name) {
          if (name != null) {
               return productRepository.findByTitle(name);
          }
          return productRepository.findAll();
     }


     public void deleteProduct(Long id) {
     }

     public void saveProduct(Product product) {
     }
}
