package net.jaumebalmes.relaciones.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Course {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	 
	private String title;

    @OneToOne(mappedBy = "course")
	@JsonIgnore
    private Course courseMaterial;
    
    public Course(long id, String title) {
        this.id = id;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Course getCourseMaterial() {
        return courseMaterial;
    }

    public void setCourseMaterial(Course courseMaterial) {
        this.courseMaterial = courseMaterial;
    }

    @Override
    public String toString() {
        return "CourseMaterial [id=" + id + ", title=" + title + ", courseMaterial=" + courseMaterial + "]";
    }
}
