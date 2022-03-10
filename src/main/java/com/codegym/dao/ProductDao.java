package com.codegym.dao;

import com.codegym.model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDao implements IProductDao{
    public ProductDao() {
    }
    Connection connection = DBConnection.getConnection();




    @Override
    public List<Product> findAll() {
        List<Product> products = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM product");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                int categoryId = resultSet.getInt("categoryId");
                int promotionId = resultSet.getInt("promotion");
                Product product = new Product(id, name, price, categoryId, promotionId);
                products.add(product);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
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
