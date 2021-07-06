package com.dao.applicationDao;

import com.dao.baseDao;
import com.po.Application0403;
import com.po.User;
import com.tools.sqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("ApplicationDao")
public class ApplicationDao0403 extends baseDao implements ApplicationDaol0403{

    @Override
    public boolean deleteByUID(User user) {
        session = factory.openSession();
        int i = session.delete("deleteByUID",user);
        session.commit();
        return  i>0;
    }

    @Override
    public List<Application0403> selectApplicationByTime() {
        session = factory.openSession();
        return session.selectList("selectApplicationByTime");
    }
}
