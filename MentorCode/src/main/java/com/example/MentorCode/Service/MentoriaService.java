package com.example.MentorCode.Service;


import com.example.MentorCode.Entity.Mentoria;

import java.util.List;

public interface MentoriaService {

    public List<Mentoria> consultarMentores();

    public Mentoria crearMentor (Mentoria mentoria);

    public Mentoria modificarMentor(Mentoria mentoria);

    public Mentoria buscarMentor (int ID_Mentor);

    public void eliminarMentor(int ID_Mentor);
}
