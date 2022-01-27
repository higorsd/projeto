package br.com.invillia.insiders.grupo1.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Certificate {

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private long course_id;
    private long user_id;
    private LocalDateTime issued_at;
    private LocalDateTime created_at = LocalDateTime.now();
    private LocalDateTime updated_at;

    public Certificate(long user_id, long course_id) {
        this.user_id = user_id;
        this.course_id = course_id;
    }

    public Certificate(){}

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

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public LocalDateTime getIssued_at() {
        return issued_at;
    }

    public void setIssued_at(LocalDateTime issued_at) {
        this.issued_at = issued_at;
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
