package com.controller;

import com.po.Job0432;
import com.po.PersonalInformation0308;
import com.po.Recruit0430;
import com.po.User;
import com.service.RecruitService;
import com.service.UserService;
import com.sun.org.apache.xml.internal.serialize.Method;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
public class UserController {
    @Resource(name = "UserService")
    UserService userService;
    @Resource(name = "recruitService")
    RecruitService recruitService;


    @RequestMapping("/userLogin")
    public String userLogin(@Param("account")String account, @Param("password")String password, Model m, HttpServletRequest request) {
        if (userService.login(account, password)) {
            User u = new User();
            u.setAccountNumber(account);
            u.setPassword(password);
            m.addAttribute("user",u);
            List<Recruit0430>list =  recruitService.searchALLRecruit();
            m.addAttribute("recruitList",list);
            PersonalInformation0308 personalInformation0308 = new PersonalInformation0308();

            request.getSession().setAttribute("user",u);
            return "i";
        }else {
            return "index";
        }
    }
    @RequestMapping(value = "/assort",method = RequestMethod.GET)
    public String assort(@Param("jname")String jname, Model m){
        Job0432 j = new Job0432();
        j.setJname(jname);
        List<Recruit0430> list = recruitService.assort(j);
        m.addAttribute("recruitList",list);
        m.addAttribute("jname",jname);
        return "bft_more";
    }
    @RequestMapping(value = "/returnIndex")
    public String returnIndex(Model m){
        List<Recruit0430>list =  recruitService.searchALLRecruit();
        m.addAttribute("recruitList",list);
        return "i";
    }
    @RequestMapping(value = "/findAll")
    public String findAll(Model m){
        List<Recruit0430>list =  recruitService.searchALLRecruit();
        m.addAttribute("recruitList",list);
        return "bft_more";
    }
    @RequestMapping(value = "/search",method = RequestMethod.POST)
    public String search(@Param(value = "keyword")String keyword,Model m){
        System.out.println(keyword);
        try {
            String str = new String(keyword.getBytes("iso-8859-1"),"UTF-8");
            List<Recruit0430>list = recruitService.search(str);
            m.addAttribute("recruitList",list);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "bft_more";
    }
    @RequestMapping(value = "/application",method = RequestMethod.GET)
    public String application(@Param("PID")String PID,Model m){
        Integer pid = Integer.valueOf(PID);
        Recruit0430 recruit0430 = recruitService.selectOneRecruit(pid);
        m.addAttribute("recruit",recruit0430);
        return "zzy";
    }
    @RequestMapping(value = "/addApplication")
    public String addApplication()
}
