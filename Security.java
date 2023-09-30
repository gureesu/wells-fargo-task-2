package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long Security_ID;

    @Column(nullable = false)
    private String Name;

    @Column(nullable = false)
    private String Category;

    @Column(nullable = false)
    private String Purchase_Price;

    @Column(nullable = false)
    private String Purchase_Date;

    @Column(nullable = false)
    private String Quantity;


    @ManyToOne
    @JoinColumn(name = "Portfolio_ID")
    private Portfolio Portfolio_ID;

    protected Security() {

    }


    public Security(Portfolio Portfolio_ID, String Name, String Category, String Purchase_Price, String Purchase_Date, String Quantity) {
        this.Portfolio_ID = Portfolio_ID;
        this.Name = Name;
        this.Category = Category;
        this.Purchase_Price = Purchase_Price;
        this.Purchase_Date = Purchase_Date;
        this.Quantity = Quantity;
    }

    public Portfolio getPortfolio_ID() {
        return Portfolio_ID;
    }

    public void setPortfolio_ID(Portfolio Portfolio_ID) {
        this.Portfolio_ID = Portfolio_ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getPurchase_Price() {
        return Purchase_Price;
    }

    public void setPurchase_Price(String Purchase_Price) {
        this.Purchase_Price = Purchase_Price;
    }


    public String getPurchase_Date() {
        return Purchase_Date;
    }

    public void setPurchase_Date(String Purchase_Date) {
        this.Purchase_Date = Purchase_Date;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }
}
