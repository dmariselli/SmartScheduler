package com.projects.scheduler.model;

import lombok.Getter;

import javax.persistence.*;

@Entity @Getter
@Table(name="Course")
public class Course {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String title;


}
