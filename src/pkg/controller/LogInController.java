package pkg.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.support.RequestContextUtils;

import pkg.dao.LogInDao;
import pkg.model.User;

@Controller
public class LogInController {
	
	@RequestMapping(value=("login.spring"),method=RequestMethod.POST)
	
	public void login(HttpServletRequest request,@ModelAttribute("User") User user){
		
		WebApplicationContext context=RequestContextUtils.getWebApplicationContext(request);
		
		LogInDao logindao= (LogInDao) context.getBean("daoImp");
		logindao.insertUser(user);
		
			
		
	}

}
