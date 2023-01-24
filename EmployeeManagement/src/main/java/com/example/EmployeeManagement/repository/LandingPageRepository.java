package com.example.EmployeeManagement.repository;

import java.util.List;

import com.example.EmployeeManagement.dto.EmployeeDto;
import com.example.EmployeeManagement.entity.Employee;

public interface LandingPageRepository {
	public void test();
	public String add(EmployeeDto employeeDto);
	public String delete(int id);
	public List<Employee> retrieveAll();
}
