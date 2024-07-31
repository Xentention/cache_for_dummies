package com.example.cache_for_dummies.mapper.impl;

import com.example.cache_for_dummies.dto.MenuItemDto;
import com.example.cache_for_dummies.dto.RestaurantDto;
import com.example.cache_for_dummies.entity.RestaurantEntity;
import com.example.cache_for_dummies.mapper.Mapper;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class RestaurantEntityToDtoMapper implements Mapper<RestaurantEntity, RestaurantDto> {

    @Override
    public RestaurantDto map(RestaurantEntity input) {
        return RestaurantDto.builder()
                .id(input.getId())
                .name(input.getName())
                .menu(input.getMenu().stream()
                        .map(m -> MenuItemDto.builder()
                                .id(m.getId())
                                .name(m.getName())
                                .price(m.getPrice())
                                .calories(m.getCalories())
                                .build())
                        .collect(Collectors.toList())
                )
                .build();
    }
}
