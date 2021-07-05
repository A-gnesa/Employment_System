package com.po;

public class PersonalInformation0308 {
    //用户ID
    private Integer UID;
    //联系方式
    private String communication;
    //学校
    private String school;
    //性别
    private String sex;
    //姓名
    private String name;
    //年龄
    private Integer age;

    @Override
    public String toString() {
        return "PersonalInformation0308{" +
                "UID=" + UID +
                ", communication='" + communication + '\'' +
                ", school='" + school + '\'' +
                ", sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public Integer getUID() {
        return UID;
    }

    public void setUID(Integer UID) {
        this.UID = UID;
    }

    public String getCommunication() {
        return communication;
    }

    public void setCommunication(String communication) {
        this.communication = communication;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public PersonalInformation0308() {
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

