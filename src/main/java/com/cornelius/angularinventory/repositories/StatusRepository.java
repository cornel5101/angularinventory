package com.cornelius.angularinventory.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cornelius.angularinventory.entities.Status;

public interface StatusRepository extends JpaRepository<Status, Integer> {
	@Query("select s from Status s WHERE s.description =?1")
	public List<Status> findStatusByDescription(Status status);

	@Query("select s from Status s WHERE s.statusid=?1")
	public Status findStatusById(Integer statusid );

}
