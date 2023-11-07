package com.example.MentorCode.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Mentoria")
public class Mentoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_Mentor")
    @JsonProperty("ID_Mentor")
    private int ID_Mentor;

    @Column(name = "Nombre_Mentor")
    @JsonProperty("Nombre_Mentor")
    private String Nombre_Mentor;

    @Column(name = "Tecnologia")
    @JsonProperty("Tecnologia")
    private String Tecnologia;

    @Column(name = "Perfil")
    @JsonProperty("Perfil")
    private String Perfil;

    @Column(name = "Duracion_Mentoria")
    @JsonProperty("Duracion_Mentoria")
    private String Duracion_Mentoria;

    @Column(name = "Precio_Mentoria")
    @JsonProperty("Precio_Mentoria")
    private Double Precio_Mentoria;

    @Column(name = "Link_Foto")
    @JsonProperty("Link_Foto")
    private String Link_Foto;

}
