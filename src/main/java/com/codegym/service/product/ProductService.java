package com.codegym.service.product;

import com.codegym.dao.IProductDao;
import com.codegym.dao.ProductDao;
import com.codegym.model.Product;

import java.util.List;

public class ProductService implements IProductService{
    private ProductDao productDao;

    public ProductService(ProductDao iProductDao) {
        this.productDao = iProductDao;
    }

    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }

    @Override
    public Product findById(int id) {
        return productDao.findById(id);
    }

    @Override
    public boolean create(Product product) {
         return productDao.create(product) ;
    }

    @Override
    public boolean updateById(int id, Product product) {
        return productDao.updateById(id,product);
    }

    @Override
    public boolean deleteById(int id) {
        return productDao.deleteById(id);
    }
}
