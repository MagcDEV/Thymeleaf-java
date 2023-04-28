package com.tymeleaf.tymeleaf_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tymeleaf.tymeleaf_project.model.Employee;
import com.tymeleaf.tymeleaf_project.repository.EmployeeRepository;

@Service
public class EmployeeServiceimpl implements IEmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        this.employeeRepository.save(employee);
    }
    
}
