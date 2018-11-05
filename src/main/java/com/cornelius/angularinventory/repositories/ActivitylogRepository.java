package com.cornelius.angularinventory.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cornelius.angularinventory.entities.Activitylog;
public interface ActivitylogRepository extends JpaRepository<Activitylog, Integer> {
	@Query("select a from Activitylog a WHERE a.logid=?1")
	Activitylog findByActivitlogId(Integer id);
}
