package com.example.thebank.controllers;

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
    public String blogPostAdd(@RequestParam String title, @RequestParam String anons, @RequestParam String full_text, @RequestParam String prize, Model model){
        Post post = new Post(title,anons,full_text, prize);
        postRepository.save(post);
        return "redirect:/blog";
    }
}
