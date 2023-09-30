package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Advisor {

    @Id
    @GeneratedValue()
    private long Advisor_ID;

    @Column(nullable = false)
    private String First_Name;

    @Column(nullable = false)
    private String Last_Name;

    @Column(nullable = false)
    private String Address;

    @Column(nullable = false)
    private String Phone;

    @Column(nullable = false)
    private String Email;

    protected Advisor() {

    }

    public Advisor(String First_Name, String Last_Name, String Address, String Phone, String Email) {
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
        this.Address = Address;
        this.Phone = Phone;
        this.Email = Email;
    }

    public Long getAdvisor_ID() {
        return Advisor_ID;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String First_Name) {
        this.First_Name = First_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String Last_Name) {
        this.Last_Name = Last_Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = Address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
}