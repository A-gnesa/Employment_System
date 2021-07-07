package com.service;

import com.dao.applicationDao.ApplicationDao0403;
import com.dao.personalInformation.PersonalInformationDao0308;
import com.dao.userDao.UserDao;
import com.po.Application0403;
import com.po.PersonalInformation0308;
import com.po.Recruit0430;
import com.po.User;

import javax.annotation.Resource;
import java.util.List;

public class applicationService {
    @Resource(name = "applicationDao")
    ApplicationDao0403 applicationDao0403;
    @Resource(name = "UserDao")
    UserDao userdao;
    @Resource(name = "PersonallnformationDao0308")
    PersonalInformationDao0308 personalInformationdao0308;
//    根据user中的uid和recruit中的rid 增加application一行数据
    public boolean insertApplication(User user, Recruit0430 recruit0430){
        Application0403 application0403= new Application0403();
        application0403.setUID(user.getUID());
        application0403.setPID(recruit0430.getPID());
        return applicationDao0403.add(application0403);
    }
//    根据招聘表主键查找所有有关的个人信息
    public List<PersonalInformation0308> findPersonalInformationByPID(Recruit0430 recruit0430){

        Integer u=recruit0430.getUID();

        return null;
    }
//    根据用户主键删除招聘信息
    public boolean deleteApplicationByUID(User user){
        return applicationDao0403.deleteByUID(user);
    }

}
