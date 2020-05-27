package com.demo.controller;

import com.demo.entity.Student;
import com.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("{id}")
    public Student get(@PathVariable int id) {
        return studentRepository.findById(id).get();
    }

    @GetMapping
    public List<Student> get() {
        return studentRepository.findAll();
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        studentRepository.deleteById(id);
    }

    @PostMapping
    public Student save(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @PutMapping
    public Student update(@RequestBody Student student) {
        return studentRepository.save(student);
    }

}
