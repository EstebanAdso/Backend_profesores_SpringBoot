package com.example.crudprofesores.controller;

import com.example.crudprofesores.entity.TeacherEntity;
import com.example.crudprofesores.service.TeacherService;
import jakarta.persistence.PostUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/Teacher")
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    @GetMapping
    public List<TeacherEntity> getAll (){
        return teacherService.getTeachers();
    }
    @GetMapping("/{id}")
    public Optional<TeacherEntity> get (@PathVariable("id") Long id){
        return teacherService.getTeacher(id);
    }
    @PostMapping
    public void save (@RequestBody TeacherEntity teacherEntity){
       teacherService.save(teacherEntity);
    }
    @PutMapping
    public void update (@RequestBody TeacherEntity teacherEntity){
        teacherService.update(teacherEntity);
    }

    @DeleteMapping("/{teacher_id}")
    public void delete(@PathVariable("teacher_id") long teacher_id){
        teacherService.delete(teacher_id);
    }
}
