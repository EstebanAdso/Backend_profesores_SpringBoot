package com.example.crudprofesores.repositories;

import com.example.crudprofesores.entity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepositories extends JpaRepository<TeacherEntity, Long> {
}
