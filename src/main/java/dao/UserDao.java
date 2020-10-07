package dao;

import models.User;

import java.util.Optional;

public interface UserDao extends Dao<User> {
    Object Userlogin(String uname, String password);
}
