package com.service;

import com.dao.applicationDao.ApplicationDao0403;
import com.po.Application0403;
import com.po.PersonalInformation0308;
import com.po.Recruit0430;
import com.po.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("applicationService")
public class applicationService {
    @Resource(name = "ApplicationDao")
    ApplicationDao0403 applicationDao0403;
//    根据user中的uid和recruit中的rid 增加application一行数据
    public boolean insertApplication(User user, Recruit0430 recruit0430){

        return applicationDao0403.insertApplicationByUIDANDPID(user,recruit0430);
    }
//    根据招聘表主键查找所有有关的个人信息
    public List<PersonalInformation0308> findPersonalInformationByPID(Recruit0430 recruit0430){
        return null;
    }
//    根据用户主键删除招聘信息
    public boolean deleteApplicationByUID(User user){
        return false;
    }
    public List<Application0403> findApplicationByUID(User u){
        return applicationDao0403.findApplicationByUID(u);
    }

    public void deleteApplicationByRID(String rid) {
        Integer r = Integer.valueOf(rid);

        applicationDao0403.deleteByRID(r);
    }
}
