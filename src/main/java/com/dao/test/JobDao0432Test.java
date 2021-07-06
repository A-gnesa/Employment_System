package com.dao.test;


import com.dao.jobDao.JobDao0432;
import com.dao.userDao.UserDao;
import com.po.Job0432;
import com.po.User;
import com.service.UserService;

import com.service.recruitService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class JobDao0432Test {
    public static void main(String[] args) {
        String xml = "static/springMVC.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xml);
        UserService r = (UserService) applicationContext.getBean("UserService");
        System.out.println(r.login("123","123"));
    }

}