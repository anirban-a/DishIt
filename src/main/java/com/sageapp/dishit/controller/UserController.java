package com.sageapp.dishit.controller;

import com.sageapp.dishit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
  @Autowired
  UserService userService;

  @GetMapping
  public ResponseEntity<String> createUser(){
    userService.createUser();
    return ResponseEntity.ok("success");
  }
}
