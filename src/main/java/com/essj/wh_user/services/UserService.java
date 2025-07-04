package com.essj.wh_user.services;

import com.essj.wh_user.dtos.UserDTO;
import com.essj.wh_user.entities.User;
import com.essj.wh_user.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserDTO> findAll(){
        List<User> users = userRepository.findAll();
        return users.stream().map(UserDTO::toDTO).collect(Collectors.toList());

    }

    public UserDTO findById (Long id){
        User result = userRepository.findById(id).orElseThrow(()-> new RuntimeException("User not found!"));
        return UserDTO.toDTO(result);

    }

}
