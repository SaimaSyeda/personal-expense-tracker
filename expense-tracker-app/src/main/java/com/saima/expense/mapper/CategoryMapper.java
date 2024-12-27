package com.saima.expense.mapper;

import com.saima.expense.dto.CategoryDto;
import com.saima.expense.entity.Category;

public class CategoryMapper {

    //Map Dto to Entity
    public static Category mapToCategory(CategoryDto categoryDto) {
        return new Category(
                categoryDto.id(),
                categoryDto.name()
        );
    }

    public static CategoryDto mapToCategoryDto(Category category) {
        return new CategoryDto(
                category.getId(),
                category.getName()
        );
    }
}
