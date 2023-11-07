package com.example.MentorCode.Repositorio;

import com.example.MentorCode.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepositorio extends JpaRepository <Users, Integer>{

    Users findByEmail(@Param("email") String email);
}
