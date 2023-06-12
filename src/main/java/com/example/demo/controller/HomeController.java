package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.UserProfile;

@RestController
@CrossOrigin(origins = "*") 
public class HomeController {
	
    @GetMapping("/api")
    @ResponseBody
    public UserProfile getUserProfile() {
        UserProfile Userprofile = new UserProfile();
        Userprofile.setBirthDate("2000/02/02");
        Userprofile.setName("田中太郎");
        Userprofile.setJob("エンジニア");
        return Userprofile;
    }
}
