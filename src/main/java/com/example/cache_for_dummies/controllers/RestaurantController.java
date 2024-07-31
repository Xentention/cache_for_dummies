package com.example.cache_for_dummies.controllers;

import com.example.cache_for_dummies.dto.RestaurantDto;
import com.example.cache_for_dummies.service.RestaurantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restaurant/v1")
@AllArgsConstructor
public class RestaurantController {

    private final RestaurantService restaurantService;

    @GetMapping("/get/{id}")
    public RestaurantDto get(@PathVariable("id") Long id) {
        return restaurantService.get(id);
    }

}
