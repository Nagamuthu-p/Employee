package com.example.Employee.service.impl;
import com.example.Employee.entity.Employee;
import java.util.List;


public interface EmployeeService {

    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(long id);
    Employee updateEmployee(Employee employee,long id);
}
