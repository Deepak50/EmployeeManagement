package com.example.EmployeeManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeManagement.dto.EmployeeDto;
import com.example.EmployeeManagement.entity.Employee;
import com.example.EmployeeManagement.service.LandingPageService;

@RestController
public class LandingPageController {
	
	@Autowired
	LandingPageService landingPageService;
	
	@RequestMapping("/test")
	public void test(){
		landingPageService.test();
	}
	
	@PostMapping("/add")
	public String addEmployee(@RequestBody EmployeeDto employeeDto){
		return landingPageService.add(employeeDto);
	}
	
	@PostMapping("/delete")
	public String deleteEmployee(@RequestBody String id){
		return landingPageService.delete(Integer.parseInt(id));
	}
	
	@GetMapping("/retrieveAll")
	public List<Employee> retrieveAll(){
		return landingPageService.retrieveAll();
	}
}
