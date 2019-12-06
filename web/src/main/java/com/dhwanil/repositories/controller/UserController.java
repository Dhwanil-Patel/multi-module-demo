package com.dhwanil.repositories.controller;

import com.dhwanil.domain.User;
import com.dhwanil.repositories.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/user")
public class UserController {

  @Autowired
  private UserService userService;

  @PostMapping("/")
  private ResponseEntity<List<User>> addUsers(@RequestBody List<User> userList) {
    return new ResponseEntity<>(userService.saveUsers(userList), HttpStatus.OK);
  }

  @GetMapping("/")
  private ResponseEntity<List<User>> getUsers() {
    List<User> userList = Optional.ofNullable(userService.findAll()).orElse(Collections.emptyList());
    return new ResponseEntity<>(userList, HttpStatus.OK);
  }
}
