/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uscabi.services;

import com.uscabi.clientservices.IAdminService;
import com.uscabi.commons.Address;
import com.uscabi.commons.Operator;
import com.uscabi.commons.UserCredential;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

/**
 *
 * @author noman-pc
 */
@ManagedBean
@RequestScoped
public class AdminService implements Serializable {

    @EJB
    private IAdminService adminDAO;

    /**
     * Creates a new instance of AdminService
     */
//    @Inject
//    private AdminDAO adminDAO;
//    @Inject
//    private IUserCredentialDAO userDAO;
//    @Inject
//    private IOperatorDAO operatorDAO;
    private Operator operator;
    //private Address address;
    //private UserCredential user;

    private String selectedIncludePath = "/views/admin/operator.xhtml";

    private String manageOperator1;
//
//    private String manageCar;
//
//    private String manageCustomer;
//
//    private String manageDriver;
//
//    private MenuModel model;

    public AdminService() {

    }

    @PostConstruct
    public void init() {
        this.operator = new Operator();
        operator.setAddress(new Address());
        operator.setUser(new UserCredential());
        //this.address = new Address();
        //this.user = new UserCredential();
    }

    public String doAddOperator() {

        adminDAO.addOperator(operator);

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Operator Created", "The Operator of the company " + operator.getCompanyName() + "has been created with id" + operator.getId()));
        return "/views/admin/operator.xhtml";

    }
//    public String doAddOperator() {
//        System.out.println("Testing.......");
//        return null;
//    }

    public String getManageOperator() {
        return manageOperator1;
    }

    public void setManageOperator(String manageOperator1) {
        this.manageOperator1 = manageOperator1;
    }
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
//
//    public Address getAddress() {
//        return address;
//    }
//
//    public void setAddress(Address address) {
//        this.address = address;
//    }
//
//    public UserCredential getUser() {
//        return user;
//    }
//
//    public void setUser(UserCredential user) {
//        this.user = user;
//    }

    public String getSelectedIncludePath() {
        return selectedIncludePath;
    }

    public void setSelectedIncludePath(String selectedIncludePath) {
        this.selectedIncludePath = selectedIncludePath;
    }

    public void manageOperator(ActionEvent e) {
        setSelectedIncludePath("/views/admin/operator.xhtml");

        //return getSelectedIncludePath();
    }

    public void manageCar(ActionEvent e) {
        setSelectedIncludePath("/views/admin/car.xhtml");
        //return getSelectedIncludePath();
    }

    public void manageCustomer(ActionEvent e) {
        setSelectedIncludePath("/views/admin/customer.xhtml");
        //return getSelectedIncludePath();
    }

    public void manageDriver(ActionEvent e) {
        setSelectedIncludePath("/views/admin/driver.xhtml");
        //return getSelectedIncludePath();
    }

//    public void addUser(UserCredential user) {
//        this.userDAO.create(user);
//    }
//
//    public String postMessage() {
//        this.userDAO.create(userCredential);
//        return "theend";
//    }
}
