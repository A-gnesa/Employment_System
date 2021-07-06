package com.control;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

public class hello {
    @RequestMapping("/hello")
    public String sayHello(ModelMap model) {
        return "/index.jsp"; //指向hello.jsp
    }
}
