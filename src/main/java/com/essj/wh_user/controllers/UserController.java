package com.essj.wh_user.controllers;

import com.essj.wh_user.dtos.UserDTO;
import com.essj.wh_user.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<UserDTO> findAll(){
        return userService.findAll();
    }

    @GetMapping("users/{id}")
    public UserDTO findById(Long id){
        return userService.findById(id);
    }

}
