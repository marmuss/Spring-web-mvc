package com.tms.service;

import com.tms.dao.hibernate.OperationHibernateDao;
import com.tms.entity.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoryService {
    @Autowired
    private OperationHibernateDao operationDao;

    public List<Operation> getHistory(){
        return operationDao.getAll();
    }
}
