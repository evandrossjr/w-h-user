package com.essj.wh_user.controllers;

import com.essj.wh_user.dtos.UserDTO;
import com.essj.wh_user.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public UserDTO findById(@PathVariable Long id){
        return userService.findById(id);
    }


    @GetMapping("users/cpf/{cpf}")
    public UserDTO findByCpf(@PathVariable String cpf){
        return userService.findByCpf(cpf);
    }

    @DeleteMapping("users/{id}")
    public UserDTO delete(@PathVariable Long id){
        return userService.delete(id);
    }

    @PostMapping("/users")
    public UserDTO newUser(@RequestBody UserDTO userDTO){
        return userService.save(userDTO);
    }

    @GetMapping("users/search")
    public List<UserDTO> queryByName(@RequestParam (name="nome", required = true) String nome){
        return userService.queryByName(nome);
    }

}
