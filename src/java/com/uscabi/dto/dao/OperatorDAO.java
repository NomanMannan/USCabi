/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uscabi.dto.dao;

import com.uscabi.commons.Operator;
import com.uscabi.dto.idao.GenericPersistenceDAO;
import com.uscabi.dto.idao.IOperatorDAO;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author noman-pc
 */
@Stateless
public class OperatorDAO extends GenericPersistenceDAO<Operator, Long> implements IOperatorDAO {

    @PersistenceContext(unitName = "USCabiPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OperatorDAO() {
        super(Operator.class);
    }

}
