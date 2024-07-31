package com.example.cache_for_dummies.service;

import com.example.cache_for_dummies.dto.MenuItemDto;

import java.util.List;

public interface MenuItemService {

    MenuItemDto get(Long id);

    List<MenuItemDto> getAll();

}
