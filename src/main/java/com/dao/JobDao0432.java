package com.dao;

import com.po.Job0432;
import com.tools.sqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class JobDao0432 implements JobDaol0432 {
    SqlSessionFactory factory = sqlSessionFactory.getSqlSessionFactory();
    SqlSession session;
    @Override
    public List<Job0432> findAll() {
        session = factory.openSession();
        return session.selectList("com.po.Job0432.findAll");
    }

    @Override
    public  boolean insertName(Job0432 jname) {
        session = factory.openSession();
        int i = session.insert("com.po.Job0432.insertName",jname);
        session.commit();
        return i > 0;
    }

    @Override
    public boolean deleteInformationByName(Job0432 jname) {
        session = factory.openSession();
        int i=session.delete("com.po.Job0432.deleteInformationByName",jname);
        session.commit();
        return i > 0;

    }

    @Override
    public int updateInformationByname(Job0432 job0432) {
        session = factory.openSession();
        int i = session.update("com.po.Job0432.updateInformationByname",job0432);
        session.commit();
        return i;
    }
}
