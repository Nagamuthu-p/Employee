package com.example.Employee.service.impl;

import com.example.Employee.entity.Employee;
import com.example.Employee.repo.EmployeeRepo;

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepo employeeRepo;

    public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }


    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }
}
