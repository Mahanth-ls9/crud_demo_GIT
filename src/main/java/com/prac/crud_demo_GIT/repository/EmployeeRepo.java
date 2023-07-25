package com.prac.crud_demo_GIT.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prac.crud_demo_GIT.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {

}
