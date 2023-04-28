package com.tymeleaf.tymeleaf_project.service;

import java.util.List;

import com.tymeleaf.tymeleaf_project.model.Employee;

public interface IEmployeeService {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);
}