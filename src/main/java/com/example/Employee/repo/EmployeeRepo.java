package com.example.Employee.repo;

import com.example.Employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository <Employee, Long>{
}
