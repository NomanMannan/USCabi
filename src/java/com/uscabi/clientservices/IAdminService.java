/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uscabi.clientservices;

import com.uscabi.commons.Admin;
import com.uscabi.commons.Booking;
import com.uscabi.commons.Car;
import com.uscabi.commons.Customer;
import com.uscabi.commons.Driver;
import com.uscabi.commons.Operator;
import com.uscabi.commons.Payment;
import com.uscabi.commons.UserCredential;
import java.util.List;

/**
 *
 * @author noman-pc
 */
public interface IAdminService {

    public void addAdmin(Admin admin);
    

    public void addOperator(Operator operator);

    public void updateOperator(Operator operator);

    public void disableOperator(Operator operator);
    

    public void addCustomer(Customer customer);

    public void updateCustomer(Customer customer);

    public void disableCustomer(Customer customer);
    

    public void addCar(Car car);

    public void updateCar(Car car);

    public void disableCar(Car car);
    

    public void addDriver(Driver driver);

    public void updateDriver(Driver driver);

    public void disableDriver(Driver driver);

    
    public Operator getOperator(long id);

    public Customer getCustomer(long id);

    public Car getCar(long id);

    public Driver getDriver(long id);

    public Booking getBooking(long id);

    public Payment getPayment(long id);


    public List<Customer> getCustomers();

    public List<Operator> getOperators();

    public List<Car> getCars();

    public List<Driver> getDrivers();

    public List<Booking> getBookings();

    public List<Payment> getPayments();
    

    public Customer getCustomer(String username);

    public Operator getOperator(String username);

    public Admin getAdmin(String username);
    
    public Driver getDriver(String username);

    public UserCredential getUser(String username);

}
