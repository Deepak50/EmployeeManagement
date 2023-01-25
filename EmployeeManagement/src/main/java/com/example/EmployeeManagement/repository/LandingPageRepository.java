package com.example.EmployeeManagement.repository;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.EmployeeManagement.dto.EmployeeDto;
import com.example.EmployeeManagement.entity.Employee;

public interface LandingPageRepository {
	public void test();
	public String add(EmployeeDto employeeDto);
	public String delete(int id);
	public List<Employee> retrieveAll();
	public void updateEmployee(EmployeeDto employeeDto);
}
