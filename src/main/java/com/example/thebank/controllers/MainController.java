package com.example.thebank.controllers;

import com.example.thebank.Models.User;
import com.example.thebank.Repository.Repository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String Main(Model model){
        return "home";
    }
    @GetMapping("/LogIn")
    public String LogIn(Model model){
        return "LogIn";
    }
    @GetMapping("/LogOut")
    public String LogOut(Model model){
        return "LogOut";
    }
    @PostMapping("/LogOut")
    public String blogPostAdd(@RequestParam String Name, @RequestParam String Surname, @RequestParam String Email, @RequestParam String Password, Model model){
        User user = new User(Name,Surname,Email, Password);
        Repository.save(user);
        return "redirect:/";
    }
}
