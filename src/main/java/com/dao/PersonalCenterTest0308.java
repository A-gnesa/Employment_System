package com.dao;

import com.po.PersonalCenter0308;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Locale;

import com.po.PersonalCenter0308;

public class PersonalCenterTest0308 {
    public static void main(String[] args) {
        PersonalCenterDao0308 personalCenterDao0308= new PersonalCenterDao0308();
        PersonalCenter0308 personalCenter0308= new PersonalCenter0308();
        personalCenter0308.setUID(1);
        personalCenter0308.setContact_information(12345678);
        personalCenter0308.setCollege("哈理工");
        personalCenter0308.setUser_sex("女");
        personalCenter0308.setUser_name("高蕊");
        personalCenter0308.setUser_age(18);


        System.out.println(personalCenterDao0308.addCenterByCollege(personalCenter0308));
    }
}
