/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uscabi.services;

import com.uscabi.clientservices.IOperatorService;
import com.uscabi.commons.Address;
import com.uscabi.commons.Car;
import com.uscabi.commons.Customer;
import com.uscabi.commons.Driver;
import com.uscabi.commons.UserCredential;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author noman-pc
 */
@ManagedBean
@RequestScoped
public class OperatorService implements Serializable {

    @EJB
    private IOperatorService operatorDAO;

    private Driver driver;

    private Car car;

    /**
     * Creates a new instance of OperatorService
     */
    public OperatorService() {
    }
//
//     public List<Driver> doDriverStatusNotification() {
//        return operatorDAO.
//    }

    @PostConstruct
    public void init() {

        this.driver = new Driver();
        driver.setAddress(new Address());
        driver.setUser(new UserCredential());

        this.car = new Car();

    }
    
    public String doAddDriver() {

        operatorDAO.addDriver(driver);

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Driver Created", "The Driver of the name " + driver.getLastName() + "has been created with id" + driver.getId()));
        
        return "/views/operator/driver.xhtml";

    }

    public List<Driver> doFindAllDriver() {

        return operatorDAO.findDrivers();

    }

    public String doAddCar() {

        operatorDAO.addCar(car);

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Car Created", "The Car of the number " + car.getCarNumber() + "has been created with id" + car.getId()));

        return "/views/operator/car.xhtml";

    }

    public List<Car> doFindAllCar() {

        return operatorDAO.findCars();

    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
    
    


}
