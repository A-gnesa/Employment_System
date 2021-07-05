package com.dao;

import com.tools.sqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class baseDao {
    protected SqlSessionFactory factory = sqlSessionFactory.getSqlSessionFactory();
    protected SqlSession session;
}
