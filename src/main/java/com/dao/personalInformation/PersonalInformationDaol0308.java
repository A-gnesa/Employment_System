package com.dao.personalInformation;

import com.dao.baseDao;
import com.po.PersonalInformation0308;
import com.po.User;
import org.springframework.stereotype.Repository;

@Repository("PersonalInformationDao")
public class PersonalInformationDaol0308 extends baseDao implements PersonalInformationDao0308 {

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
        return null;
    }

    @Override
    public PersonalInformation0308 selectInformationBYAccount(User user) {
        session = factory.openSession();
        return session.selectOne("com.po.PersonalInformation0308.selectInformationBYAccount",user);
    }

    @Override
    public boolean updateInformationBYAccount(PersonalInformation0308 p) {
        session = factory.openSession();
        int i = session.update("updateInformationBYAccount",p);
        session.commit();
        return i>0;
    }

    @Override
    public boolean updateInformationBYUID(PersonalInformation0308 personalInformation0308) {
        session = factory.openSession();
        int i = session.update("updateInformationBYUID",personalInformation0308);
        session.commit();
        return i>0;
    }


}
