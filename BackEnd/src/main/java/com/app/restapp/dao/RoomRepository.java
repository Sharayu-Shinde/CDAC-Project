package com.app.restapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.restapp.entities.Room;

public interface RoomRepository extends JpaRepository<Room,Integer> {

}
