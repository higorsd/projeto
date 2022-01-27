package br.com.invillia.insiders.grupo1.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Course_Approval {

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private long course_id;
    private String approved_by;
    private LocalDateTime created_at = LocalDateTime.now();
    private LocalDateTime updated_at;

    public Course_Approval(long course_id, String approved_by) {
        this.course_id = course_id;
        this.approved_by = approved_by;
    }

    public Course_Approval(){}

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

    public String getApproved_by() {
        return approved_by;
    }

    public void setApproved_by(String approved_by) {
        this.approved_by = approved_by;
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
