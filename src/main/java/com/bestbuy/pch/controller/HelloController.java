package com.bestbuy.pch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/welcome")
public class HelloController {

  @RequestMapping(method = RequestMethod.GET)
  public String printWelcome(ModelMap model) {

<<<<<<< .mine
    model.addAttribute("message", "Spring 3 MVC Hello World changed in branch1");
=======
    model.addAttribute("message", "Spring 3 MVC Hello World Changed in branch2");
>>>>>>> .theirs
    return "hello";
  }
}