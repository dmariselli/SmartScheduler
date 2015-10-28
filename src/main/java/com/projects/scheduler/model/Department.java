package com.projects.scheduler.model;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity @Getter
@Table(name="Department")
public class Department {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String name;

    private List<Course> courses = new ArrayList<>();

    private  List<Professor> professors = new ArrayList<>();
}
