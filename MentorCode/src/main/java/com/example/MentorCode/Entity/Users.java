package com.example.MentorCode.Entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_User")
    private int ID_User;

    @NotBlank(message = "El nombre no puede estar vacío")
    @Column(name = "Nombre")
    private String Nombre;

    @NotBlank(message = "El Email no puede estar vacío")
    @Email(message = "El email no es valido")
    @Column(name = "Email")
    private String Email;

    @NotBlank(message = "La contraseña no puede estar vacía")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$",
            message = "La contraseña debe tener al menos 8 caracteres, una letra mayúscula, una letra minúscula y un número")
    @Column(name = "Contraseña")
    private String Contraseña;


}
