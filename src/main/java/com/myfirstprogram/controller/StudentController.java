package com.myfirstprogram.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myfirstprogram.enitity.StudentEntity;
import com.myfirstprogram.service.StudentService;

@RequestMapping("www.student.dev")
@RestController
public class StudentController {
    @Autowired
    private StudentService service;

    @PostMapping("/post")
    public StudentEntity create(@RequestBody StudentEntity entity) {
        return service.create(entity);
    }

    @GetMapping("/getAll")
    public List<StudentEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/getById/{id}")
    public StudentEntity findById(@PathVariable Integer id) {
        return service.getById(id.longValue());
    }

    @DeleteMapping("/deleteById/{id}")
    public void delete(@PathVariable("id") Long id) {
        service.deleteStudentById(id);
    }

}
