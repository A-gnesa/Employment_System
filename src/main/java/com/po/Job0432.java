package com.po;

public class Job0432 {
    private Integer EID;
    private String jname;

    @Override
    public String toString() {
        return "job0432{" +
                "EID=" + EID +
                ", jname='" + jname + '\'' +

                '}';
    }

    public Job0432() {
    }

    public Job0432(Integer EID, String jname) {
        this.EID = EID;
        this.jname = jname;
    }

    public Integer getEID() {
        return EID;
    }

    public void setEID(Integer EID) {
        this.EID = EID;
    }

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname;
    }
}
