package com.codegym.dao.user;

import com.codegym.model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDao {
    public void insertUser (User user) throws SQLException;

    public User selectUser (int id);

    public List<User> selectAllUser();

    public boolean deleteUserById(int id);

    public boolean updateUser (User user);
}
