package com.example.MentorCode.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Cursos")
public class Cursos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Curso")
    private int ID_Curso;

    @Column(name = "Nombre_Curso")
    private String Nombre_Curso;

    @Column(name = "Tecnologia")
    private String Tecnologia;

    @Column(name = "Descripcion")
    private String Descripcion;

    @Column(name = "Precio_Curso")
    private Double Precio_Curso;

    @Column(name = "Link_Curso")
    private String Link_Curso;

    @Column(name = "Link_Imagen")
    private String Link_Imagen;

}
