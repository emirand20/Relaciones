package net.jaumebalmes.relaciones.repositori;

import org.springframework.data.repository.CrudRepository;

import net.jaumebalmes.relaciones.entity.Course;

public interface CourseRepositorio extends CrudRepository<Course, Long >{
    
}
