package com.tms.service;

import com.tms.dao.hibernate.OperationHibernateDao;
import com.tms.entity.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperationService {
    @Autowired
    private OperationHibernateDao operationDao;

    public void save(Operation operation){
        operationDao.save(operation);
    }
}
