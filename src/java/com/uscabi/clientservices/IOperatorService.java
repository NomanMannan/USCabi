/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uscabi.clientservices;

import com.uscabi.commons.Car;
import com.uscabi.commons.Driver;
import com.uscabi.commons.Operator;

/**
 *
 * @author noman-pc
 */
public interface IOperatorService {
    
    public void addOperator(Operator operator);

    public void updateOperator(Operator operator);

    public void disableOperator(Operator operator);
    
    
    public void addCar(Car car);

    public void updateCar(Car car);

    public void disableCar(Car car);
    

    public void addDriver(Driver driver);

    public void updateDriver(Driver driver);

    public void disableDriver(Driver driver);

}
