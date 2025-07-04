package com.essj.wh_user.repositories;

import com.essj.wh_user.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByCpf(String cpf);

    List<User> findByNomeContainingIgnoreCase(String nome);
}
