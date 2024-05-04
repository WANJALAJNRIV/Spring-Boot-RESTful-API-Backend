package com.backend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String courseCode;
    private String courseTitle;
    private int courseHours;
    private String deliverCompus;
    private String deliverMethod;
    private Date createdAt;
    private String professor;

    // Constructors
    public Course() {
    }

    public Course(String courseCode, String courseTitle, int courseHours, String deliverCompus, String deliverMethod, Date createdAt, String professor) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.courseHours = courseHours;
        this.deliverCompus = deliverCompus;
        this.deliverMethod = deliverMethod;
        this.createdAt = createdAt;
        this.professor = professor;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public int getCourseHours() {
        return courseHours;
    }

    public void setCourseHours(int courseHours) {
        this.courseHours = courseHours;
    }

    public String getDeliverCompus() {
        return deliverCompus;
    }

    public void setDeliverCompus(String deliverCompus) {
        this.deliverCompus = deliverCompus;
    }

    public String getDeliverMethod() {
        return deliverMethod;
    }

    public void setDeliverMethod(String deliverMethod) {
        this.deliverMethod = deliverMethod;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }
}
