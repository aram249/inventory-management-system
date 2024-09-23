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

    // Create POST request
    @RequestMapping(method = RequestMethod.POST, value = "/product")
    public void addProduct(@RequestBody Product product){
        productService.addProduct(product);
    }

    // Create UPDATE request
    @RequestMapping(method = RequestMethod.PUT, value = "/product/{id}")
    public void updateProduct(@RequestBody Product product, @PathVariable String id){
        productService.updateProduct(id, product);
    }

    // create DELETE request
    @RequestMapping(method = RequestMethod.DELETE, value = "/product/{id}")
    public void deleteProduct(@PathVariable String id){
        productService.deleteProduct(id);
    }
}
