package net.jaumebalmes.relaciones.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class CourseMaterial {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	 
	private String url;
	
	@OneToOne
	private CourseMaterial course;

    public CourseMaterial(long id, String url) {
        this.id = id;
        this.url = url;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Course [id=" + id + ", url=" + url + ", course=" + course + "]";
    }
    
}
