package com.codegym.ss7_c0222g1.model;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<com.codegym.ss7_c0222g1.model.Product, Integer> products = new HashMap<>();

    public Cart() {
    }

    public Cart(Map<com.codegym.ss7_c0222g1.model.Product, Integer> products) {
        this.products = products;
    }

    public Map<com.codegym.ss7_c0222g1.model.Product, Integer> getProducts() {
        return products;
    }

    private boolean checkItemInCart(com.codegym.ss7_c0222g1.model.Product product) {
        for (Map.Entry<com.codegym.ss7_c0222g1.model.Product, Integer> entry : products.entrySet()) {
            if (entry.getKey().getId().equals(product.getId())) {
                return true;
            }
        }
        return false;
    }


    private Map.Entry<com.codegym.ss7_c0222g1.model.Product, Integer> selectItemInCart(com.codegym.ss7_c0222g1.model.Product product) {
        for (Map.Entry<com.codegym.ss7_c0222g1.model.Product, Integer> entry : products.entrySet()) {
            if (entry.getKey().getId().equals(product.getId())) {
                return entry;
            }
        }
        return null;
    }

    //tang san pham
    public void addProduct(com.codegym.ss7_c0222g1.model.Product product) {
        if (!checkItemInCart(product)) {
            products.put(product, 1);
        } else {
            Map.Entry<com.codegym.ss7_c0222g1.model.Product, Integer> itemEntry = selectItemInCart(product);
            Integer newQuantity = itemEntry.getValue() + 1;
            products.replace(itemEntry.getKey(), newQuantity);
        }
    }

    public void removeProduct(com.codegym.ss7_c0222g1.model.Product product) {
        Map.Entry<Product, Integer> itemEntry = selectItemInCart(product);
        if (itemEntry.getValue() == 1) {
            products.remove(itemEntry.getKey());
        } else {
            Integer newQuantity = itemEntry.getValue() - 1;
            products.replace(itemEntry.getKey(), newQuantity);
        }
    }

    public void deleteNowProduct(Product product) {
        Map.Entry<Product, Integer> itemEntry = selectItemInCart(product);
        products.remove(itemEntry.getKey());
    }

    public Integer countProductQuantity() {
        Integer productQuantity = 0;
        for (Map.Entry<com.codegym.ss7_c0222g1.model.Product, Integer> entry : products.entrySet()) {
            productQuantity += entry.getValue();
        }
        return productQuantity;
    }

    public Integer countItemQuantity() {
        return products.size();
    }

    public void clearCart() {
        products.clear();
    }

    public Float countTotalPayment() {
        float payment = 0;
        for (Map.Entry<com.codegym.ss7_c0222g1.model.Product, Integer> entry : products.entrySet()) {
            payment += entry.getKey().getPrice() * (float) entry.getValue();
        }
        return payment;
    }
}