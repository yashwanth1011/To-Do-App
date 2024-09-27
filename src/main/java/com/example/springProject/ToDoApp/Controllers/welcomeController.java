package com.example.springProject.ToDoApp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes(names = "name")
public class welcomeController {

    @RequestMapping("/")
    public String welcomePage(ModelMap map){
        map.put("name", GetLoggedInUser());
        return "welcome";


    }


    public String GetLoggedInUser(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();


    }

//    private AuthenticatorService authService;
//    @Autowired
//    public welcomeController(AuthenticatorService authService) {
//        this.authService = authService;
//    }
//
//    @RequestMapping(value = "login", method = RequestMethod.GET)
//    public String login(){
//        return "loginjsp";
//
//    }

//    @RequestMapping(value = "login", method =  RequestMethod.POST)
//
//    public String welcome(@RequestParam String name, @RequestParam String password, ModelMap model){
//        model.put("name", name);
//        model.put("password", password);
//
//
//        if(authService.authenticate(name, password))
//            return "welcome";
//
//        model.put("errorMessage", "Please enter the correct credentials");
//
//        return "loginjsp";
//
//    }


}
