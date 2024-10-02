package com.ims.app.service;

import com.ims.app.model.Product;
import com.ims.app.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.*;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // save operation
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    // read operation
    public List<Product> fetchProductList(){
        return (List<Product>) productRepository.findAll();
    }

    // update operation
    public Product updateProduct(Product product, Long id) {

        Product prod = productRepository.findById(id).orElse(null);

        if (Objects.nonNull(product.getProductName()) && !"".equalsIgnoreCase(product.getProductName())) {
            assert prod != null;
            prod.setProductName(product.getProductName());
        }

        if (Objects.nonNull(product.getManufacturer()) && !"".equalsIgnoreCase(product.getManufacturer())) {
            assert prod != null;
            prod.setManufacturer(product.getManufacturer());
        }

        if (Objects.nonNull(product.getModel()) && !"".equalsIgnoreCase(product.getModel())) {
            assert prod != null;
            prod.setModel(product.getModel());
        }

        assert prod != null;
        return productRepository.save(prod);
    }

    // delete operation
    public void deleteProductByID(Long id) {
        productRepository.deleteById(id);
    }
}
