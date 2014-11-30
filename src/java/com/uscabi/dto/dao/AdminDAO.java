package com.uscabi.dto.dao;

import com.uscabi.commons.Admin;
import com.uscabi.dto.idao.GenericPersistenceDAO;
import com.uscabi.dto.idao.IAdminDAO;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author noman-pc
 */
@Stateless
public class AdminDAO extends GenericPersistenceDAO<Admin, Long> implements IAdminDAO {

    @PersistenceContext(unitName = "USCabiPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AdminDAO() {
        super(Admin.class);
    }

}
