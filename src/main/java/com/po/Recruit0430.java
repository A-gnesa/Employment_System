package com.po;

import java.util.Date;

public class Recruit0430 {
//PID是招聘表主键，EID是职业表主键
    private Integer PID;
    private Integer UID;
    private Integer EID;
    private String city;
    private String requirement;
    private String salary;
    private Date time;
    private String companyname;
    private String companyInformation;



    public Date getTime() {
        return time;
    }
    public void setTime(Date time) {
        this.time = time;
    }
    public Integer getPID() {
        return PID;
    }

    public void setPID(Integer PID) {
        this.PID = PID;
    }

    public Integer getUID() {
        return UID;
    }

    public void setUID(Integer UID) {
        this.UID = UID;
    }

    public Integer getEID() {
        return EID;
    }

    public void setEID(Integer EID) {
        this.EID = EID;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getCompanyInformation() {
        return companyInformation;
    }

    public void setCompanyInformation(String companyInformation) {
        this.companyInformation = companyInformation;
    }

    @Override
    public String toString() {
        return "Recruit0430{" +
                "PID=" + PID +
                ", UID=" + UID +
                ", EID=" + EID +
                ", city='" + city + '\'' +
                ", requirement='" + requirement + '\'' +
                ", salary='" + salary + '\'' +
                ", time=" + time +
                ", companyname='" + companyname + '\'' +
                ", companyInformation='" + companyInformation + '\'' +
                '}';
    }

    public Recruit0430(Integer PID, Integer UID, Date time, Integer EID, String city, String requirement, String salary, String companyname, String companyInformation) {
        this.UID = UID;
        this.UID = UID;
        this.EID= EID;
        this.time= time;
        this.city = city;
        this.requirement = requirement;
        this.salary = salary;
        this.companyname = companyname;
        this.companyInformation = companyInformation;
    }



}
