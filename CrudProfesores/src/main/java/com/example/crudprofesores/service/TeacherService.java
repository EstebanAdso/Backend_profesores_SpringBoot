package com.example.crudprofesores.service;

import com.example.crudprofesores.entity.TeacherEntity;
import com.example.crudprofesores.repositories.TeacherRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {
    @Autowired
    TeacherRepositories teacherRepositories;

    public List<TeacherEntity> getTeachers(){
        return teacherRepositories.findAll();
    }

    public Optional<TeacherEntity> getTeacher(Long id){
        return teacherRepositories.findById(id);
    }

    public void save(TeacherEntity teacherEntity){
        teacherRepositories.save(teacherEntity);
    }
    public void update(TeacherEntity teacherEntity){
        teacherRepositories.save(teacherEntity);
    }

    public void delete (Long id){
        teacherRepositories.deleteById(id);
    }

}
