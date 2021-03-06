package com.projects.scheduler.model;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity @Getter
@Table(name="Course")
public class Course {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String title;

    private List<Professor> professors = new ArrayList<>();

    private List<Schedule> schedules = new ArrayList<>();

    private List<Department> deparments = new ArrayList<>();

}
