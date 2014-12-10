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
    
    private Long operatorId;
    
    private List<Operator> operatorList;
    
    private Long driverId;
    
    private List<Driver> driverList;

    private String emailSubject;

    private String emailMessage;


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
        driver.setOperator(new Operator());

        this.customer = new Customer();
        customer.setAddress(new Address());
        customer.setUser(new UserCredential());

        this.car = new Car();
        car.setDriver(new Driver());
        
        this.operatorList= adminDAO.findOperators();
        this.driverList=adminDAO.findDrivers();

    }

    //@Interceptors(LoggingAOP.class)
    public String doAddOperator() {

        adminDAO.addOperator(operator);
        adminDAO.sendMail(operator.getEmail(), emailSubject, emailMessage);

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Operator Created", "The Operator of the company " + operator.getCompanyName() + "has been created with id" + operator.getId()));
        setSelectedIncludePath("/views/admin/operator.xhtml");

        return "/secure/admin/home.xhtml";
    }

    public List<Operator> doFindAllOperator() {
        return adminDAO.findOperators();
    }

    public String doAddDriver() {
        operator=adminDAO.findOperator(operatorId);

        adminDAO.addDriver(driver, operator);
        adminDAO.sendMail(driver.getEmail(), emailSubject, emailMessage);

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Driver Created", "The Driver of the name " + driver.getLastName() + "has been created with id" + driver.getId()));
        setSelectedIncludePath("/views/admin/driver.xhtml");
        return "/secure/admin/home.xhtml";
    }

    public List<Driver> doFindAllDriver() {

        return adminDAO.findDrivers();

    }

    public String doAddCustomer() {

        adminDAO.addCustomer(customer);
        adminDAO.sendMail(customer.getEmail(), emailSubject, emailMessage);

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Customer Created", "The Customer of the name " + customer.getLastName() + "has been created with id" + customer.getId()));
        setSelectedIncludePath("/views/admin/customer.xhtml");
        return "/secure/admin/home.xhtml";
    }

    public List<Customer> doFindAllCustomer() {

        return adminDAO.findCustomers();

    }

    public String doAddCar() {
          driver=adminDAO.findDriver(driverId);
        
        adminDAO.addCar(car, driver);

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Car Created", "The Car of the number " + car.getCarNumber() + "has been created with id" + car.getId()));
        setSelectedIncludePath("/views/admin/car.xhtml");
        return "/secure/admin/home.xhtml";
    }

    public List<Car> doFindAllCar() {

        return adminDAO.findCars();

    }

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

    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    
    public List<Operator> getOperatorList() {
        return operatorList;
    }

    public void setOperatorList(List<Operator> operatorList) {
        this.operatorList = operatorList;
    }

    public Long getDriverId() {
        return driverId;
    }

    public void setDriverId(Long driverId) {
        this.driverId = driverId;
    }

    public List<Driver> getDriverList() {
        return driverList;
    }

    public void setDriverList(List<Driver> driverList) {
        this.driverList = driverList;
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
