package com.myfirstprogram.enitity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "Student_tbl")
public class StudentEntity {
    @Id
    @GeneratedValue
    private Long id;
    private Integer age;
    private String studentName;
    private String studentAddress;
}
