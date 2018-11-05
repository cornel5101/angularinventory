package com.cornelius.angularinventory.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cornelius.angularinventory.entities.Usertype;

public interface UsertypeRepository extends JpaRepository <Usertype, Integer> {
	@Query("select u from Usertype u WHERE u.typeid=?1")
	Usertype findUserTypeById(Integer id);
}
