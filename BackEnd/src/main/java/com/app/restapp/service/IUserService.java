package com.app.restapp.service;

import java.util.List;

import com.app.exception.CustomException;
import com.app.restapp.entities.User;

public interface IUserService {
    User insertNewUser(User user);

    List<User> getAllUsers();
    
    User updateUser(int user_id,  User user)throws CustomException;
    
    String deleteUser(int user_id);

    User getByMobileAndPassword(String mobile, String password);
}
