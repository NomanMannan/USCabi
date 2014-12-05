package com.uscabi.dto.dao;

import com.uscabi.clientservices.IAdminService;
import com.uscabi.commons.Admin;
import com.uscabi.commons.Booking;
import com.uscabi.commons.Car;
import com.uscabi.commons.Customer;
import com.uscabi.commons.Driver;
import com.uscabi.commons.Operator;
import com.uscabi.commons.Payment;
import com.uscabi.commons.UserCredential;
import com.uscabi.dto.idao.GenericPersistenceDAO;
import com.uscabi.dto.idao.IAdminDAO;
import com.uscabi.dto.idao.IOperatorDAO;
import com.uscabi.dto.idao.IUserCredentialDAO;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
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
@Named
@Stateless
public class AdminDAO extends GenericPersistenceDAO<Admin, Long> implements IAdminDAO, IAdminService {

    @PersistenceContext(unitName = "USCabiPU")
    private EntityManager em;
    
    @EJB
    private IOperatorDAO operatorDAO;
   
    private IUserCredentialDAO userDAO;
    //private IOperatorDAO operatorDAO;

    private UserCredential userCredential;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AdminDAO() {
        super(Admin.class);
    }

    @Override
    public Admin addAdmin(Admin admin) {
        //this.adminDAO.create(admin);
        return null;
    }

    @Override
    public Operator addOperator(Operator operator) {
        //em.persist(operator);
        
        operatorDAO.create(operator);
        return operator;
    }

    @Override
    public void updateOperator(Operator operator) {

    }

    @Override
    public void disableOperator(Operator operator) {

    }

    @Override
    public Customer addCustomer(Customer customer) {
        return null;
    }

    @Override
    public void updateCustomer(Customer customer) {

    }

    @Override
    public void disableCustomer(Customer customer) {

    }

    @Override
    public Car addCar(Car car) {
        return null;
    }

    @Override
    public void updateCar(Car car) {

    }

    @Override
    public void disableCar(Car car) {

    }

    @Override
    public Driver addDriver(Driver driver) {
        return null;
    }

    @Override
    public void updateDriver(Driver driver) {

    }

    @Override
    public void disableDriver(Driver driver) {

    }

    @Override
    public Operator findOperator(long id) {
        return operatorDAO.find(Operator.class, id);
    }

    @Override
    public Customer findCustomer(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Car findCar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Driver findDriver(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Booking findBooking(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Payment findPayment(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Customer> findCustomers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Operator> findOperators() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Car> findCars() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Driver> findDrivers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Booking> findBookings() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Payment> findPayments() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Customer findCustomer(String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Operator findOperator(String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Admin findAdmin(String username) {
        // return admin;
        return null;
    }

    @Override
    public Driver findDriver(String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UserCredential findUser(String username) {
        return userCredential;
    }

}
