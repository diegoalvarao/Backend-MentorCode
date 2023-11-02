package com.example.MentorCode.Repositorio;

import com.example.MentorCode.Entity.Mentoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MentoriaRepositorio extends JpaRepository<Mentoria, Integer> {
}
