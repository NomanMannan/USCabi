/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uscabi.dto.dao;

import com.uscabi.clientservices.IOperatorService;
import com.uscabi.commons.Booking;
import com.uscabi.commons.Car;
import com.uscabi.commons.Driver;
import com.uscabi.commons.Operator;
import com.uscabi.commons.Payment;
import com.uscabi.commons.userType;
import com.uscabi.dto.idao.GenericPersistenceDAO;
import com.uscabi.dto.idao.ICarDAO;
import com.uscabi.dto.idao.IDriverDAO;
import com.uscabi.dto.idao.IOperatorDAO;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author noman-pc
 */
@Stateless
public class OperatorDAO extends GenericPersistenceDAO<Operator, Long> implements IOperatorDAO, IOperatorService {

    @PersistenceContext(unitName = "USCabiPU")
    private EntityManager em;

    @EJB
    private IDriverDAO driverDAO;

    @EJB
    private ICarDAO carDAO;

    private String driverCurrentStatus;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OperatorDAO() {
        super(Operator.class);
    }

    @Schedule(minute = "*/15")
    public void driverStatusNotification() {
        List<Driver> allDriver = driverDAO.findAll();
        Iterator<Driver> itr = allDriver.iterator();
        while (itr.hasNext()) {
            Driver driver = itr.next();
            driverCurrentStatus = driver.getDriverStatus();
        }
    }

    @Override
    public void updateOperator(Operator operator) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void disableOperator(Operator operator) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Car addCar(Car car) {
        carDAO.create(car);
        return car;
    }

    @Override
    public void updateCar(Car car) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void disableCar(Car car) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Driver addDriver(Driver driver) {
        Date registrationDate = new Date();
        driver.setRegistrationDate(registrationDate);
        driver.getUser().setUsertype(userType.DRIVER);
        driverDAO.create(driver);
        return driver;
    }

    @Override
    public void updateDriver(Driver driver) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void disableDriver(Driver driver) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Car findCar(long id) {
        return carDAO.find(Car.class, id);
    }

    @Override
    public Driver findDriver(long id) {
        return driverDAO.find(Driver.class, id);
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
    public List<Car> findCars() {
        return carDAO.findAll();
    }

    @Override
    public List<Driver> findDrivers() {
        return driverDAO.findAll();
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
    public Driver findDriver(String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
