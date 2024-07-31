package com.example.cache_for_dummies.databaseService;

import com.example.cache_for_dummies.entity.RestaurantEntity;

public interface RestaurantDatabaseService {

    RestaurantEntity getById(Long id);

}
