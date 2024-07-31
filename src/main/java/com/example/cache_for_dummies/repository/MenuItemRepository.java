package com.example.cache_for_dummies.repository;

import com.example.cache_for_dummies.entity.MenuItemEntity;
import jakarta.persistence.QueryHint;
import org.hibernate.jpa.AvailableHints;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.QueryHints;

import java.util.List;

public interface MenuItemRepository extends JpaRepository<MenuItemEntity, Long> {

    @Override
    @QueryHints(@QueryHint(name = AvailableHints.HINT_CACHEABLE, value = "true"))
    List<MenuItemEntity> findAll();

}
