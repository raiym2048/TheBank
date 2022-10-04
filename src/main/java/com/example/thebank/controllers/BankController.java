package com.example.thebank.controllers;

import com.example.thebank.models.Post;
import com.example.thebank.models.User;
import com.example.thebank.repository.EmailRepository;
import com.example.thebank.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class BankController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private EmailRepository emailRepository;

    @GetMapping("/reg")
    public String SignIn(Model model){
        return "signIn";
    }
    @PostMapping("/reg")
    public String Sign(@RequestParam String email, @RequestParam String password, Model model) {
        User user = new User(email, password);
        emailRepository.save(user);
        return "home";
    }

    @GetMapping("/blog")
    public String blogMain(Model model){
        Iterable<Post> user = userRepository.findAll();
        model.addAttribute("user",user);
        return "blog-main";
    }

    @GetMapping("/support")
    public String blogSupport(Model model){
        return "blog-support";
    }

    @GetMapping("/pricing")
    public String blogPricing(Model model){
        return "blog-pricing";
    }


    @GetMapping("/blog/add")
    public String blogAdd(Model model){

        return "blog-add";
    }

    @PostMapping("/blog/add")
    public String blogPostAdd(@RequestParam String name,@RequestParam String surname, @RequestParam String email, @RequestParam String password,@RequestParam int balance,  Model model){
        Post post = new Post(name,surname,email, password, balance);
        userRepository.save(post);
        return "redirect:/blog";
    }
    @GetMapping("/blog/{id}")
    public String blogDetails(@PathVariable(value = "id") long id, Model model){
        if(!userRepository.existsById(id))
            return "redirect:/blog";
        Optional<Post> user = userRepository.findById(id);
        ArrayList<Post> res = new ArrayList<>();
        user.ifPresent(res::add);

        model.addAttribute("user",res);
        return "blog-details";
    }
    @GetMapping("/blog/{id}/edit")
    public String blogEdit(@PathVariable(value = "id") long id, Model model){
        if(!userRepository.existsById(id))
            return "redirect:/blog";
        Optional<Post> user = userRepository.findById(id);
        ArrayList<Post> res = new ArrayList<>();
        user.ifPresent(res::add);

        model.addAttribute("user",res);
        return "blog-edit";
    }

    @PostMapping("/blog/{id}/edit")
    public String blogPostUpdate(@PathVariable(value = "id") long id,@RequestParam String title,@RequestParam String anons, @RequestParam String full_text, @RequestParam String prize, Model model){
        Post post = userRepository.findById(id).orElseThrow();
        post.setName(title);
        post.setSurname(anons);
        //post.setViews(prize);
        post.setEmail(full_text);
        userRepository.save(post);

        return "redirect:/blog";
    }
    @PostMapping("/blog/{id}/remove")
    public String blogPostDelete(@PathVariable(value = "id") long id, Model model){
        Post post = userRepository.findById(id).orElseThrow();
        userRepository.delete(post);

        return "redirect:/blog";
    }

}
