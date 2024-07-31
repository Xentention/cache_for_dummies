package com.example.cache_for_dummies.databaseService;

import com.example.cache_for_dummies.entity.MenuItemEntity;

import java.util.List;

public interface MenuItemDatabaseService {

    MenuItemEntity getById(Long id);

    List<MenuItemEntity> getAll();

}
