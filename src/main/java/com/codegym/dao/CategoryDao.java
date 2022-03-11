package com.codegym.dao;

import com.codegym.model.Category;
import com.codegym.model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryDao implements ICategoryDao{
    private Connection connection = DBConnection.getConnection();

    public CategoryDao() {
    }

    @Override
    public List<Category> findAll() {

        List<Category> categories = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM category");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");

                Category category = new Category(id, name);
                categories.add(category);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categories;
    }

    @Override
    public Category findById(int id) {
        return null;
    }

    @Override
    public boolean create(Category category) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO category(name ) value (?)");
            preparedStatement.setString(1, "name");
            return preparedStatement.executeUpdate()>0;
        } catch (SQLException   e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateById(int id, Category category) {
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
