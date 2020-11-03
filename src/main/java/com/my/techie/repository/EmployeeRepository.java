package com.my.techie.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.my.techie.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Integer>{

}
