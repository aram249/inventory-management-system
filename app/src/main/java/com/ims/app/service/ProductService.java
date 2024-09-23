package com.ims.app.service;

import com.ims.app.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>(Arrays.asList(
            new Product("1", "Xbox", "Microsoft", "Series-X", 500.00, 1000),
                new Product("2", "Playstation 5", "Sony", "Pro", 800.00, 1200),
                new Product("3", "Nintendo Switch", "Nintendo", "Switch", 299.99, 800)
        ));

    // Get All products
    public List<Product> getAllProducts(){
        return products;
    }

    // POST method
    public void addProduct(Product product) {
        products.add(product);
    }

    // UPDATE method
    public void updateProduct(String id, Product product) {
        for(int i = 0; i < products.size(); i++){
            Product p = products.get(i);
            if (p.getID().equals(id)){
                products.set(i, product);
                return;
            }
        }
    }

    // DELETE method
    public void deleteProduct(String id) {
        products.removeIf(p -> p.getID().equals(id));
    }
}
