package com.example.Employee.service.impl;

import com.example.Employee.Exception.ResourceNotFoundException;
import com.example.Employee.entity.Employee;
import com.example.Employee.repo.EmployeeRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepo employeeRepo;

    public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }


    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee getEmployeeById(long id) {
        Optional<Employee> emp = employeeRepo.findById(id);
        if (emp.isPresent()) {
            return emp.get();
        }else{
            throw new ResourceNotFoundException("Empolyee","id",id);
        }
    }

    @Override
    public Employee updateEmployee(Employee employee,long id) {
        Optional<Employee> emp = employeeRepo.findById(id);
        if (emp.isPresent()) {
            employee.setFirstName(employee.getFirstName());
            employee.setLastName(employee.getLastName());
            employee.setEmail(employee.getEmail());
            return employeeRepo.save(employee);
        }else{
            throw new ResourceNotFoundException("Empolyee","id",id);
        }

    }
}
