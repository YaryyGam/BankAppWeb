package com.yaryy.controller;

import com.yaryy.model.User;
import com.yaryy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController()
@RequestMapping("/bank")
public class MainController {

    @Autowired
    private UserService service;

    @GetMapping("/main")
    public String page(){
        return "This is main page";
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<Optional<User>> getUserInfo(@PathVariable("id") int id){
        Optional<User> user = service.getUserCredentials(id);
        if(user!=null)
            return new ResponseEntity<>(user, HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
