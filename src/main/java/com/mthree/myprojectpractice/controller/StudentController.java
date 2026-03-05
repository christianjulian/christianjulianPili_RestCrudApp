package com.mthree.myprojectpractice.controller;

import com.mthree.myprojectpractice.entity.Student;
import com.mthree.myprojectpractice.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    // CREATE
    @PostMapping
    public Student create(@RequestBody Student student) {
        return service.createStudent(student);
    }

    // READ ALL
    @GetMapping
    public List<Student> all() {
        return service.getAllStudents();
    }

    // READ ONE
    @GetMapping("/{id}")
    public Student one(@PathVariable Long id) {
        return service.getStudentById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Student update(@PathVariable Long id, @RequestBody Student student) {
        return service.updateStudent(id, student);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteStudent(id);
        return "Deleted student with id " + id;
    }
}