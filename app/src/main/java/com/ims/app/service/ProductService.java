package com.ims.app.service;

import com.ims.app.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products = Arrays.asList(
            new Product("1", "Xbox", "Microsoft", "Series-X", 500.00, 1000),
                new Product("2", "Playstation 5", "Sony", "Pro", 800.00, 1200),
                new Product("3", "Nintendo Switch", "Nintendo", "Switch", 299.99, 800)
        );

    public List<Product> getAllProducts(){
        return products;
    }
}
