package com.example.cache_for_dummies.service.impl;

import com.example.cache_for_dummies.databaseService.MenuItemDatabaseService;
import com.example.cache_for_dummies.dto.MenuItemDto;
import com.example.cache_for_dummies.entity.MenuItemEntity;
import com.example.cache_for_dummies.mapper.Mapper;
import com.example.cache_for_dummies.service.MenuItemService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class MenuItemServiceImpl implements MenuItemService {

    private final MenuItemDatabaseService menuItemDatabaseService;
    private final Mapper<MenuItemEntity, MenuItemDto> mapper;

    @Override
    public MenuItemDto get(Long id) {
        return mapper.map(
                menuItemDatabaseService.getById(id)
        );
    }

    @Override
    public List<MenuItemDto> getAll() {
        return menuItemDatabaseService.getAll().stream()
                .map(mapper::map)
                .collect(Collectors.toList());
    }

}
