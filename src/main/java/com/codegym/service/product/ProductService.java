package com.codegym.service.product;

import com.codegym.dao.IProductDao;
import com.codegym.dao.ProductDao;
import com.codegym.model.Product;

import java.util.List;

public class ProductService implements IProductService{
    private ProductDao iProductDao;

    public ProductService(ProductDao iProductDao) {
        this.iProductDao = iProductDao;
    }

    @Override
    public List<Product> findAll() {
        return iProductDao.findAll();
    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public boolean create(Product product) {
        return false;
    }

    @Override
    public boolean updateById(int id, Product product) {
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
