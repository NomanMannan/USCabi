/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uscabi.commons;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author noman-pc
 */
@Entity
public class Customer extends Person implements Serializable {

    @OneToMany(mappedBy = "customer")
    private List<Booking> bookings;
//    @OneToMany(mappedBy = "customer")
//    private List<Payment> payments;
    private static final long serialVersionUID = 1L;

    public Customer() {
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void addBooking(Booking booking) {
        this.bookings.add(booking);
    }

//    public List<Payment> getPayments() {
//        return payments;
//    }
//
//    public void addPayment(Payment payment) {
//        this.payments.add(payment);
//    }

}
