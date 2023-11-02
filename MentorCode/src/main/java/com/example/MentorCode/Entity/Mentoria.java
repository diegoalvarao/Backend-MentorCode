package com.example.MentorCode.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Mentoria")
public class Mentoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Mentor")
    private int ID_Mentor;

    @Column(name = "Nombre_Mentor")
    private String Nombre_Mentor;

    @Column(name = "Tecnologia")
    private String Tecnologia;

    @Column(name = "Perfil")
    private String Perfil;

    @Column(name = "Duracion_Mentoria")
    private String Duracion_Mentoria;

    @Column(name = "Precio_Mentoria")
    private Double Precio_Mentoria;

    @Column(name = "Link_Foto")
    private String Link_Foto;

}
