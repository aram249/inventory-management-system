package com.ims.app.controller;

import com.ims.app.model.Product;

import com.ims.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    // POST request
    @PostMapping("/products")
    public Product saveProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }

    // READ request
    @GetMapping("/products")
    public List<Product> fetchProductList(){
        return productService.fetchProductList();
    }

    // UPDATE request
    @PutMapping("/products/{id}")
    public Product updateProduct(@RequestBody Product product, @PathVariable("id") Long id){
        return productService.updateProduct(product, id);
    }

    // DELETE request
    @DeleteMapping("/products/{id}")
    public String deleteProduct(@PathVariable("id") Long id){
        productService.deleteProductByID(id);
        return "Deleted Successfully";
    }
}
