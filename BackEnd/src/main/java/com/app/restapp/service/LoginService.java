package com.app.restapp.service;

import com.app.restapp.dao.LoginRepository;
import com.app.restapp.entities.Login;
import com.app.restapp.entities.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements ILoginService{

    @Autowired
    private LoginRepository loginRepository;

    @Autowired
    private IUserService userService;


    @Override
    public User verifyLogin(String mobile, String password) {

        User user = userService.getByMobileAndPassword(mobile,password);
        if(user != null)
        {
            return user;
        }
        else {
            return null;
        }
    }
}
