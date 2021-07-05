package com.dao;

import com.po.PersonalInformation0308;
import com.po.User;
import com.tools.sqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class PersonalInformationDaol0308 implements PersonalInformationDao0308 {
    SqlSessionFactory factory = sqlSessionFactory.getSqlSessionFactory();
    SqlSession session;
    @Override
    public boolean insertAllInformation(PersonalInformation0308 personalInformation0308) {
        session = factory.openSession();
        int i = session.insert("insertAllInformation",personalInformation0308);
        session.commit();
        System.out.println(i);
        return i>0;
    }

    @Override
    public PersonalInformation0308 selectInformationBYUID(User user) {
        session = factory.openSession();
        return session.selectOne("selectInformationBYUID",user);
    }

    @Override
    public boolean updateInformationBYUID(PersonalInformation0308 personalInformation0308) {
        session = factory.openSession();
        int i = session.update("updateInformationBYUID",personalInformation0308);
        session.commit();
        return i>0;
    }


}
