package com.example.MentorCode.Controller;

import com.example.MentorCode.Entity.Users;
import com.example.MentorCode.Service.USIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://127.0.0.1:5501")
@RestController
@RequestMapping("/api")
public class LoginControlador {

    @Autowired
    USIMPL usimpl;


    //Login de usuarios
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Users users){
        String Email = users.getEmail();
        String Contrasena = users.getContrasena();

        boolean loginSuccessful = this.usimpl.checkLogin(Email, Contrasena);
        if (loginSuccessful) {
            return ResponseEntity.ok("Inicio de sesión exitoso");
        } else {
            /*Log para validar que se tomen datos en los campos de ingreso
            System.out.println(Email);
            System.out.println(Contrasena); */
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciales incorrectas");
        }
    }
}
