package com.example.MentProject.controllers;

import com.example.MentProject.entity.Product;
import com.example.MentProject.models.ProductDTO;
import com.example.MentProject.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController("/product")
public class ProductController {

    private ProductService productService;

    @GetMapping("/")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable("id") Long productId) {
        return productService.getProductById(productId);
    }

    @PostMapping("/")
    public void createProduct(ProductDTO product) throws IOException {
        productService.saveProduct(product);
    }

    @PutMapping("/product/{id}")
    public void productUpdate(@RequestBody ProductDTO product) {
        productService.updateProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }

}
