package com.dao.recruitDao;

import com.dao.baseDao;
import com.po.Recruit0430;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("RecruitDao0430")
public class RecruitDao0430 extends baseDao implements RecruitlDao0430 {
    @Override
    public List<Recruit0430> findRecruitBycity(Recruit0430 recruit0430) {
        session = factory.openSession();
        return session.selectList("findRecruitBycity", recruit0430);
    }

    @Override
    public List<Recruit0430> findRecruitByEID(Recruit0430 Recruit0430) {
        session = factory.openSession();
        return session.selectList("findRecruitByEID", Recruit0430);
    }

    @Override
    public List<Recruit0430> findRecruitByrequirement(Recruit0430 Recruit0430) {
        session = factory.openSession();
        return session.selectList("findRecruitByrequirement", Recruit0430);
    }

    @Override
    public List<Recruit0430> findALLRecruit() {
        session = factory.openSession();
        return session.selectList("findALLRecruit");
    }

    @Override
    public boolean delete(Recruit0430 Recruit0430) {
        session = factory.openSession();
        int i=session.delete("com.po.Recruit0430.delete", Recruit0430);
        session.commit();
        return i > 0;
    }

    @Override
    public List<Recruit0430> findRecruitBytime() {
        session = factory.openSession();
        return session.selectList("findRecruitByrequirement");
    }

    @Override
    public boolean add(Recruit0430 Recruit0430) {
        session = factory.openSession();
        int i = session.insert("com.po.Recruit0430.add",Recruit0430);
        session.commit();
        return i > 0;
    }

    @Override
    public List<Recruit0430> findRecruitByKeyword(@Param("keyword") String keyword) {
        session = factory.openSession();
        return session.selectList("findRecruitByKeyword",keyword);
    }


}
