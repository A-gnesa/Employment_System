package com.dao.test;

import com.dao.userDao.UserDao;
import com.po.User;

import java.util.Date;
import java.sql.Timestamp;


class UserDaoTest {
    public static void main(String[] args) {
        UserDao u = new UserDao();
        User user = new User();
        Timestamp t = new Timestamp(new Date().getTime());
        user.setReqTime(t);
        user.setAccountNumber("zsh");
        user.setPassword("zsh");
        user.setAID(1);
        System.out.println(u.addUser(user));
    }

}