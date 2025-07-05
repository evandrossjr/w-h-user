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

    public UserDTO findById (Long id) {
        Optional<User> result = userRepository.findById(id);
        if (result.isPresent()){
            return UserDTO.toDTO(result.get());
        }
        return null;
    }

    public UserDTO save(UserDTO userDTO){
        User user = userRepository.save(User.fromDTO(userDTO));
        return UserDTO.toDTO(user);
    }

    public UserDTO delete(Long id){
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()){
            userRepository.delete(user.get());
        }
        return null;
    }

    public UserDTO findByCpf(String cpf){
        User user = userRepository.findByCpf(cpf);
        if (user != null){
            return UserDTO.toDTO(user);
        }
        return null;
    }

    public List<UserDTO> queryByName(String nome){
        List<User> users = userRepository.findByNomeContainingIgnoreCase(nome);
        return users.stream().map(UserDTO::toDTO).collect(Collectors.toList());

    }
}
