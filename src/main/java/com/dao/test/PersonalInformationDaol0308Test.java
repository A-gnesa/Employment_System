package com.dao.test;

import com.dao.personalInformation.PersonalInformationDaol0308;
import com.po.PersonalInformation0308;
import com.po.User;

public class PersonalInformationDaol0308Test {
    public static void main(String[] args) {
        PersonalInformation0308 personalInformation0308 = new PersonalInformation0308();
//        personalInformation0308.setAge(18);
//        personalInformation0308.setCommunication("192404@qq.com");
//        personalInformation0308.setUID(2);
//        personalInformation0308.setSchool("哈尔滨理工大学");
//        personalInformation0308.setSex("女");
//        personalInformation0308.setName("高蕊");
        PersonalInformationDaol0308 personalInformationDaol0308 = new PersonalInformationDaol0308();
//        System.out.println(personalInformationDaol0308.insertAllInformation(personalInformation0308));
//        User user = new User();
//        user.setUID(1);
//        personalInformation0308.setUID(1);
//        System.out.println(personalInformationDaol0308.updateInformationBYUID(personalInformation0308));
        User u = new User();
        u.setAccountNumber("123");
        u.setUID(1);
        System.out.println(personalInformationDaol0308.selectInformationBYUID(u));
    }
}
