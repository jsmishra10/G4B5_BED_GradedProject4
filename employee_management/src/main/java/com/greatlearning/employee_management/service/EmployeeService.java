package com.greatlearning.employee_management.service;

import com.greatlearning.employee_management.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> findAll(String sortOrder);

    public Employee findById(Long employeeId);

    public void addRecord(Employee employee);

    public void deleteRecord(Long employeeId);

    public void updateEmployee(Employee employee, Long employeeId);

    public Employee searchEmployee(String firstName);

}
