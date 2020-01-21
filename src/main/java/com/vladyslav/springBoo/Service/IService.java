package com.vladyslav.springBoo.Service;

import com.vladyslav.springBoo.Entity.Employee;

import java.util.List;

public interface IService {

    List<Employee> findAll();

    Employee findEmployeeById(int theId);

    void save(Employee theEmployee);
}
