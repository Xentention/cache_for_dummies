package com.example.cache_for_dummies.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "menu_items")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class MenuItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "calories", nullable = false)
    private Integer calories;

    @Column(name = "price", nullable = false)
    private Double price;

    @ManyToMany(mappedBy = "menu")
    @Cache(usage = CacheConcurrencyStrategy.READ_ONLY,
            region = "com.example.cache_for_dummies.entity.MenuItemEntity")
    private List<RestaurantEntity> restaurants;

}
