package com.ra.service;

import com.ra.model.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    Category findById(Integer id);
    Boolean saveOrUpdate(Category category);
    void delete(Integer id);
}
