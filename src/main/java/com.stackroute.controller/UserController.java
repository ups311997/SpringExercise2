package com.stackroute.controller;

import com.stackroute.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {

    @RequestMapping("display")
    public  ModelAndView checkUser(HttpServletRequest request, HttpServletResponse response)
    {
        String str1= request.getParameter("t1");
        String str2= request.getParameter("t2");
        ModelAndView mv = new ModelAndView();

        mv.addObject("username",str1);
        mv.addObject("password",str2);

        if(str1.equals("Upasana")&&str2.equals("12345"))
        {
            mv.setViewName("display");
        }
        else
        {
            mv.setViewName("error");
        }
        return  mv;




    }
}
