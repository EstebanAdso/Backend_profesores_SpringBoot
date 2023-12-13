package com.example.crudprofesores.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.query.sql.internal.ParameterRecognizerImpl;

import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
@Table(name ="Listado_profesores")
public class TeacherEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teacherId;
    private String name;
    private String lastName;
    @Column(name= "email_teachers",unique = true,nullable = false)
    private String email;
    private char gender;
    private int yearsExperience;
    private LocalDate bornDate;
    private String subject;
}
