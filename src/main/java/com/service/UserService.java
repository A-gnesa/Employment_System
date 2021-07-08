package com.service;

import com.dao.personalInformation.PersonalInformationDaol0308;
import com.dao.userDao.UserDao;
import com.po.PersonalInformation0308;
import com.po.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;

@Service("UserService")
public class UserService {
    @Resource(name = "UserDao")
    UserDao userDao;
    @Resource(name = "PersonalInformationDao")
    PersonalInformationDaol0308 personalInformationDaol0308;

    //    登陆 成功返回true 不成功返回false
    public boolean login (String accout,String password){
        User user = new User();
        user = userDao.findUserByAccountNumber(accout);
        if (user==null){
            return false;
        }
        if ( user.getAccountNumber().equals(accout)&&user.getPassword().equals(password))
            return true;
        else
            return false;

    }
    //    注册 成功返回true 不成功返回false 注册成功的同时增加一条主键为
    //     user的UID的个人信息
    public boolean register(String accout,String password){
        User user = new User();
        userDao.findUserByAccountNumber(accout);

//        if (user != null){
//            if (userDao.findUserByAccountNumber(accout).equals())
//        }
        if(accout.equals("")||password.equals("")||accout.equals( user.getAccountNumber()))
            return false;
        else {
            User u = new User();
            u.setAccountNumber(accout);
            u.setPassword(password);
            Timestamp t = new Timestamp(new Date().getTime());
            u.setReqTime(t);
            return userDao.addUser(u);
        }

    }
//    修改Information 成功true 失败false

    public boolean updateInformationBYUID(PersonalInformation0308 p) {
        return personalInformationDaol0308.updateInformationBYUID(p);
    }
    public boolean updateInformationBYAccount(PersonalInformation0308 p) {
        return personalInformationDaol0308.updateInformationBYAccount(p);
    }


    public PersonalInformation0308 findPersonalInformationByAccount(User user){
        User u = userDao.findUserByAccountNumber(user.getAccountNumber());
        PersonalInformation0308 p = personalInformationDaol0308.selectInformationBYAccount(u);
        return p;
    }

    public User findUserBYAccountName(String AccountName){
        return userDao.findUserByAccountNumber(AccountName);
    }


    public PersonalInformation0308 findPersonalInformationByUID(Integer uid) {
        User u = new User();
        u.setUID(uid);
        return personalInformationDaol0308.selectInformationBYUID(u);

    }
}
