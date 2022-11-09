package net.jaumebalmes.relaciones.controllers;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.jaumebalmes.relaciones.entity.Course;
import net.jaumebalmes.relaciones.error.apiError;
import net.jaumebalmes.relaciones.repositori.CourseRepositorio;

@RestController
@RequestMapping("JPARelaciones")
public class CourseController {

    @Autowired
	CourseRepositorio cursosRep;

    // Muestra los cursos por Id
	@GetMapping("cursos/{id}")
	public Course getCursosId(@PathVariable long id) {
		Course cursos = cursosRep.findById(id).get();
		
		return cursos;
	}
	
	// Muestra todos los cursos
	@GetMapping("cursos")
	public Iterable<Course> getCursos() {
		
		return cursosRep.findAll();
	}
	
	//Control del error
	@ExceptionHandler(Exception.class)
	public ResponseEntity<apiError> handlecourseNoEncontrado(Exception ex){
		
		apiError apierror = new apiError();
		apierror.setEstado(HttpStatus.NOT_FOUND);
		apierror.setFecha(LocalDateTime.now());
		apierror.setMensaje(ex.getMessage());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(apierror);
	}
}
