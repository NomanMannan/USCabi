/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uscabi.services;

import com.uscabi.clientservices.IAdminService;
import com.uscabi.commons.Address;
import com.uscabi.commons.Car;
import com.uscabi.commons.Customer;
import com.uscabi.commons.Driver;
import com.uscabi.commons.Operator;
import com.uscabi.commons.UserCredential;
import com.uscabi.services.util.LoggingAOP;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.interceptor.Interceptor;
import javax.interceptor.Interceptors;
import javax.transaction.Transactional;

/**
 *
 * @author noman-pc
 */
@ManagedBean
@SessionScoped
@Transactional
public class AdminService implements Serializable {

    @EJB
    private IAdminService adminDAO;

    private Operator operator;

    private Driver driver;

    private Customer customer;

    private Car car;

    private String selectedIncludePath;

//    private String manageOperator1;
//
//    private String manageCar;
//
//    private String manageCustomer;
//
//    private String manageDriver;
    private String emailSubject;

    private String emailMessage;
//
//    private MenuModel model;

    public AdminService() {

    }

    @PostConstruct
    public void init() {
        //this.selectedIncludePath = "/views/admin/operator.xhtml";
        this.emailSubject = "USCabi Account Activation Link";
        this.emailMessage = "Your account has been created successfully";

        this.operator = new Operator();
        operator.setAddress(new Address());
        operator.setUser(new UserCredential());

        this.driver = new Driver();
        driver.setAddress(new Address());
        driver.setUser(new UserCredential());

        this.customer = new Customer();
        customer.setAddress(new Address());
        customer.setUser(new UserCredential());

        this.car = new Car();

    }

    //@Interceptors(LoggingAOP.class)
    public String doAddOperator() {

        adminDAO.addOperator(operator);
        adminDAO.sendMail(operator.getEmail(), emailSubject, emailMessage);

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Operator Created", "The Operator of the company " + operator.getCompanyName() + "has been created with id" + operator.getId()));
        setSelectedIncludePath("/views/admin/operator.xhtml");

        return "/template/admin/adminLayout.xhtml";
    }

    public List<Operator> doFindAllOperator() {
        return adminDAO.findOperators();
    }

    public String doAddDriver() {

        adminDAO.addDriver(driver);
        adminDAO.sendMail(driver.getEmail(), emailSubject, emailMessage);

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Driver Created", "The Driver of the name " + driver.getLastName() + "has been created with id" + driver.getId()));
        setSelectedIncludePath("/views/admin/driver.xhtml");
        return "/template/admin/adminLayout.xhtml";
    }

    public List<Driver> doFindAllDriver() {

        return adminDAO.findDrivers();

    }

    public String doAddCustomer() {

        adminDAO.addCustomer(customer);
        adminDAO.sendMail(customer.getEmail(), emailSubject, emailMessage);

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Customer Created", "The Customer of the name " + customer.getLastName() + "has been created with id" + customer.getId()));
        setSelectedIncludePath("/views/admin/customer.xhtml");
        return "/template/admin/adminLayout.xhtml";
    }

    public List<Customer> doFindAllCustomer() {

        return adminDAO.findCustomers();

    }

    public String doAddCar() {

        adminDAO.addCar(car);

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Car Created", "The Car of the number " + car.getCarNumber() + "has been created with id" + car.getId()));
        setSelectedIncludePath("/views/admin/car.xhtml");
        return "/template/admin/adminLayout.xhtml";
    }

    public List<Car> doFindAllCar() {

        return adminDAO.findCars();

    }

//    public String getManageOperator() {
//        return manageOperator1;
//    }
//
//    public void setManageOperator(String manageOperator1) {
//        this.manageOperator1 = manageOperator1;
//    }
//
//    public String getManageCar() {
//        return manageCar;
//    }
//
//    public void setManageCar(String manageCar) {
//        this.manageCar = manageCar;
//    }
//
//    public String getManageCustomer() {
//        return manageCustomer;
//    }
//
//    public void setManageCustomer(String manageCustomer) {
//        this.manageCustomer = manageCustomer;
//    }
//
//    public String getManageDriver() {
//        return manageDriver;
//    }
//
//    public void setManageDriver(String manageDriver) {
//        this.manageDriver = manageDriver;
//    }
    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getSelectedIncludePath() {
        return selectedIncludePath;
    }

    public void setSelectedIncludePath(String selectedIncludePath) {
        this.selectedIncludePath = selectedIncludePath;
    }

    public void manageOperator(ActionEvent e) {
        setSelectedIncludePath("/views/admin/operator.xhtml");
    }

    public void manageCar(ActionEvent e) {
        setSelectedIncludePath("/views/admin/car.xhtml");
    }

    public void manageCustomer(ActionEvent e) {
        setSelectedIncludePath("/views/admin/customer.xhtml");
    }

    public void manageDriver(ActionEvent e) {
        setSelectedIncludePath("/views/admin/driver.xhtml");
    }
}
