package com.myfirstprogram.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myfirstprogram.enitity.StudentEntity;
import com.myfirstprogram.repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public StudentEntity create(StudentEntity entity) {
        return repository.save(entity);
    }

    public List<StudentEntity> getAll() {
        return repository.findAll();
    }

    public StudentEntity getById(Long id) {
        Optional<StudentEntity> optionalStudent = repository.findById(id);
        return optionalStudent.orElse(null);
    }

    public void deleteStudentById(Long id) {
        repository.deleteById(id);
    }
}
