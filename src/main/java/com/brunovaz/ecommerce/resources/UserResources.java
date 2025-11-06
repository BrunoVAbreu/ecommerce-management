package com.brunovaz.ecommerce.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brunovaz.ecommerce.entities.User;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping ("/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1, "Maria", "Maria@gmail.com", "9999999", "1234");
        return ResponseEntity.ok().body(u);
    }
}
