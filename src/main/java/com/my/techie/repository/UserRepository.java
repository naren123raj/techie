package com.my.techie.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.my.techie.model.Employee;
import com.my.techie.model.User;

public interface UserRepository extends MongoRepository<User, String> {

}
