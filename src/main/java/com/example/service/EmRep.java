package com.example.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.entity.Employee;

public interface EmRep extends JpaRepository<Employee, Integer> {
	@Query(value = "SELECT e FROM Employee e WHERE e.empName LIKE '%' || :keyword || '%'"
			+ " OR e.empEmail LIKE '%' || :keyword || '%'" + " OR e.empAddress LIKE '%' || :keyword || '%'")
	public List<Employee> search(@Param("keyword") String keyword);
}
