package com.codegym.repository;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "G102", "300", "100%", "Logitech"));
        productList.add(new Product(2, "G304", "600", "100%", "Logitech"));
        productList.add(new Product(3, "G502", "1200", "100%", "Logitech"));
        productList.add(new Product(4, "G402", "800", "100%", "Logitech"));
        productList.add(new Product(5, "G903", "1500", "100%", "Logitech"));
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public Product findById(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                return productList.get(i);
            }
        }
        return null;
    }

    @Override
    public void update(int id, Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                productList.get(i).setName(product.getName());
                productList.get(i).setPrice(product.getPrice());
                productList.get(i).setDetail(product.getDetail());
                productList.get(i).setManufacturer(product.getManufacturer());
            }
        }
    }

    @Override
    public void remove(int id) {
        productList.removeIf(item -> item.getId() == id);
    }

    @Override
    public List<Product> searchByName(Product product) {
        List<Product> listSearchByName = new ArrayList<>();
        for (Product value : productList) {
            if (value.getName().contains(product.getName())) {
                listSearchByName.add(value);
            }
        }
        return listSearchByName;
    }
}
