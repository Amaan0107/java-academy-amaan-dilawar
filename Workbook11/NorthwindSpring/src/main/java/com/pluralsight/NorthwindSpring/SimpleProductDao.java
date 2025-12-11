package com.pluralsight.NorthwindSpring;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleProductDao implements ProductDao {

    private  List<Product> products = new ArrayList<>();
    public SimpleProductDao() {
        products = new ArrayList<>();
        products.add(new Product(1,"Laptop", "Electronics",550.00));
        products.add(new Product(2,"Chairs", "Furniture",80.00));
        products.add(new Product(3,"Headphones", "Electronics",50.00));
    }
    @Override
    public void add(Product product) {
        products.add(product);
    }
    @Override
    public List<Product> getAll() {
        return products;
    }
}
