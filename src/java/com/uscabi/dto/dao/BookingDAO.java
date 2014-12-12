/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uscabi.dto.dao;

import com.uscabi.commons.Booking;
import com.uscabi.commons.Car;
import com.uscabi.dto.idao.GenericPersistenceDAO;
import com.uscabi.dto.idao.IBookingDAO;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author noman-pc
 */
@Stateless
public class BookingDAO extends GenericPersistenceDAO<Booking, Long> implements IBookingDAO {

    @PersistenceContext(unitName = "USCabiPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BookingDAO() {
        super(Booking.class);
    }

    @Override
    public List<Booking> findAllBookingByOperator(String operatorUserName) {
        Query mq = em.createQuery("Select c from Car c join Driver d join Operator o join UserCredential u where c.driver=d AND d.operator=o AND u.username = :username");
        mq.setParameter("username", operatorUserName);
        List<Booking> bookings = mq.getResultList();
        return bookings;
    }

}
