package com.example.springbootmongo.repository;

import com.example.springbootmongo.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, Long> {
}
