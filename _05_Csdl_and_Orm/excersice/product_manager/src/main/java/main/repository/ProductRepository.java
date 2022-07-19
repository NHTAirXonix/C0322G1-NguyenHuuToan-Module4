package main.repository;

import main.model.Product;

import javax.persistence.EntityTransaction;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements main.repository.IProductRepository {

    @Override
    public List<Product> findAll() {
        String select = "SELECT m from product m";
        List<Product> productList = BaseRepository.entityManager.createQuery(select,Product.class).getResultList();
        return productList;
    }

    @Override
    public void save(Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.persist(product);
        entityTransaction.commit();
    }

    @Override
    public Product findById(int id) {
        String select = "SELECT m from product m";
        List<Product> productList = BaseRepository.entityManager.createQuery(select,Product.class).getResultList();
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                return productList.get(i);
            }
        }
        return null;
    }

    @Override
    public void update(int id, Product product) {
        String select = "SELECT m from product m";
        List<Product> productList = BaseRepository.entityManager.createQuery(select,Product.class).getResultList();
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
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
        entityTransaction.begin();
        BaseRepository.entityManager.remove(this.findById(id));
        entityTransaction.commit();
    }

    @Override
    public List<Product> searchByName(Product product) {
        String select = "SELECT m from product m";
        List<Product> productList = BaseRepository.entityManager.createQuery(select,Product.class).getResultList();
        List<Product> listSearchByName = new ArrayList<>();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().contains(product.getName())) {
                listSearchByName.add(productList.get(i));
            }
        }
        return listSearchByName;
    }
}
