package com.example.Employee.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "firstName",nullable = false)
    private  String firstName;
    @Column(name = "lastName" ,nullable = false)
    private  String lastName;
    @Column(name = "email" ,nullable = false)
    private  String email;
}
