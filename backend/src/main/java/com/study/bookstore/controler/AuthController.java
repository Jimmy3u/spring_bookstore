package com.study.bookstore.controler;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public String handleLogin(@RequestBody String entity) {
        //TODO: process POST request
        
        return entity;
    }
    
    @PostMapping("/signup")
    public String handleSignupa(@RequestBody String entity) {
        //TODO: process POST request
        
        return entity;
    }
    
    @PostMapping("/logout")
    public String handleLougout(@RequestBody String entity) {
        //TODO: process POST request
        
        return entity;
    }
    
}
