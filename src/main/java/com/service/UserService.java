package com.service;

import com.dao.personalInformation.PersonalInformationDaol0308;
import com.dao.userDao.UserDao;
import com.po.PersonalInformation0308;
import com.po.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("UserService")
public class UserService {
    @Resource(name = "UserDao")
    UserDao userDao;
    @Resource(name = "PersonalInformationDao")
    PersonalInformationDaol0308 personalInformationDaol0308;

    //    登陆 成功返回true 不成功返回false
    public boolean login(User user){
        return false;
    }
    //    注册 成功返回true 不成功返回false 注册成功的同时增加一条主键为
    //     user的UID的个人信息
    public boolean register(User user){
        return false;
    }
//    修改Information 成功true 失败false
    public boolean upDateInformation(PersonalInformation0308 personalInformation0308){
        return false;
    }

}
