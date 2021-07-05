package com.dao.test;

import com.dao.userDao.UserDao;


class UserDaoTest {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        System.out.println(userDao.findALLUser());
        System.out.println(userDao.findALLUser());
    }

}