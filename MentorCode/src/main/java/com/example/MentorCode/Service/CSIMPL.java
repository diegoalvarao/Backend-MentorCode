package com.example.MentorCode.Service;

import com.example.MentorCode.Entity.Cursos;
import com.example.MentorCode.Repositorio.CursosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CSIMPL implements CursosService{

    @Autowired
    private CursosRepositorio cursosRepositorio;

    @Override
    public List<Cursos> consultarCursos() {
        return (List<Cursos>) this.cursosRepositorio.findAll();
    }

    @Override
    public Cursos crearCurso(Cursos cursos) {
        return this.cursosRepositorio.save(cursos);
    }

    @Override
    public Cursos modificarCurso(Cursos cursos) {
        List<Cursos> cursosList = consultarCursos();
        return this.cursosRepositorio.save(cursos);
    }

    @Override
    public Cursos buscarCurso(int ID_Curso) {
        return this.cursosRepositorio.findById(ID_Curso).get();
    }

    @Override
    public void eliminarCurso(int ID_Curso) {
        this.cursosRepositorio.deleteById(ID_Curso);

    }
}
