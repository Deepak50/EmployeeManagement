package com.example.EmployeeManagement.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeManagement.dto.EmployeeDto;
import com.example.EmployeeManagement.entity.Employee;
import com.example.EmployeeManagement.repository.LandingPageRepository;
import com.example.EmployeeManagement.service.LandingPageService;

@Service
public class LandingPageServiceImpl implements LandingPageService {

	@Autowired
	LandingPageRepository landingPageRepository;

	@Override
	public void test() {
		landingPageRepository.test();
	}

	@Override
	public String add(EmployeeDto employeeDto) {
		return landingPageRepository.add(employeeDto);
	}

	@Override
	public String delete(int id) {
		return landingPageRepository.delete(id);
	}

	@Override
	public List<Employee> retrieveAll() {
		return landingPageRepository.retrieveAll();
	}

	@Override
	public void updateEmployee(EmployeeDto employeeDto) {
		landingPageRepository.updateEmployee(employeeDto);
	}

}
