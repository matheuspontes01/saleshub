package com.estudo.saleshub.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.saleshub.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
