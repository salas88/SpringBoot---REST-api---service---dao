package com.vladyslav.springBoo.Service;

import com.vladyslav.springBoo.DAO.IEmployeeDAO;
import com.vladyslav.springBoo.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ServiceImpl implements IService {

    private IEmployeeDAO iEmployeeDAO;

    @Autowired

    public ServiceImpl(IEmployeeDAO theIEmployeeDAO){

        iEmployeeDAO = theIEmployeeDAO;

    }

    @Override
    @Transactional
    public List<Employee> findAll() {
        return iEmployeeDAO.findAll();
    }

    @Override
    @Transactional
    public Employee findEmployeeById(int theId) {

        return iEmployeeDAO.findById(theId);
    }

    @Override
    @Transactional
    public void save(Employee theEmployee) {

        iEmployeeDAO.save(theEmployee);
    }

    @Override
    @Transactional
    public void deleteById(int theId) {

        iEmployeeDAO.deleteById(theId);
    }

    @Override
    @Transactional
    public void update(Employee theEmployee) {
        iEmployeeDAO.update(theEmployee);
    }
}
