package com.cornelius.angularinventory.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cornelius.angularinventory.entities.Paymentmethod;

public interface PaymentMethodRepo extends JpaRepository <Paymentmethod, Integer> {

}
