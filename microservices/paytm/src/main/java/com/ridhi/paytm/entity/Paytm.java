package com.ridhi.paytm.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "payment")
public class Paytm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String food;

    private double amount;

    private String transactionId;

    private boolean success;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "PaymentEntity{" +
                "amount=" + amount +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", food='" + food + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", success=" + success +
                '}';
    }
}