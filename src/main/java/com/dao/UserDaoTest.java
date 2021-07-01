package com.dao;

import com.tools.sqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;


class UserDaoTest {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        System.out.println(userDao.findALLUser());
    }

}