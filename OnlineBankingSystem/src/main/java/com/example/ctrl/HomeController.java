package com.example.ctrl;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.User;

@Controller
public class HomeController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String userInfo(@Valid User user,BindingResult bindingResult)
	{
		if(bindingResult.hasErrors())
		{
			return "home";
		}
		return "success";
	}
	
//	@RequestMapping(value="/signin", method=RequestMethod.GET)
//	public String loginInfo(@Valid User user,BindingResult bindingResult)
//	{
//		if(bindingResult.hasErrors())
//		{
//			return "views/login";
//		}
//		return "success";
//	}
//	*/
	
}
