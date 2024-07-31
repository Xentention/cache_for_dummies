package com.example.cache_for_dummies.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder(toBuilder = true)
public class MenuItemDto {

    Long id;
    String name;
    Integer calories;
    Double price;
    List<RestaurantDto> restaurants;

}
