package com.study.bookstore.controler;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class UserController {
    @GetMapping("/profile")
    public String getUserProfile(@RequestParam String param) {
        //TODO : Implementar perfil, retornando detalhes do usuario
        return new String();
    }
    
    @PutMapping("/update")
    public String updateUserProfile(@PathVariable String id, @RequestBody String entity) {
        //TODO: Implementar atualização do perfil do usuario
        
        return entity;
    }


}
