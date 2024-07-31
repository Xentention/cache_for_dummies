package com.example.cache_for_dummies.controllers;

import com.example.cache_for_dummies.dto.MenuItemDto;
import com.example.cache_for_dummies.service.MenuItemService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/menu/v1")
@AllArgsConstructor
public class MenuItemController {

    private final MenuItemService menuItemService;

    @GetMapping("/get/{id}")
    public MenuItemDto get(@PathVariable("id") Long id) {
        return menuItemService.get(id);
    }

    @GetMapping("/get")
    public List<MenuItemDto> getAll() {
        return menuItemService.getAll();
    }

}
