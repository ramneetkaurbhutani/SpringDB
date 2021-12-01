package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.Employee;

@Service
@Transactional
public class EmpDAO {

	@Autowired
	EmRep empr;

	public Employee insert(Employee e) {
		return empr.save(e);
	}

	public List<Employee> getAll() {
		return empr.findAll();
	}

	public Employee get(int id) {
		return empr.findById(id).get();
	}

	public void delete(int id) {
		empr.deleteById(id);
	}

	public List<Employee> search(String keyword) {
		return empr.search(keyword);
	}
}
