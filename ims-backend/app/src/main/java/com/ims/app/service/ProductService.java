package com.ims.app.service;

import com.ims.app.model.Product;
import com.ims.app.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // Get All products
    public List<Product> getAllProducts(){
        return (List<Product>) productRepository.findAll();
    }

    public Product getProductByID(Long id){
        return productRepository.findById(id).orElse(null);
    }

    // POST method
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    // UPDATE method
    public void updateProduct(Product product) {
        productRepository.save(product);
    }

    // DELETE method
    public void deleteProduct(Long id) {
        //products.removeIf(p -> p.getID().equals(id));
        productRepository.deleteById(id);
    }
}
