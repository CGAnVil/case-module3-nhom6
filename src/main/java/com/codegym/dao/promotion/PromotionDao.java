package com.codegym.dao.promotion;

import com.codegym.dao.DBConnection;
import com.codegym.model.Promotion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PromotionDao implements IPtomotionDao {
    public PromotionDao() {
    }
    Connection connection = DBConnection.getConnection();
    @Override
    public List<Promotion> findAll() {
        List<Promotion> promotions = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM  promotion");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String description = resultSet.getString("description");
                Promotion promotion = new Promotion(id, description);
                promotions.add(promotion);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return promotions;
    }

    @Override
    public Promotion findById(int id) {
        return null;
    }

    @Override
    public boolean create(Promotion promotion) {
        return false;
    }

    @Override
    public boolean updateById(int id, Promotion promotion) {
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
