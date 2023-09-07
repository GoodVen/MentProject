package com.example.MentProject.controllers;

import com.example.MentProject.entity.Product;
import com.example.MentProject.models.ProductDTO;
import com.example.MentProject.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController("/product")
public class ProductController {

    private ProductService productService;


    public ProductController(ProductService productService){
         this.productService = productService;
    }

    @GetMapping("/")
    public List<Product> getAllProducts(){
       return productService.getAllProducts();
    }

    /*@GetMapping("/{id}")
    public ProductDTO getProductById(@PathVariable("id") Long productId){
        return productService.getProductById(productId);
    }*/

    @PostMapping("/")
    public void createProduct(Product product) throws IOException {
        productService.saveProduct(product);
    }

    @PutMapping("/product/{id}")
    public void productUpdate(@RequestBody Product product){
        productService.updateProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
    }

}
