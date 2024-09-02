package com.wellsfargo.counselor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long accountId;

    @Column(nullable = false)
    private String accountType;

    @Column(nullable = false)
    private double balance;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    // No-arg constructor required by JPA
    protected Account() {
    }

    // Constructor to initialize fields
    public Account(String accountType, double balance, Client client) {
        this.accountType = accountType;
        this.balance = balance;
        this.client = client;
    }

    // Getters and Setters
    public long getAccountId() {
        return accountId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
