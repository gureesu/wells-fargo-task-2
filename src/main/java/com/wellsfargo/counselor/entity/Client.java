package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue()
    private long Client_ID;

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


    @ManyToOne
    @JoinColumn(name = "Advisor_ID")
    private Advisor Advisor_ID;

    protected Client() {

    }

    public Client(Advisor Advisor_ID, String First_Name, String Last_Name, String Address, String Phone, String Email) {
        this.Advisor_ID = Advisor_ID;
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
        this.Address = Address;
        this.Phone = Phone;
        this.Email = Email;
    }

    public Advisor getAdvisor_ID() {
        return Advisor_ID;
    }

    public void setAdvisor_ID(Advisor Advisor_ID) {
        this.Advisor_ID = Advisor_ID;
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

    public void setAddress(String Address) {
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
