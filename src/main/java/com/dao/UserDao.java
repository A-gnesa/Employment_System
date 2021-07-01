package com.dao;

import com.po.User;
import com.tools.sqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public  class UserDao implements UserDaoI{
    SqlSessionFactory factory = sqlSessionFactory.getSqlSessionFactory();
    SqlSession session;
    @Override
    public List<User> findALLUser() {
        session = factory.openSession();
        return session.selectList("findAllUser");
    }
}
