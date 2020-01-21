package com.vladyslav.springBoo.DAO;

import com.vladyslav.springBoo.Entity.Employee;

import java.util.List;

public interface IEmployeeDAO {

    List<Employee> findAll();

    Employee findById(int theId);

    void save(Employee theEmployee);
}
