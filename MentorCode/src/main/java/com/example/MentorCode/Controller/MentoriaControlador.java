package com.example.MentorCode.Controller;

import com.example.MentorCode.Entity.Mentoria;
import com.example.MentorCode.Service.MSIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("Mentorias")
public class MentoriaControlador {

    @Autowired
    private MSIMPL msimpl;

    //Consultar todos los Mentorias
    @GetMapping
    @RequestMapping(value = "consultarMentores", method = RequestMethod.GET)
    public ResponseEntity<?> consultarMentores(){
        List<Mentoria> CursoList = this.msimpl.consultarMentores();
        return ResponseEntity.ok(CursoList);
    }

    //Modificar Mentor
    @PutMapping
    @RequestMapping(value = "modificarMentor", method = RequestMethod.PUT)
    public ResponseEntity<?> modificarMentor(@RequestBody Mentoria mentoria){
        Mentoria mentorModificado = this.msimpl.modificarMentor(mentoria);
        return ResponseEntity.status(HttpStatus.CREATED).body(mentorModificado);
    }

    //Crear Mentor
    @PostMapping
    @RequestMapping(value = "crearMentor", method = RequestMethod.POST)
    public ResponseEntity<?> crearMentor(@RequestBody Mentoria mentoria){
        Mentoria mentorCrear = this.msimpl.crearMentor(mentoria);
        return ResponseEntity.status(HttpStatus.CREATED).body(mentorCrear);
    }

    //Buscar Mentor por ID
    @GetMapping
    @RequestMapping(value = "buscarMentor/{ID_Mentor}", method = RequestMethod.GET)
    public ResponseEntity<?> buscarMentor(@PathVariable int ID_Mentor){
        Mentoria mentoria = this.msimpl.buscarMentor(ID_Mentor);
        return ResponseEntity.ok(mentoria);
    }

    //Eliminar Mentor
    @DeleteMapping
    @RequestMapping(value = "eliminarMentor/{ID_Mentor}", method = RequestMethod.DELETE)
    public ResponseEntity<?> eliminarMentor(@PathVariable int ID_Mentor){
        this.msimpl.eliminarMentor(ID_Mentor);
        return ResponseEntity.ok("Mentor eliminado correctamente");
    }
}
