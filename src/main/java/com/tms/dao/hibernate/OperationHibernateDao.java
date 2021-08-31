package com.tms.dao.hibernate;

import com.tms.entity.Operation;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class OperationHibernateDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public void save(Operation operation){
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.save(operation);
    }

    @Transactional
    public List<Operation> getAll(){
        Session currentSession = sessionFactory.getCurrentSession();
        Query<Operation> query = currentSession.createQuery("from Operation", Operation.class);
        return query.getResultList();
    }
}
