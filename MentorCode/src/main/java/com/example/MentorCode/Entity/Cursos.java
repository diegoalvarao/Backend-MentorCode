package com.example.MentorCode.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Cursos")
public class Cursos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Curso")
    @JsonProperty("ID_Curso")
    private int ID_Curso;

    @Column(name = "Nombre_Curso")
    @JsonProperty("Nombre_Curso")
    private String Nombre_Curso;

    @Column(name = "Tecnologia")
    @JsonProperty("Tecnologia")
    private String Tecnologia;

    @Column(name = "Descripcion")
    @JsonProperty("Descripcion")
    private String Descripcion;

    @Column(name = "Precio_Curso")
    @JsonProperty("Precio_Curso")
    private Double Precio_Curso;

    @Column(name = "Link_Curso")
    @JsonProperty("Link_Curso")
    private String Link_Curso;

    @Column(name = "Link_Imagen")
    @JsonProperty("Link_Imagen")
    private String Link_Imagen;

}
