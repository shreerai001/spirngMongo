package com.example.springbootmongo.controller;

import com.example.springbootmongo.model.Student;
import com.example.springbootmongo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    @GetMapping
    public ResponseEntity<List<Student>> getStudentList() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(studentService.getStudentList());
    }

    @PostMapping
    public ResponseEntity<String> saveStudent(@RequestBody Student student) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(studentService.saveStudent(student) + " Saved Successfully");
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Student>> getStudentById(@PathVariable long id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(studentService.getById(id));
    }
}
