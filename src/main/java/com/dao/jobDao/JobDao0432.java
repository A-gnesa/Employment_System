package com.dao.jobDao;

import com.dao.baseDao;
import com.po.Job0432;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("JobDao")
public class JobDao0432 extends baseDao implements JobDaol0432 {
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
