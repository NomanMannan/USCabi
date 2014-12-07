/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uscabi.dto.dao;

import com.uscabi.clientservices.ICustomerService;
import com.uscabi.commons.Booking;
import com.uscabi.commons.Car;
import com.uscabi.commons.Customer;
import com.uscabi.dto.idao.GenericPersistenceDAO;
import com.uscabi.dto.idao.IBookingDAO;
import com.uscabi.dto.idao.ICustomerDAO;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author noman-pc
 */
@Stateless
public class CustomerDAO extends GenericPersistenceDAO<Customer, Long> implements ICustomerDAO, ICustomerService {

    @PersistenceContext(unitName = "USCabiPU")
    private EntityManager em;

    @EJB
    private ICustomerDAO customerDAO;

    @EJB
    private IBookingDAO bookingDAO;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CustomerDAO() {
        super(Customer.class);
    }

    public void addBooking(Booking booking) {

        bookingDAO.create(booking);
    }

    @Override
    public void addCustomer(Customer customer) {
        customerDAO.create(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void disableCustomer(Customer customer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sendFeedback(Customer customer, Car car) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void bookCar(Customer customer, Car car) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void payFare(Customer customer, Car car) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void searchCar(Customer customer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cancelBooking(Customer customer, Car car) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateLocation(Customer customer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
