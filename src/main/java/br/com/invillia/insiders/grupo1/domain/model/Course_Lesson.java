package br.com.invillia.insiders.grupo1.domain.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Course_Lesson {

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
//    @ManyToOne(fetch = FetchType.EAGER)
    private long course_id;
    private String title;
    private double duration;
    private LocalDateTime created_at = LocalDateTime.now();
    private LocalDateTime updated_at;

    public Course_Lesson(long course_id, String title, double duration) {
        this.course_id = course_id;
        this.title = title;
        this.duration = duration;
    }

    public Course_Lesson(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(long course_id) {
        this.course_id = course_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }
}
