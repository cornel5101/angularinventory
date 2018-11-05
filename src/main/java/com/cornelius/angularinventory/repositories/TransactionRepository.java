package com.cornelius.angularinventory.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cornelius.angularinventory.entities.Transaction;

public interface TransactionRepository extends JpaRepository <Transaction, Integer>{

}
