package com.po;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class User {
    private Integer UID;
    private Integer AID;
    private Timestamp reqTime;
    private String accountNumber;
    private String password;
    private PersonalInformation0308 personalInformation0308;
    private List<Recruit0430> recruit0430List;
    private List<Application0403> application0403List;


    @Override
    public String toString() {
        return "User{" +
                "UID=" + UID +
                ", AID=" + AID +
                ", reqTime=" + reqTime +
                ", accountNumber='" + accountNumber + '\'' +
                ", password='" + password + '\'' +
                ", personalInformation0308=" + personalInformation0308 +
                ", recruit0430List=" + recruit0430List +
                ", application0403List=" + application0403List +
                '}';
    }

    public List<Recruit0430> getRecruit0430List() {
        return recruit0430List;
    }

    public void setRecruit0430List(List<Recruit0430> recruit0430List) {
        this.recruit0430List = recruit0430List;
    }

    public List<Application0403> getApplication0403List() {
        return application0403List;
    }

    public void setApplication0403List(List<Application0403> application0403List) {
        this.application0403List = application0403List;
    }

    public User(Integer UID, Integer AID, Timestamp reqTime, String accountNumber, String password, PersonalInformation0308 personalInformation0308) {
        this.UID = UID;
        this.AID = AID;
        this.reqTime = reqTime;
        this.accountNumber = accountNumber;
        this.password = password;
        this.personalInformation0308 = personalInformation0308;
    }

    public PersonalInformation0308 getPersonalInformation0308() {
        return personalInformation0308;
    }

    public void setPersonalInformation0308(PersonalInformation0308 personalInformation0308) {
        this.personalInformation0308 = personalInformation0308;
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

    public void setReqTime(Timestamp reqTime) {
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

    public User(Integer UID, Integer AID, Timestamp reqTime, String accountNumber, String password) {
        this.UID = UID;
        this.AID = AID;
        this.reqTime = reqTime;
        this.accountNumber = accountNumber;
        this.password = password;
    }
}
