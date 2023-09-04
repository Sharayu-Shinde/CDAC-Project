package com.app.restapp.controller;

import ch.qos.logback.core.net.SyslogOutputStream;

import com.app.exception.CustomException;
import com.app.restapp.entities.User;
import com.app.restapp.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/urbanstay")
public class UserController {

    @Autowired(required = true)
    IUserService userService;

    @PostMapping("/newuser")
    public ResponseEntity<User> addNewUser(@RequestBody User user)
    {

        System.out.println(user);
       User u = userService.insertNewUser(user);
        return ResponseEntity.ok(u);
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers()
    {
        List<User> userList = userService.getAllUsers();
        return ResponseEntity.ok(userList);
    }

    @PutMapping("/updateuser/{user_id}")
    public ResponseEntity<User> updateUser(@PathVariable int user_id, @RequestBody User user) throws CustomException{
        User updatedUser = userService.updateUser(user_id, user);
        if (updatedUser != null) {
            return ResponseEntity.ok(updatedUser);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    @DeleteMapping("/deleteuser/{userId}")
    public ResponseEntity<?> deleteUser(@PathVariable int userId) {
    	
    	System.out.println(userId);
        
        return ResponseEntity.status(HttpStatus.OK).body(userService.deleteUser(userId));
        }
    


}
