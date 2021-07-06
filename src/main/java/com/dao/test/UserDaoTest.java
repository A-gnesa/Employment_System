package com.dao.test;

import com.dao.userDao.UserDao;


class UserDaoTest {
    public static void main(String[] args) {
        UserDao u = new UserDao();
        System.out.println(u.findUserByAccountNumber("123"));
    }

}