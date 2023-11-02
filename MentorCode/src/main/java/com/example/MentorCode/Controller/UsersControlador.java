package com.example.MentorCode.Controller;

import com.example.MentorCode.Entity.Users;
import com.example.MentorCode.Service.USIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Users")
public class UsersControlador {

    @Autowired
    private USIMPL usimpl;

    //Consultar todos los usuarios
    @GetMapping
    @RequestMapping(value = "consultarUsers", method = RequestMethod.GET)
    public ResponseEntity<?> consultarUsers(){
        List<Users> usersList = this.usimpl.consultarUsers();
        return ResponseEntity.ok(usersList);
    }

    //Modificar Usuarip
    @PutMapping
    @RequestMapping(value = "modificarUser", method = RequestMethod.PUT)
    public ResponseEntity<?> modificarUser(@RequestBody Users users){
        Users userModificado = this.usimpl.modificarUsers(users);
        return ResponseEntity.status(HttpStatus.CREATED).body(userModificado);
    }

    //Crear usuario
    @PostMapping
    @RequestMapping(value = "crearUser", method = RequestMethod.POST)
    public ResponseEntity<?> crearUser(@RequestBody Users users){
        Users usersCrear = this.usimpl.crearUsers(users);
        return ResponseEntity.status(HttpStatus.CREATED).body(usersCrear);
    }

    //Buscar usuarios por ID
    @GetMapping
    @RequestMapping(value = "buscarUser/{ID_Curso}", method = RequestMethod.GET)
    public ResponseEntity<?> buscarUsers(@PathVariable int ID_Curso){
        Users users = this.usimpl.buscarUsers(ID_Curso);
        return ResponseEntity.ok(users);
    }

    //Eliminar usuarios
    @DeleteMapping
    @RequestMapping(value = "eliminarUser/{ID_Curso}", method = RequestMethod.DELETE)
    public ResponseEntity<?> eliminarUsers(@PathVariable int ID_Curso){
        this.usimpl.eliminarUsers(ID_Curso);
        return ResponseEntity.ok("Usuario eliminado correctamente");
    }
}
