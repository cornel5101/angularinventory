package com.cornelius.angularinventory.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cornelius.angularinventory.entities.Brand;

public interface BrandRepository extends JpaRepository <Brand, Integer> {
	@Query("select b from Brand b where b.brandid=?1")
	Brand findBrandById(Integer id);

}
