package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class mycontroller {
	@RequestMapping("/")
	public String login() {
		return "login.jsp";
	}
	@RequestMapping("/verify")
	public ModelAndView greet(Userclass user) {
		ModelAndView mv=new ModelAndView();
		String uname=user.getUname();
		String pwd=user.getPwd();
		if(uname.equals(pwd)) {
			mv.addObject("data",user);
			mv.addObject("msg","Successfully logged  in");
			mv.setViewName("welcome.jsp");
		}
		else {
			mv.addObject("msg","Please check your username and password");
			mv.setViewName("failure.jsp");
		}
		return mv;
	}
}