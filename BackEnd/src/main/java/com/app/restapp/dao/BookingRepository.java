package com.app.restapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.restapp.entities.Booking;

public interface BookingRepository extends JpaRepository<Booking,Integer> {


}
