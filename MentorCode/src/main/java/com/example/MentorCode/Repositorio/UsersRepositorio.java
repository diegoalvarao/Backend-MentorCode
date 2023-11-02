package com.example.MentorCode.Repositorio;

import com.example.MentorCode.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepositorio extends JpaRepository <Users, Integer>{
}
