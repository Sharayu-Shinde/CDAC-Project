package com.app.restapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.restapp.entities.Login;

public interface LoginRepository extends JpaRepository<Login,Integer> {

        public Login findByMobileAndPassword(String mobile, String password);
}
