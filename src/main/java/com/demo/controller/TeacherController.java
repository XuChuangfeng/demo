package com.demo.controller;

import com.demo.entity.Teacher;
import com.demo.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("teacher")
public class TeacherController {

    @Autowired
    private TeacherRepository teacherRepository;

    @GetMapping("{id}")
    public Teacher get(@PathVariable int id) {
        return teacherRepository.findById(id).get();
    }

    @GetMapping
    public List<Teacher> get() {
        return teacherRepository.findAll();
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        teacherRepository.deleteById(id);
    }

    @PostMapping
    public void save(@RequestBody Teacher teacher) {
        teacherRepository.save(teacher);
    }

    @PutMapping
    public void update(@RequestBody Teacher teacher) {
        teacherRepository.save(teacher);
    }

}
