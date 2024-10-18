package com.example.Employee.service.impl;

import com.example.Employee.entity.Employee;
import org.springframework.context.annotation.Bean;


public interface EmployeeService {

    Employee saveEmployee(Employee employee);
}
