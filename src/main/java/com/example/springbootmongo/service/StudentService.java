package com.example.springbootmongo.service;

import com.example.springbootmongo.model.Student;
import com.example.springbootmongo.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public List<Student> getStudentList() {
        return studentRepository.findAll();
    }

    public String saveStudent(Student student) {
        return studentRepository.save(student).getName();
    }

    public Optional<Student> getById(long id) {
        return studentRepository.findById(id);
    }
}
