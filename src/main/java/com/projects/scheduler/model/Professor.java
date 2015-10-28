package com.projects.scheduler.model;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity @Getter
@Table(name="Professor")
public class Professor {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String firstName;

    private String lastName;

    private String email;

    private List<Course> courses = new ArrayList<>();

    private List<Department> departments = new ArrayList<>();


}
