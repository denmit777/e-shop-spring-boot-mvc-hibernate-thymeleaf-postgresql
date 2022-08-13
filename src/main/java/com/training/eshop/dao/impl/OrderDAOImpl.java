package com.training.eshop.dao.impl;

import com.training.eshop.dao.OrderDAO;
import com.training.eshop.model.Order;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@AllArgsConstructor
public class OrderDAOImpl implements OrderDAO {

    @PersistenceContext
    private final EntityManager entityManager;

    @Override
    public void save(Order order) {
        entityManager.persist(order);
    }
}
