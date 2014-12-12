/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uscabi.dto.dao;

import com.uscabi.commons.Driver;
import com.uscabi.commons.Operator;
import com.uscabi.dto.idao.GenericPersistenceDAO;
import com.uscabi.dto.idao.IDriverDAO;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author noman-pc
 */
@Stateless
public class DriverDAO extends GenericPersistenceDAO<Driver, Long> implements IDriverDAO {

    @PersistenceContext(unitName = "USCabiPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DriverDAO() {
        super(Driver.class);
    }

    @Override
    public List<Driver> findAllDriverByOperator(String operatorUserName) {

//        CriteriaBuilder builder;
//        builder = em.getCriteriaBuilder();
//        CriteriaQuery<Driver> criteriaQuery = builder.createQuery(Driver.class);
//        Root<Driver> c;
//        c = criteriaQuery.from(Driver.class);
//        criteriaQuery.select(c).where(builder.equal(c.get("operator").get("user").get("username"), operatorUserName));
//        Query query = (Query) em.createQuery(criteriaQuery).getResultList();
//        List<Driver> drivers = query.getResultList();
        Query mq = em.createQuery("Select d from Driver d join Operator o join UserCredential u where d.operator=o AND u.username = :username");
        mq.setParameter("username", operatorUserName);
        List<Driver> drivers = mq.getResultList();
        return drivers;

    }

    @Override
    public Operator findOperator(String operatorUserName) {

        Query mq = em.createQuery("Select o from Operator o join UserCredential u where u.username = :username");
        mq.setParameter("username", operatorUserName);

        Operator operator = (Operator) mq.getSingleResult();

        return operator;
    }

}
