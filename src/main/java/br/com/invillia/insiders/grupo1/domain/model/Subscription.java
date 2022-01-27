package br.com.invillia.insiders.grupo1.domain.model;

import br.com.invillia.insiders.grupo1.domain.enumerator.SubscriptionStatus;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Subscription {

    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private long user_id;
    private long course_id;
    private double progress = 0.00;
    @Enumerated(EnumType.STRING)
    private SubscriptionStatus status;
    private LocalDateTime created_at = LocalDateTime.now();
    private LocalDateTime updated_at;

    public Subscription(long user_id, long course_id, SubscriptionStatus status) {
        this.user_id = user_id;
        this.course_id = course_id;
        this.status = status;
    }

    public Subscription(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(long course_id) {
        this.course_id = course_id;
    }

    public double getProgress() {
        return progress;
    }

    public void setProgress(double progress) {
        this.progress = progress;
    }

    public SubscriptionStatus getStatus() {
        return status;
    }

    public void setStatus(SubscriptionStatus status) {
        this.status = status;
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
