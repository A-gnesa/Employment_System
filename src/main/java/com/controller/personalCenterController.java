package com.controller;

import com.po.PersonalInformation0308;
import com.po.User;
import com.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

//高蕊

@Controller
public class personalCenterController {
    @Resource(name = "UserService")
    UserService userService;

    @RequestMapping("/personalCenter")
    public String selectOnePersonalCenter(HttpServletRequest request){
        User u = (User) request.getSession().getAttribute("user");
        PersonalInformation0308 p = userService.findPersonalInformationByAccount(u);
        request.getSession().setAttribute("PersonalInformation",p);
        return "personalCenter";
    }
    @RequestMapping("/setPersonalInformation")
    public String updatePersonalInformation(@Param("name")String name, @Param("sex")String sex,
                                            @Param("age")String age, @Param("school")String school,
                                            @Param("communication")String communication,
                                            HttpServletRequest request
    ){
        PersonalInformation0308 p = new PersonalInformation0308();
        p.setName(name);
        p.setSex(sex);
        p.setSchool(school);
        p.setCommunication(communication);
        Integer a = Integer.valueOf(age);
        p.setAge(a);
        User u = (User) request.getSession().getAttribute("user");
        p.setUID(userService.findPersonalInformationByAccount(u).getUID());
        userService.updateInformationBYUID(p);
        request.getSession().setAttribute("PersonalInformation",p);
        return "personalCenter";
    }

}
