package com.pluralsight.NorthwindTradersApi.controllers;

import com.pluralsight.NorthwindTradersApi.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/categorys")
public class CategoryController{
    private final List<Category> categoryList = new ArrayList<>();
    public CategoryController() {
        categoryList.add(new Category(1, "Beverages"));
        categoryList.add(new Category(2, "Condiments"));
        categoryList.add(new Category(3, "Confections"));
        categoryList.add(new Category(17, "Special Offers"));
    }

    @GetMapping
    public List<Category> getCategoryList(){
        return categoryList;
    }
    @GetMapping("{/id}")
    public Category getCategory(@PathVariable int id){
        for(Category c : categoryList){
            return c;
        }
        return null;
    }
}