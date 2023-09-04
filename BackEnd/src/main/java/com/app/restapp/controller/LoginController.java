package com.app.restapp.controller;

import com.app.restapp.dto.LoginRequestDto;
import com.app.restapp.entities.Login;
import com.app.restapp.entities.User;
import com.app.restapp.service.ILoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/urbanstay")
public class LoginController {

    @Autowired
    ILoginService loginService;

    @PostMapping("/loginuser")
    public ResponseEntity<User> loginUser(@RequestBody Login login)
    {
        System.out.println(" In login "+login);

        User user = loginService.verifyLogin(login.getMobile(), login.getPassword());
               System.out.println(user);

       if(user != null)
       {
           return ResponseEntity.ok(user);
       }
       else
       {
           return ResponseEntity.ok(null);
       }
    }

}
