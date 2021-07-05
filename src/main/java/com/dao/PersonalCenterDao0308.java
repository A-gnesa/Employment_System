package com.dao;

import com.po.PersonalCenter0308;
import com.tools.sqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class PersonalCenterDao0308 implements PersonalCenterDaoI0308 {
    SqlSessionFactory factory = sqlSessionFactory.getSqlSessionFactory();
    SqlSession session;

    @Override
    public List<PersonalCenter0308> findPersonalCenterByUID(PersonalCenter0308 PersonalCenter0308) {
        session = factory.openSession();
        return session.selectList("selectPersonalCenterByUID", PersonalCenter0308);
    }
    @Override
    public boolean addContact_information(PersonalCenter0308 PersonalCenter0308) {
        session = factory.openSession();
        int a = session.insert("com.po.PersonalCenter0308.add",PersonalCenter0308);
        session.commit();
        return a > 0;
    }
    @Override
    public boolean addCenterByCollege(PersonalCenter0308 PersonalCenter0308) {
        session = factory.openSession();
        String a = String.valueOf(session.insert("com.po.PersonalCenter0308.add",PersonalCenter0308));
        session.commit();
        return a != null;
    }
    @Override
    public boolean addPersonalCenterByUser_sex(PersonalCenter0308 PersonalCenter0308) {
        session = factory.openSession();
        String a = String.valueOf(session.insert("com.po.PersonalCenter0308.add",PersonalCenter0308));
        session.commit();
        return a != null;
    }
    @Override
    public boolean addPersonalCenterByUser_name(PersonalCenter0308 PersonalCenter0308) {
        session = factory.openSession();
        String a = String.valueOf(session.insert("com.po.PersonalCenter0308.add",PersonalCenter0308));
        session.commit();
        return a != null;
    }
    @Override
    public boolean addPersonalCenterByUser_age(PersonalCenter0308 PersonalCenter0308) {
        session = factory.openSession();
        int a = session.insert("com.po.PersonalCenter0308.add",PersonalCenter0308);
        session.commit();
        return a > 0;
    }

}
