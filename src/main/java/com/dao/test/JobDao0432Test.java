package com.dao.test;


import com.dao.jobDao.JobDao0432;
import com.dao.personalInformation.PersonalInformationDaol0308;
import com.dao.userDao.UserDao;
import com.po.Job0432;
import com.po.PersonalInformation0308;
import com.po.User;
import com.service.UserService;

import com.service.recruitService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class JobDao0432Test {
    public static void main(String[] args) {
        String xml = "static/springMVC.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xml);
        PersonalInformation0308 p=new PersonalInformation0308();
        p.setSex("男");
        p.setAge(21);
        p.getCommunication();
        p.setSchool("清华大学");
        p.setUID(2);
        p.getName();
        UserService r = (UserService) applicationContext.getBean("UserService");
        System.out.println(r.updateInformationBYUID(p));

    }

}