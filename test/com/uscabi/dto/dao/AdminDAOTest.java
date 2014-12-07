/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uscabi.dto.dao;

import com.uscabi.commons.Admin;
import com.uscabi.commons.Booking;
import com.uscabi.commons.Car;
import com.uscabi.commons.Customer;
import com.uscabi.commons.Driver;
import com.uscabi.commons.Operator;
import com.uscabi.commons.Payment;
import com.uscabi.commons.UserCredential;
import java.util.List;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author noman-pc
 */
public class AdminDAOTest extends TestCase{

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of create method, of class AdminDAO.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        Admin entity = null;
        AdminDAO instance = new AdminDAO();
        instance.create(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class AdminDAO.
     */
    @Test
    public void testEdit() throws Exception {
        System.out.println("edit");
        Admin entity = null;
        AdminDAO instance = new AdminDAO();
        instance.edit(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class AdminDAO.
     */
    @Test
    public void testRemove() throws Exception {
        System.out.println("remove");
        Admin entity = null;
        AdminDAO instance = new AdminDAO();
        instance.remove(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class AdminDAO.
     */
    @Test
    public void testFind() throws Exception {
        System.out.println("find");
        Class<Admin> entity = null;
        Long id = null;
        AdminDAO instance = new AdminDAO();
        Admin expResult = null;
        Admin result = instance.find(entity, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class AdminDAO.
     */
    @Test
    public void testFindAll() throws Exception {
        System.out.println("findAll");
        AdminDAO instance = new AdminDAO();
        List<Admin> expResult = null;
        List<Admin> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findRange method, of class AdminDAO.
     */
    @Test
    public void testFindRange() throws Exception {
        System.out.println("findRange");
        int[] range = null;
        AdminDAO instance = new AdminDAO();
        List<Admin> expResult = null;
        List<Admin> result = instance.findRange(range);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of count method, of class AdminDAO.
     */
    @Test
    public void testCount() throws Exception {
        System.out.println("count");
        AdminDAO instance = new AdminDAO();
        int expResult = 0;
        int result = instance.count();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addAdmin method, of class AdminDAO.
     */
    @Test
    public void testAddAdmin() throws Exception {
        System.out.println("addAdmin");
        Admin admin = null;
        AdminDAO instance = new AdminDAO();
        Admin expResult = null;
        Admin result = instance.addAdmin(admin);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addOperator method, of class AdminDAO.
     */
    @Test
    public void testAddOperator() throws Exception {
        System.out.println("addOperator");
        Operator operator = null;
        AdminDAO instance = new AdminDAO();
        Operator expResult = null;
        Operator result = instance.addOperator(operator);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateOperator method, of class AdminDAO.
     */
    @Test
    public void testUpdateOperator() throws Exception {
        System.out.println("updateOperator");
        Operator operator = null;
        AdminDAO instance = new AdminDAO();
        instance.updateOperator(operator);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of disableOperator method, of class AdminDAO.
     */
    @Test
    public void testDisableOperator() throws Exception {
        System.out.println("disableOperator");
        Operator operator = null;
        AdminDAO instance = new AdminDAO();
        instance.disableOperator(operator);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCustomer method, of class AdminDAO.
     */
    @Test
    public void testAddCustomer() throws Exception {
        System.out.println("addCustomer");
        Customer customer = null;
        AdminDAO instance = new AdminDAO();
        Customer expResult = null;
        Customer result = instance.addCustomer(customer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCustomer method, of class AdminDAO.
     */
    @Test
    public void testUpdateCustomer() throws Exception {
        System.out.println("updateCustomer");
        Customer customer = null;
        AdminDAO instance = new AdminDAO();
        instance.updateCustomer(customer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of disableCustomer method, of class AdminDAO.
     */
    @Test
    public void testDisableCustomer() throws Exception {
        System.out.println("disableCustomer");
        Customer customer = null;
        AdminDAO instance = new AdminDAO();
        instance.disableCustomer(customer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCar method, of class AdminDAO.
     */
    @Test
    public void testAddCar() throws Exception {
        System.out.println("addCar");
        Car car = null;
        AdminDAO instance = new AdminDAO();
        Car expResult = null;
        Car result = instance.addCar(car);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateCar method, of class AdminDAO.
     */
    @Test
    public void testUpdateCar() throws Exception {
        System.out.println("updateCar");
        Car car = null;
        AdminDAO instance = new AdminDAO();
        instance.updateCar(car);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of disableCar method, of class AdminDAO.
     */
    @Test
    public void testDisableCar() throws Exception {
        System.out.println("disableCar");
        Car car = null;
        AdminDAO instance = new AdminDAO();
        instance.disableCar(car);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addDriver method, of class AdminDAO.
     */
    @Test
    public void testAddDriver() throws Exception {
        System.out.println("addDriver");
        Driver driver = null;
        AdminDAO instance = new AdminDAO();
        Driver expResult = null;
        Driver result = instance.addDriver(driver);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateDriver method, of class AdminDAO.
     */
    @Test
    public void testUpdateDriver() throws Exception {
        System.out.println("updateDriver");
        Driver driver = null;
        AdminDAO instance = new AdminDAO();
        instance.updateDriver(driver);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of disableDriver method, of class AdminDAO.
     */
    @Test
    public void testDisableDriver() throws Exception {
        System.out.println("disableDriver");
        Driver driver = null;
        AdminDAO instance = new AdminDAO();
        instance.disableDriver(driver);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOperator method, of class AdminDAO.
     */
    @Test
    public void testFindOperator_long() throws Exception {
        System.out.println("findOperator");
        long id = 0L;
        AdminDAO instance = new AdminDAO();
        Operator expResult = null;
        Operator result = instance.findOperator(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findCustomer method, of class AdminDAO.
     */
    @Test
    public void testFindCustomer_long() throws Exception {
        System.out.println("findCustomer");
        long id = 0L;
        AdminDAO instance = new AdminDAO();
        Customer expResult = null;
        Customer result = instance.findCustomer(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findCar method, of class AdminDAO.
     */
    @Test
    public void testFindCar() throws Exception {
        System.out.println("findCar");
        long id = 0L;
        AdminDAO instance = new AdminDAO();
        Car expResult = null;
        Car result = instance.findCar(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findDriver method, of class AdminDAO.
     */
    @Test
    public void testFindDriver_long() throws Exception {
        System.out.println("findDriver");
        long id = 0L;
        AdminDAO instance = new AdminDAO();
        Driver expResult = null;
        Driver result = instance.findDriver(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findBooking method, of class AdminDAO.
     */
    @Test
    public void testFindBooking() throws Exception {
        System.out.println("findBooking");
        long id = 0L;
        AdminDAO instance = new AdminDAO();
        Booking expResult = null;
        Booking result = instance.findBooking(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findPayment method, of class AdminDAO.
     */
    @Test
    public void testFindPayment() throws Exception {
        System.out.println("findPayment");
        long id = 0L;
        AdminDAO instance = new AdminDAO();
        Payment expResult = null;
        Payment result = instance.findPayment(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findCustomers method, of class AdminDAO.
     */
    @Test
    public void testFindCustomers() throws Exception {
        System.out.println("findCustomers");
        AdminDAO instance = new AdminDAO();
        List<Customer> expResult = null;
        List<Customer> result = instance.findCustomers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOperators method, of class AdminDAO.
     */
    @Test
    public void testFindOperators() throws Exception {
        System.out.println("findOperators");
        AdminDAO instance = new AdminDAO();
        List<Operator> expResult = null;
        List<Operator> result = instance.findOperators();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findCars method, of class AdminDAO.
     */
    @Test
    public void testFindCars() throws Exception {
        System.out.println("findCars");
        AdminDAO instance = new AdminDAO();
        List<Car> expResult = null;
        List<Car> result = instance.findCars();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findDrivers method, of class AdminDAO.
     */
    @Test
    public void testFindDrivers() throws Exception {
        System.out.println("findDrivers");
        AdminDAO instance = new AdminDAO();
        List<Driver> expResult = null;
        List<Driver> result = instance.findDrivers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findBookings method, of class AdminDAO.
     */
    @Test
    public void testFindBookings() throws Exception {
        System.out.println("findBookings");
        AdminDAO instance = new AdminDAO();
        List<Booking> expResult = null;
        List<Booking> result = instance.findBookings();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findPayments method, of class AdminDAO.
     */
    @Test
    public void testFindPayments() throws Exception {
        System.out.println("findPayments");
        AdminDAO instance = new AdminDAO();
        List<Payment> expResult = null;
        List<Payment> result = instance.findPayments();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findCustomer method, of class AdminDAO.
     */
    @Test
    public void testFindCustomer_String() throws Exception {
        System.out.println("findCustomer");
        String username = "";
        AdminDAO instance = new AdminDAO();
        Customer expResult = null;
        Customer result = instance.findCustomer(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findOperator method, of class AdminDAO.
     */
    @Test
    public void testFindOperator_String() throws Exception {
        System.out.println("findOperator");
        String username = "";
        AdminDAO instance = new AdminDAO();
        Operator expResult = null;
        Operator result = instance.findOperator(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAdmin method, of class AdminDAO.
     */
    @Test
    public void testFindAdmin() throws Exception {
        System.out.println("findAdmin");
        String username = "";
        AdminDAO instance = new AdminDAO();
        Admin expResult = null;
        Admin result = instance.findAdmin(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findDriver method, of class AdminDAO.
     */
    @Test
    public void testFindDriver_String() throws Exception {
        System.out.println("findDriver");
        String username = "";
        AdminDAO instance = new AdminDAO();
        Driver expResult = null;
        Driver result = instance.findDriver(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findUser method, of class AdminDAO.
     */
    @Test
    public void testFindUser() throws Exception {
        System.out.println("findUser");
        String username = "";
        AdminDAO instance = new AdminDAO();
        UserCredential expResult = null;
        UserCredential result = instance.findUser(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
