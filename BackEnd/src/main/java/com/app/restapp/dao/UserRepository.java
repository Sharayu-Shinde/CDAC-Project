package com.app.restapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.restapp.entities.User;

public interface UserRepository extends JpaRepository<User,Integer> {

    public User findByMobileAndPassword(String mobile,String password);
}
