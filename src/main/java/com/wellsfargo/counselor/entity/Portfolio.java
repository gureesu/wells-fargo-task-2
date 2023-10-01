package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import javax.sound.sampled.Port;
import java.time.LocalDate;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long Portfolio_ID;

    @Column(nullable = false)
    private String Creation_Date;



    @ManyToOne
    @JoinColumn(name = "Client_ID")
    private Client Client_ID;

    protected Portfolio() {

    }

    public Portfolio(Client Client_ID, String Creation_Date) {
        this.Client_ID = Client_ID;
        this.Creation_Date = Creation_Date;
    }

    public Client getClient_ID() {
        return Client_ID;
    }

    public void setClient_ID(Client Client_ID) {
        this.Client_ID = Client_ID;
    }

    public String getCreation_Date() {
        return Creation_Date;
    }

    public void setCreation_Date(String Creation_Date) {
        this.Creation_Date = Creation_Date;
    }
}