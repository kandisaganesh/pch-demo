package com.bestbuy.pch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/welcome")
public class HelloController {

int  count= 0;
  @RequestMapping(method = RequestMethod.GET)
  public String printWelcome(ModelMap model) {
    model.addAttribute("message", "Spring 3 MVC Hello World changed in branch1");
	System.out.println("Violating PMD rule.");
	System.out.println(++count);
    return "hello";
  }


  public void printWelcome2(String model){
	System.out.println("Only for testing");
 }
}
