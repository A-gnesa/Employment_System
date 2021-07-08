package com.controller;

import com.po.*;
import com.service.RecruitService;
import com.service.UserService;
import com.service.applicationService;
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
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @Resource(name = "UserService")
    UserService userService;
    @Resource(name = "recruitService")
    RecruitService recruitService;
    @Resource(name = "applicationService")
    applicationService applicationService;




//    翟士衡
    @RequestMapping("/userLogin")
    public String userLogin(@Param("account")String account, @Param("password")String password,
                            Model m, HttpServletRequest request) {
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
            return "dlsb";
        }
    }
//    翟士衡
    @RequestMapping(value = "/register",method = RequestMethod.POST)

    public String register  (@Param("accountNumber")String accountNumber,@Param("password")String password
                            ,@Param("repeatPassword")String repeatPassword){
        if (userService.register(accountNumber,password)){
            return "dl";
        }
        return "zcsb";

    }

//    缪泽洋
    @RequestMapping(value = "/assort",method = RequestMethod.GET)
    public String assort(@Param("jname")String jname, Model m){
        Job0432 j = new Job0432();
        j.setJname(jname);
        List<Recruit0430> list = recruitService.assort(j);
        m.addAttribute("recruitList",list);
        m.addAttribute("jname",jname);
        return "bft_more";
    }
//   缪泽洋
    @RequestMapping(value = "/returnIndex")
    public String returnIndex(Model m){
        List<Recruit0430>list =  recruitService.searchALLRecruit();
        m.addAttribute("recruitList",list);
        return "i";
    }
//    缪泽洋
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
    @RequestMapping(value = "/addApplication",method = RequestMethod.GET)
    public String addApplication(HttpServletRequest request,@Param("PID")String PID,Model m){
        User u = (User) request.getSession().getAttribute("user");
        Integer pid = Integer.valueOf(PID);
        Recruit0430 r = new Recruit0430();
        r.setPID(pid);
        User u1 = userService.findUserBYAccountName(u.getAccountNumber());
        u.setUID(u1.getUID());
        applicationService.insertApplication(u,r);
        Recruit0430 recruit0430 = recruitService.selectOneRecruit(pid);
        m.addAttribute("recruit",recruit0430);
        return "zzy";
    }
//    姚程越
    @RequestMapping("/addRecruitPage")
    public String addRecruitPage(){
        return "zp";
    }
//    姚程越
    @RequestMapping("/addRecruit")
    public String addRecruit(@Param("companyname")String companyname,@Param("city")String city
                            ,@Param("requirement")String requirement,@Param("salary")String salary
                            ,@Param("job")String job,@Param("companyInformation")String companyInformation
                            ,HttpServletRequest request,Model m)
    {
        Recruit0430 r = new Recruit0430();
        User u = (User) request.getSession().getAttribute("user");
        r.setCity(city);
        r.setCompanyname(companyname);
        r.setRequirement(requirement);
        r.setSalary(salary);
        r.setCompanyInformation(companyInformation);
        User u1 = userService.findUserBYAccountName(u.getAccountNumber());
        r.setUID(u1.getUID());
        recruitService.insertRecruit(r,job);
        m.addAttribute("recruit",r);
        return "zzy";
    }
    @RequestMapping("/applicationCenter")
    public String applicationCenter(HttpServletRequest request,Model m){
        User u = (User) request.getSession().getAttribute("user");
        User u1 = userService.findUserBYAccountName(u.getAccountNumber());
        List<Application0403> application0403List =applicationService.findApplicationByUID(u1);
        List<PersonalInformation0308> personalInformation0308List = new ArrayList<>();
        List<Recruit0430> recruit0430List = new ArrayList<>();
        for (Application0403 a : application0403List){
            PersonalInformation0308 p = userService.findPersonalInformationByUID(a.getUID());
            personalInformation0308List.add(p);
            Recruit0430 r = recruitService.selectOneRecruit(a.getPID());
            recruit0430List.add(r);
        }
        m.addAttribute("recruitList",recruit0430List);
        m.addAttribute("personalInformationList",personalInformation0308List);
        m.addAttribute("applicationList",application0403List);
        return "ck";
    }
    @RequestMapping(value = "/deleteApplicationByRID",method = RequestMethod.GET)
    public String deleteApplicationByRID(@Param("RID")String RID){
        applicationService.deleteApplicationByRID(RID);
        return "redirect:applicationCenter";
    }
}
