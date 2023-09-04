package com.app.restapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.restapp.entities.Hostel;

public interface HostelRepository extends JpaRepository<Hostel,Integer> {


}
