package com.saima.expense.service.impl;

import com.saima.expense.dto.CategoryDto;
import com.saima.expense.entity.Category;
import com.saima.expense.mapper.CategoryMapper;
import com.saima.expense.repository.CategoryRepository;
import com.saima.expense.service.CategoryService;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;

    @Override
    public CategoryDto createCategory(CategoryDto categoryDto) {

        //convert Dto to Entity
        Category category = CategoryMapper.mapToCategory(categoryDto);

        Category savedCategory = categoryRepository.save(category);

        //convert Entity to Dto
        return CategoryMapper.mapToCategoryDto(savedCategory);
    }
}
