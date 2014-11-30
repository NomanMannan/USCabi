/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uscabi.clientservices;

import com.uscabi.commons.Car;
import com.uscabi.commons.Customer;

/**
 *
 * @author noman-pc
 */
public interface ICustomerService {
    
    public void addCustomer(Customer customer);

    public void updateCustomer(Customer customer);

    public void disableCustomer(Customer customer);
    
    public void sendFeedback(Customer customer, Car car);
    
    public void bookCar(Customer customer, Car car);
    
    public void payFare(Customer customer, Car car);
    
    public void searchCar(Customer customer);
    
    public void cancelBooking(Customer customer, Car car);
    
    public void updateLocation(Customer customer);
    
}
