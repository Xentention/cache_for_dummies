package com.example.cache_for_dummies.databaseService.impl;

import com.example.cache_for_dummies.databaseService.MenuItemDatabaseService;
import com.example.cache_for_dummies.entity.MenuItemEntity;
import com.example.cache_for_dummies.repository.MenuItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Component
@AllArgsConstructor
public class MenuItemDatabaseServiceImpl implements MenuItemDatabaseService {

    private final MenuItemRepository repository;

    @Override
    public MenuItemEntity getById(Long id) {
        return Optional.ofNullable(id)
                .flatMap(repository::findById)
                .orElseThrow(NoSuchElementException::new);
    }

    @Override
    public List<MenuItemEntity> getAll() {
        return repository.findAll();
    }
}
