package com.example.MentorCode.Controller;

import com.example.MentorCode.Entity.Cursos;
import com.example.MentorCode.Service.CSIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Cursos")
public class CursosControlador {

    @Autowired
    private CSIMPL csimpl;

    //Consultar todos los cursos
    @GetMapping
    @RequestMapping(value = "consultarCursos", method = RequestMethod.GET)
    public ResponseEntity<?> consultarCursos(){
        List<Cursos> CursoList = this.csimpl.consultarCursos();
        return ResponseEntity.ok(CursoList);
    }

    //Modificar Curso
    @PutMapping
    @RequestMapping(value = "modificarCurso", method = RequestMethod.PUT)
    public ResponseEntity<?> modificarCurso(@RequestBody Cursos cursos){
        Cursos cursoModificado = this.csimpl.modificarCurso(cursos);
        return ResponseEntity.status(HttpStatus.CREATED).body(cursoModificado);
    }

    //Crear Curso
    @PostMapping
    @RequestMapping(value = "crearCurso", method = RequestMethod.POST)
    public ResponseEntity<?> crearCurso(@RequestBody Cursos cursos){
        Cursos cursoCrear = this.csimpl.crearCurso(cursos);
        return ResponseEntity.status(HttpStatus.CREATED).body(cursoCrear);
    }

    //Buscar Curso por ID
    @GetMapping
    @RequestMapping(value = "buscarCurso/{ID_Curso}", method = RequestMethod.GET)
    public ResponseEntity<?> buscarCurso(@PathVariable int ID_Curso){
        Cursos cursos = this.csimpl.buscarCurso(ID_Curso);
        return ResponseEntity.ok(cursos);
    }

    //Eliminar Curso
    @DeleteMapping
    @RequestMapping(value = "eliminarCurso/{ID_Curso}", method = RequestMethod.DELETE)
    public ResponseEntity<?> eliminarCurso(@PathVariable int ID_Curso){
        this.csimpl.eliminarCurso(ID_Curso);
        return ResponseEntity.ok("Curso eliminado correctamente");
    }

}
