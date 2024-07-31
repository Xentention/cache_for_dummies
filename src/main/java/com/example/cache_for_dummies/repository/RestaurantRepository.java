package com.example.cache_for_dummies.repository;

import com.example.cache_for_dummies.entity.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<RestaurantEntity, Long> {
}
