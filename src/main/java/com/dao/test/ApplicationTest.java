package com.dao.test;

import com.dao.applicationDao.ApplicationDao0403;
import com.dao.applicationDao.ApplicationDaol0403;
import com.po.Application0403;
import com.po.User;

import java.sql.Timestamp;
import java.util.Date;

public class ApplicationTest {
    public static void main(String[] args) {
        ApplicationDaol0403 applicationDao0403 = new ApplicationDao0403();
        System.out.println(applicationDao0403.selectApplicationByTime());
        Application0403 application0403=new Application0403();
        Timestamp t = new Timestamp(new Date().getTime());
        User user = new User();
        user.setUID(2);
        application0403.setPID(1);
        application0403.setUID(1);
        application0403.setRID(4);
        application0403.setApplicationTime(t);
        applicationDao0403.deleteByUID(user);
        System.out.println(applicationDao0403.findALLapplication());
        applicationDao0403.add(application0403);
    }
}
