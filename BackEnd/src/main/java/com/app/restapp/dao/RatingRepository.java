package com.app.restapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.restapp.entities.Rating;

public interface RatingRepository extends JpaRepository<Rating,Integer> {
}
