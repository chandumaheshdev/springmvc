package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	//need a method to show the initial html form
	
	@RequestMapping("/showForm")
	public String showform(){
		return "helloworld-form";
		}
	//need a controller method to process the html form
	@RequestMapping("/processForm")
	public String processForm(){
		return "helloworld";
	}

	// new a controller  method to read form data and
	
	//add data to the model 
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request,Model model){
		//read the request parameter  from the html form
		
		String  theName=request.getParameter("studentName");
		//convert the data to all caps
		theName=theName.toUpperCase();
		//create the message
		String result="YO! " + theName;
		//add message to model
		model.addAttribute("message",result);
			
		 return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName")String theName,Model model){
		//read the request parameter  from the html form
		
		
		//convert the data to all caps
		theName=theName.toUpperCase();
		//create the message
		String result="my nigger from v3! " + theName;
		//add message to model
		model.addAttribute("message",result);
			
		 return "helloworld";
	}
	   
	
}
