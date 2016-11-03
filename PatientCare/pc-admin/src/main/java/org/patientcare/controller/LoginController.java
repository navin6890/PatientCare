package org.patientcare.controller;

import javax.servlet.http.HttpServletRequest;

import org.patientcare.model.AdminLogin;
import org.patientcare.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class LoginController 
{

	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value = { "/login"}, method = RequestMethod.GET)
	public ModelAndView loginPage(ModelAndView model )
	{
		model.addObject("admin", new AdminLogin());//yaha jis name add kiya hai usi name se modelAttribute me milega.............login.jsp pr bhi yahi name dena hai in modelAttribute
		model.setViewName("login");
		return model;
	}

	@RequestMapping(value = { "/signIn"}, method = RequestMethod.POST)
	public String signIn(@ModelAttribute("admin")AdminLogin admin,HttpServletRequest req) throws Exception //yah vahi object hai jo hamne uper "login" me bind kiya tha. yahi fill hoke aaya hai AdminUser se
	{
		/*admin.setEmailId(req.getParameter("username"));
		admin.setPassword(req.getParameter("password"));*/
		System.out.println(admin.getEmailId());
		System.out.println(admin.getPassword());
		//System.out.println(admin.getName());
		
		admin=loginService.adminSignIn(admin); 
		
		
		if(admin==null)
		{
			return "login";
		}
		
	
		
		req.setAttribute("user", admin);
		return "welcome";
	}
}
