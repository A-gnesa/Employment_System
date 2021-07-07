package com.service;

import com.dao.applicationDao.ApplicationDao0403;
import com.po.PersonalInformation0308;
import com.po.Recruit0430;
import com.po.User;

import javax.annotation.Resource;
import java.util.List;

public class applicationService {
    @Resource(name = "applicationDao")
    ApplicationDao0403 applicationDao0403;
//    根据user中的uid和recruit中的rid 增加application一行数据
    public boolean insertApplication(User user, Recruit0430 recruit0430){
        return false;
    }
//    根据招聘表主键查找所有有关的个人信息
    public List<PersonalInformation0308> findPersonalInformationByPID(Recruit0430 recruit0430){
        recruit0430.getUID();
        return applicationDao0403.findALLapplication();
    }
//    根据用户主键删除招聘信息
    public boolean deleteApplicationByUID(User user){
        return applicationDao0403.deleteByUID(user);
    }

}
