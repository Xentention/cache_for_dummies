package com.example.cache_for_dummies.mapper.impl;

import com.example.cache_for_dummies.dto.MenuItemDto;
import com.example.cache_for_dummies.dto.RestaurantDto;
import com.example.cache_for_dummies.entity.MenuItemEntity;
import com.example.cache_for_dummies.mapper.Mapper;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class MenuEntityToDtoMapper implements Mapper<MenuItemEntity, MenuItemDto> {

    @Override
    public MenuItemDto map(MenuItemEntity input) {
        return MenuItemDto.builder()
                .id(input.getId())
                .name(input.getName())
                .price(input.getPrice())
                .calories(input.getCalories())
                .restaurants(input.getRestaurants().stream()
                        .map(r -> RestaurantDto.builder()
                                .id(r.getId())
                                .name(r.getName())
                                .build())
                        .collect(Collectors.toList()))
                .build();
    }
}
