package com.dao;

import com.po.User;

public class ApplicationTest {
    public static void main(String[] args) {
        ApplicationDaol0403 applicationDaol0403 = new ApplicationDao0403();
        System.out.println(applicationDaol0403.selectApplicationByTime());
        User user = new User();
        user.setUID(2);
        applicationDaol0403.deleteByUID(user);
    }
}
