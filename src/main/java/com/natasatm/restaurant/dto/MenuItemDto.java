package com.natasatm.restaurant.dto;

import com.natasatm.restaurant.model.MenuEntityCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MenuItemDto {
    private Long id;

    private String name;

    private String description;

    private Boolean active;

    private BigDecimal price;

    private MenuEntityCategory menuCategory;

    private String pictureUrl;


}
