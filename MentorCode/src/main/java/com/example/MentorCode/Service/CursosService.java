package com.example.MentorCode.Service;

import com.example.MentorCode.Entity.Cursos;


import java.util.List;

public interface CursosService {

    public List<Cursos> consultarCursos();

    public Cursos crearCurso (Cursos cursos);

    public Cursos modificarCurso(Cursos cursos);

    public Cursos buscarCurso(int ID_Curso);

    public void eliminarCurso(int ID_Curso);
}
