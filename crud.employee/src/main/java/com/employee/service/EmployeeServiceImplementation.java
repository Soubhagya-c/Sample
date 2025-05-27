package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entities.Employee;
import com.employee.repository.EmployeeRepository;
@Service
public class EmployeeServiceImplementation implements EmployeeService{

	@Autowired
	EmployeeRepository repo;

	public void addEmployee(Employee emp) {
		repo.save(emp);
	}
	public void updateEmployee(Employee emp) {
		repo.save(emp);
	}
	public Employee searchEmployee(int id) {
		return repo.findById(id).get();
	}
	public void deleteEmployee(int id) {
		repo.deleteById(id);
	}

	@Override
	public List<Employee> fetchAllEmployees() {
		return repo.findAll();
	}
}
