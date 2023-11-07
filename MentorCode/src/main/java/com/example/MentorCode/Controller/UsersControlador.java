package com.example.MentorCode.Controller;
import com.example.MentorCode.Entity.Users;
import com.example.MentorCode.Service.USIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://127.0.0.1:5501")
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
    public ResponseEntity<Map<String, String>> crearUser(@RequestBody Users users){
        Users usersCrear = this.usimpl.crearUsers(users);
        Map<String, String> respuestica = new HashMap<>();
        respuestica.put("respuesta","Su usuario fue creado exitosamente");
        return ResponseEntity.ok(respuestica);
    }

    //Buscar usuarios por ID
    @GetMapping
    @RequestMapping(value = "buscarUser/{ID_User}", method = RequestMethod.GET)
    public ResponseEntity<?> buscarUsers(@PathVariable int ID_User){
        Users users = this.usimpl.buscarUsers(ID_User);
        return ResponseEntity.ok(users);
    }

    //Eliminar usuarios
    @DeleteMapping
    @RequestMapping(value = "eliminarUser/{ID_User}", method = RequestMethod.DELETE)
    public ResponseEntity<?> eliminarUsers(@PathVariable int ID_User){
        this.usimpl.eliminarUsers(ID_User);
        return ResponseEntity.ok("Usuario eliminado correctamente");
    }
}
