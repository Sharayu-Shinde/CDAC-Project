package com.app.restapp.service;

import com.app.restapp.entities.Login;
import com.app.restapp.entities.User;

public interface ILoginService {
    User verifyLogin(String mobile, String password);
}
