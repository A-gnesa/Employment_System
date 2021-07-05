package com.po;

public class PersonalCenter0308 {
    //用户ID
    private Integer UID;
    //联系方式
    private Integer contact_information;
    //学校
    private String college;
    //性别
    private String user_sex;
    //姓名
    private String user_name;
    //年龄
    private Integer user_age;


    public Integer getUID(){return UID;}
    public void setUID(int uid) { this.UID = uid; }

    public Integer getContact_information(){return contact_information;}
    public void setContact_information(int contact_information) {
        this.contact_information = contact_information;
    }

    public String getCollege(){return college;}
    public void setCollege(String college) { this.college = college; }

    public String getUser_sex(){return user_sex;}
    public void setUser_sex(String user_sex) { this.user_sex = user_sex; }

    public String getUser_name(){return user_name;}
    public void setUser_name(String user_name) { this.user_name = user_name; }

    public Integer getUser_age(){return user_age;}
    public void setUser_age(int user_age) { this.user_age = user_age; }


    public String toString(){
        return "personalCenter0308{" +
                "UID=" + UID +
                "，contact_information=" + contact_information +
                "，college=" + college +
                "，user_sex=" + user_sex +
                "，user_name=" + user_name +
                "，user_age=" + user_age +
                '}';
        }
    }

    public





}

