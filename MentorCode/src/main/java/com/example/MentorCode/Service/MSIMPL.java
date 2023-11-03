package com.example.MentorCode.Service;

import com.example.MentorCode.Entity.Mentoria;
import com.example.MentorCode.Repositorio.MentoriaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MSIMPL implements MentoriaService{

    @Autowired
    private MentoriaRepositorio mentoriaRepositorio;

    @Override
    public List<Mentoria> consultarMentores() {
        return (List<Mentoria>) this.mentoriaRepositorio.findAll();
    }

    @Override
    public Mentoria crearMentor(Mentoria mentoria) {
        return this.mentoriaRepositorio.save(mentoria);
    }

    @Override
    public Mentoria modificarMentor(Mentoria mentoria) {
        List<Mentoria> mentoriaList = consultarMentores();
        return this.mentoriaRepositorio.save(mentoria);
    }

    @Override
    public Mentoria buscarMentor(int ID_Mentor) {
        return this.mentoriaRepositorio.findById(ID_Mentor).get();
    }

    @Override
    public void eliminarMentor(int ID_Mentor) {
        this.mentoriaRepositorio.deleteById(ID_Mentor);
    }
}
