package com.vladyslav.springBoo.DAO;

import com.vladyslav.springBoo.Entity.Employee;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Queue;

@Repository
public class EmployeeDAOImpl implements IEmployeeDAO {

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }

    @Override
    public List<Employee> findAll() {

        Session currenSession = entityManager.unwrap(Session.class);

        List<Employee> employees = currenSession.createQuery("from Employee").getResultList();

        return employees;
    }

    @Override
    public Employee findById(int theId) {

        Session currentSession = entityManager.unwrap(Session.class);


        return currentSession.get(Employee.class, theId);
    }

    @Override
    public void save(Employee theEmployee) {

        Session currentSession = entityManager.unwrap(Session.class);

        theEmployee.setId(0);

        currentSession.save(theEmployee);

    }
}
