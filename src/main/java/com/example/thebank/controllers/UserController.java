package com.example.thebank.controllers;

import com.example.thebank.models.Post;
import com.example.thebank.models.User1;
import com.example.thebank.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
    @Autowired
    private EmailRepository emailRepository;

    @GetMapping("/reg")
    public String SignIn(Model model){
        return "signIn";
    }
    @PostMapping("/reg")
    public String Sign(@RequestParam String email, @RequestParam String password, Model model) {
        User1 user1 = new User1(email, password);
        emailRepository.save(user1);
        return "redirect:/pricing";
    }
    @GetMapping("/pricing")
    public String UserMain(Model model){
        Iterable<User1> user1 = emailRepository.findAll();
        model.addAttribute("user1",user1);
        return "user-main";
    }
}
