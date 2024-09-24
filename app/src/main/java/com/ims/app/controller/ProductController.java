package com.ims.app.controller;

import com.ims.app.model.Product;

import com.ims.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    // Get All Products
    @RequestMapping("/product")
    public List<Product> GetAllProducts(){
        return productService.getAllProducts();
    }

    // Get ALL by id
    @RequestMapping("/product/{id}")
    public Product getProductByID(@PathVariable Long id){
        return productService.getProductByID(id);
    }

    // Create POST request
    @RequestMapping(method = RequestMethod.POST, value = "/product")
    public void addProduct(@RequestBody Product product){
        productService.addProduct(product);
    }

    // Create UPDATE request
    @RequestMapping(method = RequestMethod.PUT, value = "/product/{id}")
    public void updateProduct(@RequestBody Product product, @PathVariable Long id){
        productService.updateProduct(product);
    }

    // create DELETE request
    @RequestMapping(method = RequestMethod.DELETE, value = "/product/{id}")
    public void deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
    }
}
