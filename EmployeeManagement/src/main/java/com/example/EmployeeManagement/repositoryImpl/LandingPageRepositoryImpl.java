package com.example.EmployeeManagement.repositoryImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.EmployeeManagement.dto.EmployeeDto;
import com.example.EmployeeManagement.entity.Employee;
import com.example.EmployeeManagement.repository.LandingPageRepository;

@Repository
@Transactional
public class LandingPageRepositoryImpl implements LandingPageRepository {
	
	
	public Employee giveEmployeeDo(EmployeeDto employeeDto){
		Employee employee = new Employee();
		employee.setId(employeeDto.getId());
		employee.setFirstName(employeeDto.getFirstName());
		employee.setLastName(employeeDto.getLastName());
		employee.setDetails(employeeDto.getDetails());
		return employee;
	}
	
	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public void test(){
		System.out.println("Working");
	}

	@Override
	public String add(EmployeeDto employeeDto) {
		Employee employee = giveEmployeeDo(employeeDto);
		entityManager.merge(employee);
		return "Successfully Inserted";
	}

	@Override
	public String delete(int id) {
		Employee employee = new Employee();
		employee.setId(id);
		//entityManager.remove(employee);
		Query q = entityManager.createQuery("delete Employee where id =: id");
		q.setParameter("id", id);
		q.executeUpdate();
		return "Successfully deleted";
	}

	@Override
	public List<Employee> retrieveAll() {
		Query q = entityManager.createNamedQuery("allEmployees",Employee.class);
		List<Employee> employees = q.getResultList();
		return employees;
	}

	@Override
	public void updateEmployee(EmployeeDto employeeDto) {	
		Query add = entityManager.createQuery("update Employee set firstName =: firstName, lastName =: lastName, details =: details where id =: id");
		add.setParameter("firstName", employeeDto.getFirstName());
		add.setParameter("lastName", employeeDto.getLastName());
		add.setParameter("details", employeeDto.getDetails());
		add.setParameter("id", employeeDto.getId());
		add.executeUpdate();
		//entityManager.merge(giveEmployeeDo(employeeDto));
		System.out.println("Successfully Updated");
	}
}
