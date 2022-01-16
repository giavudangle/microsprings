package com.vudang.user.controller;


import com.vudang.user.entity.User;
import com.vudang.user.service.UserService;
import com.vudang.user.shared.entity.ResponseTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User saveUser(@RequestBody User user){
        log.info("Inside saveUser of the User Controller");
        return this.userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplate getUserWithDepartment(@PathVariable("id") Long userId){
        log.info("Inside getUserWithDepartment of the User Controller");
        return userService.getUserWithDepartment(userId);
    }

}
