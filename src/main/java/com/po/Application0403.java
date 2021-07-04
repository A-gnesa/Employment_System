package com.po;

import java.sql.Timestamp;
import java.util.Date;

public class Application0403 {
//    RID : 应聘表主键
    private Integer RID;
//    PID 招聘表主键
    private Integer PID;
    private Timestamp applicationTime;

    public Application0403() {
    }

    public Application0403(Integer RID, Integer PID, Timestamp applicationTime) {
        this.RID = RID;
        this.PID = PID;
        this.applicationTime = applicationTime;
    }

    public Integer getRID() {
        return RID;
    }

    public void setRID(Integer RID) {
        this.RID = RID;
    }

    public Integer getPID() {
        return PID;
    }

    public void setPID(Integer PID) {
        this.PID = PID;
    }

    public Date getApplicationTime() {
        return applicationTime;
    }

    public void setApplicationTime(Timestamp applicationTime) {
        this.applicationTime = applicationTime;
    }

    @Override
    public String toString() {
        return "Application0403{" +
                "RID=" + RID +
                ", PID=" + PID +
                ", applicationTime=" + applicationTime +
                '}';
    }
}
