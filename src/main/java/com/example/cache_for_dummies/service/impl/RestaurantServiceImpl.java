package com.example.cache_for_dummies.service.impl;

import com.example.cache_for_dummies.databaseService.RestaurantDatabaseService;
import com.example.cache_for_dummies.dto.RestaurantDto;
import com.example.cache_for_dummies.entity.RestaurantEntity;
import com.example.cache_for_dummies.mapper.Mapper;
import com.example.cache_for_dummies.service.RestaurantService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class RestaurantServiceImpl implements RestaurantService {

    private final RestaurantDatabaseService restaurantDatabaseService;
    private final Mapper<RestaurantEntity, RestaurantDto> mapper;

    @Override
    public RestaurantDto get(Long id) {
        return mapper.map(
                restaurantDatabaseService.getById(id)
        );
    }

}
