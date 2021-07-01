package com.po;

import java.util.Date;

public class User {
    private Integer UID;
    private Integer AID;
    private Date reqTime;
    private String accountNumber;
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "UID=" + UID +
                ", AID=" + AID +
                ", reqTime=" + reqTime +
                ", accountNumber='" + accountNumber + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Integer getUID() {
        return UID;
    }

    public void setUID(Integer UID) {
        this.UID = UID;
    }

    public Integer getAID() {
        return AID;
    }

    public void setAID(Integer AID) {
        this.AID = AID;
    }

    public Date getReqTime() {
        return reqTime;
    }

    public void setReqTime(Date reqTime) {
        this.reqTime = reqTime;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }

    public User(Integer UID, Integer AID, Date reqTime, String accountNumber, String password) {
        this.UID = UID;
        this.AID = AID;
        this.reqTime = reqTime;
        this.accountNumber = accountNumber;
        this.password = password;
    }
}
