/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uscabi.services;

import com.uscabi.clientservices.IAdminService;
import com.uscabi.clientservices.ICustomerService;
import com.uscabi.commons.Address;
import com.uscabi.commons.Booking;
import com.uscabi.commons.Car;
import com.uscabi.commons.Customer;
import com.uscabi.commons.UserCredential;
import com.uscabi.commons.userType;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author noman-pc
 */
@SessionScoped
@ManagedBean(name = "CustomerService")
public class CustomerService implements Serializable {

    @EJB
    private ICustomerService customerDAO;
    private IAdminService adminServiceObject;

    UploadedFile file;

    private final String destination = "D:\\tmp\\";
    private String selectedIncludePath;

    private Customer customerObj;
    private static EntityManagerFactory factory;
    private String pickUsername;
    private String pickPassword;

    private Booking bookingObj;

    public Booking getBookingObj() {
        return bookingObj;
    }

    public void setBookingObj(Booking bookingObj) {
        this.bookingObj = bookingObj;
    }

    public String getPickUsername() {
        return pickUsername;
    }

    public void setPickUsername(String pickUsername) {
        this.pickUsername = pickUsername;
    }

    public String getPickPassword() {
        return pickPassword;
    }

    public void setPickPassword(String pickPassword) {
        this.pickPassword = pickPassword;
    }

    public String validateuser() {
        String flag = "failure";

        factory = Persistence.createEntityManagerFactory("USCabiPU");
        EntityManager em = factory.createEntityManager();
        Query q = em.createQuery("SELECT u FROM user WHERE u.username = :usern AND u.password = :pass");
        q.setParameter("usern", pickUsername);
        q.setParameter("password", pickPassword);

        try {
            Customer cusobj = (Customer) q.getSingleResult();
            System.out.println(cusobj.toString());
            if (pickUsername.equalsIgnoreCase(cusobj.getUser().getUsername()) && pickPassword.equals(cusobj.getUser().getPassword())) {
                flag = "commonLayout";
            }
        } catch (Exception e) {

        }
        return flag;
    }

    @PostConstruct
    public void init() {
        this.customerObj = new Customer();
        this.customerObj.setAddress(new Address());
        this.customerObj.setUser(new UserCredential());
        this.bookingObj = new Booking();
    }

    public CustomerService() {

    }

    public String getSelectedIncludePath() {
        return selectedIncludePath;
    }

    public void setSelectedIncludePath(String selectedIncludePath) {
        this.selectedIncludePath = selectedIncludePath;
    }

    public String addCustomer() {

        this.customerObj.setRegistrationDate(new java.util.Date());
        this.customerObj.setImage(hexStringToByteArray(""));
        this.customerObj.getUser().setUsertype(userType.CUSTOMER);

        this.customerDAO.addCustomer(customerObj);

//     FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Welcome  to faces!")); 
        return "";
    }

    public void addBooking() {

        System.out.println("Data-" + this.adminServiceObject.findCustomer("51").toString());

        Car carobj = new Car();
        long carid = 1;
        carobj.setId(carid);

        bookingObj.setCar(carobj);
        bookingObj.setCustomer(this.adminServiceObject.findCustomer("51"));

    }

    public static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                    + Character.digit(s.charAt(i + 1), 16));
        }
        return data;
    }

    public Customer getCustomerObj() {
        return customerObj;
    }

    public String registrationView() {

        return "Registration";
    }

    public void onDateSelect(SelectEvent event) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", format.format(event.getObject())));
    }

    public void upload(FileUploadEvent event) {
        FacesMessage msg = new FacesMessage("Success! ", event.getFile().getFileName() + " is uploaded.");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        // Do what you want with the file        
        try {
            copyFile(event.getFile().getFileName(), event.getFile().getInputstream());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void copyFile(String fileName, InputStream in) {
        try {

            // write the inputStream to a FileOutputStream
            OutputStream out = new FileOutputStream(new File(destination + fileName));

            int read = 0;
            byte[] bytes = new byte[1024];

            while ((read = in.read(bytes)) != -1) {
                out.write(bytes, 0, read);
            }

            in.close();
            out.flush();
            out.close();

            System.out.println("New file created!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void manageProfile(ActionEvent e) {
        setSelectedIncludePath("/views/customer/profile.xhtml");
    }

    public void createBooking(ActionEvent e) {
        setSelectedIncludePath("/views/customer/booking.xhtml");
    }

    public void bookingHistory(ActionEvent e) {
        setSelectedIncludePath("/views/customer/bookinghistory.xhtml");
    }

    public void nearestDriver(ActionEvent e) {
        setSelectedIncludePath("/views/customer/nearestDriver.xhtml");
    }

    /*Get Car Id*/
    public void addCarID(String strs) {

        System.out.println("Carid->" + strs);

    }

    public void testSampleData() {

        List driverArray = new ArrayList();
        HashMap hmap = new HashMap();
        hmap.put("title", "Md Adit Hasan");
        hmap.put("lat", "41.10289744");
        hmap.put("lng", "-91.83883667");
        hmap.put("description", "Md Adit Alibaug is a coastal town and a municipal council in Raigad District in ");

        driverArray.add(hmap);
        HashMap hmap1 = new HashMap();
        hmap1.put("title", "Md Adit Hasan");
        hmap1.put("lat", "41.10289744");
        hmap1.put("lng", "-91.83883667");
        hmap1.put("description", "Md Adit Alibaug is a coastal town and a municipal council in Raigad District in ");

    }

}
