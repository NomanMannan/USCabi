/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uscabi.services;

import com.uscabi.clientservices.IAdminService;
import com.uscabi.commons.Admin;
import com.uscabi.commons.Booking;
import com.uscabi.commons.Car;
import com.uscabi.commons.Customer;
import com.uscabi.commons.Driver;
import com.uscabi.commons.Operator;
import com.uscabi.commons.Payment;
import com.uscabi.commons.UserCredential;
import com.uscabi.dto.idao.IUserCredentialDAO;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;
import org.primefaces.context.RequestContext;
import org.primefaces.model.menu.MenuModel;

/**
 *
 * @author noman-pc
 */
@Named
@ManagedBean
@RequestScoped
public class AdminService implements IAdminService {

    /**
     * Creates a new instance of AdminService
     */
    @EJB
    private IUserCredentialDAO userDAO;

    private UserCredential userCredential;

    private String selectedIncludePath;

    private String manageOperator;

    private String manageCar;

    private String manageCustomer;

    private String manageDriver;

    private MenuModel model;

    public AdminService() {
        this.userCredential = new UserCredential();
    }

    public String getSelectedIncludePath() {
        return selectedIncludePath;
    }

    public void setSelectedIncludePath(String selectedIncludePath) {
        this.selectedIncludePath = selectedIncludePath;
    }

    public String manageOperator() {
        setSelectedIncludePath("/views/admin/operator.xhtml");

        return getSelectedIncludePath();
    }

    public String manageCar() {
        setSelectedIncludePath("/views/admin/car.xhtml");
        return getSelectedIncludePath();
    }

    public String manageCustomer() {
        setSelectedIncludePath("/views/admin/customer.xhtml");
        return getSelectedIncludePath();
    }

    public String manageDriver() {
        setSelectedIncludePath("/views/admin/driver.xhtml");
        return getSelectedIncludePath();
    }

    public void addUser(UserCredential user) {
        this.userDAO.create(user);
    }

    public String postMessage() {
        this.userDAO.create(userCredential);
        return "theend";
    }

    public UserCredential getUser() {
        return userCredential;
    }

    //test end 
    @Override
    public void addAdmin(Admin admin) {
        //this.adminDAO.create(admin);
    }

    @Override
    public void addOperator(Operator operator) {

    }

    @Override
    public void updateOperator(Operator operator) {

    }

    @Override
    public void disableOperator(Operator operator) {

    }

    @Override
    public void addCustomer(Customer customer) {

    }

    @Override
    public void updateCustomer(Customer customer) {

    }

    @Override
    public void disableCustomer(Customer customer) {

    }

    @Override
    public void addCar(Car car) {

    }

    @Override
    public void updateCar(Car car) {

    }

    @Override
    public void disableCar(Car car) {

    }

    @Override
    public void addDriver(Driver driver) {

    }

    @Override
    public void updateDriver(Driver driver) {

    }

    @Override
    public void disableDriver(Driver driver) {

    }

    @Override
    public Operator getOperator(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Customer getCustomer(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Car getCar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Driver getDriver(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Booking getBooking(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Payment getPayment(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Customer> getCustomers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Operator> getOperators() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Car> getCars() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Driver> getDrivers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Booking> getBookings() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Payment> getPayments() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Customer getCustomer(String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Operator getOperator(String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Admin getAdmin(String username) {
        // return admin;
        return null;
    }

    @Override
    public Driver getDriver(String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UserCredential getUser(String username) {
        return userCredential;
    }

}
