package com.example.cache_for_dummies.databaseService.impl;

import com.example.cache_for_dummies.databaseService.RestaurantDatabaseService;
import com.example.cache_for_dummies.entity.RestaurantEntity;
import com.example.cache_for_dummies.repository.RestaurantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.NoSuchElementException;
import java.util.Optional;

@Component
@AllArgsConstructor
public class RestaurantDatabaseServiceImpl implements RestaurantDatabaseService {

    private final RestaurantRepository repository;

    @Override
    public RestaurantEntity getById(Long id) {
        return Optional.ofNullable(id)
                .flatMap(repository::findById)
                .orElseThrow(NoSuchElementException::new);
    }
}
