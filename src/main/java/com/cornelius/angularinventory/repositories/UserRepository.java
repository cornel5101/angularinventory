package com.cornelius.angularinventory.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cornelius.angularinventory.entities.Users;

public interface UserRepository extends JpaRepository <Users, Integer> {

}
