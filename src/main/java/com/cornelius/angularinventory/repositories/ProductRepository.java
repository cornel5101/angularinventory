package com.cornelius.angularinventory.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cornelius.angularinventory.entities.Product;

public interface ProductRepository extends JpaRepository <Product, Integer> {

}
