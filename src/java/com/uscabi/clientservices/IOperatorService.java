/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uscabi.clientservices;

import com.uscabi.commons.Booking;
import com.uscabi.commons.Car;
import com.uscabi.commons.Driver;
import com.uscabi.commons.Operator;
import com.uscabi.commons.Payment;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author noman-pc
 */
public interface IOperatorService {

    public void updateOperator(Operator operator);

    public void disableOperator(Operator operator);

    public Car addCar(Car car);

    public void updateCar(Car car);

    public void disableCar(Car car);

    public Driver addDriver(Driver driver);

    public void updateDriver(Driver driver);

    public void disableDriver(Driver driver);

    public Car findCar(long id);

    public Driver findDriver(long id);

    public Booking findBooking(long id);

    public Payment findPayment(long id);

    public List<Car> findCars();

    public List<Driver> findDrivers();

    public List<Booking> findBookings();

    public List<Payment> findPayments();

    public Driver findDriver(String username);

}
