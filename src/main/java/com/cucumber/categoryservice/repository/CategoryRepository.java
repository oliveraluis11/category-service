package com.cucumber.categoryservice.repository;

import com.cucumber.categoryservice.document.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends MongoRepository<Category, String> {
    void deleteCategoryByName(String name);
}
