package com.greatlearning.employee_management.dao;

import com.greatlearning.employee_management.entity.Employee;
import com.greatlearning.employee_management.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Optional<Employee> findByFirstName(String firstName);

}