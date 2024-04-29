package com.Rafael.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Rafael.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
