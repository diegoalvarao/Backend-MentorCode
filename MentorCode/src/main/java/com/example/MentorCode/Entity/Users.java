package com.example.MentorCode.Entity;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Getter
@Setter
@Table(name = "users")
@NamedQuery(name = "Users.findByEmail", query = "SELECT u FROM Users u WHERE u.Email = :email")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_User")
    @JsonProperty("ID_User")
    private int ID_User;

    @NotBlank(message = "El nombre no puede estar vacío")
    @Column(name = "Nombre")
    @JsonProperty("Nombre")
    private String Nombre;

    //@NotBlank(message = "El Email no puede estar vacío")
    //@Email(message = "El email no es valido")
    @Column(name = "Email")
    @JsonProperty("Email")
    private String Email;

    //@NotBlank(message = "La contraseña no puede estar vacía")
    //@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$",
         //   message = "La contraseña debe tener al menos 8 caracteres, una letra mayúscula, una letra minúscula y un número")
    @Column(name = "Contrasena")
    @JsonProperty("Contrasena")
    private String Contrasena;

}
