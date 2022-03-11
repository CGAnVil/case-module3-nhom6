package com.codegym.dao;

import com.codegym.model.Product;
import com.codegym.service.product.IProductService;

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
                int promotionId = resultSet.getInt("promotionId");
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
        Product product = new Product();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM product WHERE id= ?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                int categoryId = resultSet.getInt("categoryId");
                int promotionId = resultSet.getInt("promotionId") ;
                product = new Product(id, name, price, categoryId, promotionId);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return product;
    }

    @Override
    public boolean create(Product product) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO product (name, price, categoryId, promotionId) VALUES (?, ?, ?, ?)");
           preparedStatement.setString(1, product.getName());
           preparedStatement.setDouble(2, product.getPrice());
           preparedStatement.setInt(3, product.getCategoryId());
           preparedStatement.setInt(4, product.getPromotionId());
         return   preparedStatement.executeUpdate()>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateById(int id, Product product) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE product Set name= ?, price=?, categoryId=?, promotionId=? where id =?");
            preparedStatement.setString(1, product.getName());
            preparedStatement.setDouble(2, product.getPrice());
            preparedStatement.setInt(3, product.getCategoryId());
            preparedStatement.setInt(4, product.getPromotionId());
            preparedStatement.setInt(5, id);
            return preparedStatement.executeUpdate()>0;


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE  from product WHERE id=?");
            preparedStatement.setInt(1, id);
            return preparedStatement.executeUpdate()>0;


        } catch (SQLException e) {
            e.printStackTrace();
        }


        return false;
    }
}
