package com.my.techie.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.my.techie.model.Employee;
import com.my.techie.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@PostMapping("/addEmployee")
	public String saveEmployee(@RequestBody Employee emp) {
		employeeRepository.save(emp);
		return "Employee saved successfully ===> "+emp.getId();
	}
	
	@GetMapping("/findAllEmployees")
	public List<Employee> getEmployees(){
		return employeeRepository.findAll();
	}
	
	@GetMapping("/findEmployee/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable int id){
		return employeeRepository.findById(id);
	}
	
	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployeeById(@PathVariable int id) {
		employeeRepository.deleteById(id);
		return "Employee deleted successfully with id ===> " + id;
	}

}
