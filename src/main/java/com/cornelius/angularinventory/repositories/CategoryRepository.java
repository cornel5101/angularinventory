package com.cornelius.angularinventory.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.cornelius.angularinventory.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
	@Query("select c from Category c where c.categoryid =?1")
	Category findByCategoryid(Integer id);

}
