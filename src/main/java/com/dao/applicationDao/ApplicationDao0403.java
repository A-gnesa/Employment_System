package com.dao.applicationDao;

import com.dao.baseDao;
import com.po.Application0403;
import com.po.Recruit0430;
import com.po.User;
import com.tools.sqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.Date;
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

    @Override
    public boolean insertApplicationByUIDANDPID(User u , Recruit0430 r) {
        session = factory.openSession();
        Application0403 a = new Application0403();
        a.setPID(r.getPID());
        a.setUID(u.getUID());
        Timestamp t = new Timestamp(new Date().getTime());
        a.setApplicationTime(t);

        int i = session.insert("insertApplicationByUIDANDPID",a);
        session.commit();
        return i>0;
    }

    @Override
    public List<Application0403> findApplicationByUID(User u) {
        session = factory.openSession();
        return session.selectList("findApplicationByUID",u);
    }

    @Override
    public boolean deleteByRID(Integer rid) {
        session = factory.openSession();
        int i = session.delete("deleteByRID",rid);
        session.commit();
        return i>0;
    }
}
