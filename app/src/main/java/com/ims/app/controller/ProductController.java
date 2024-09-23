package com.ims.app.controller;

import com.ims.app.model.Product;

import com.ims.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/product")
    public List<Product> GetAllProducts(){
        return productService.getAllProducts();
    }
}
