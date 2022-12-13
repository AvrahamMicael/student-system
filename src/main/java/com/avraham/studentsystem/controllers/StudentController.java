package com.avraham.studentsystem.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.avraham.studentsystem.models.Student;
import com.avraham.studentsystem.services.StudentService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("student")
public class StudentController
{
  @Autowired
  private StudentService studentService;

  @GetMapping
  public List<Student> getAll()
  {
    return this.studentService.getAllStudents();
  }

  @PostMapping
  public ResponseEntity<String> add(@RequestBody @Valid Student student)
  {
    this.studentService.saveStudent(student);
    return new ResponseEntity<>("Student successfully added!", HttpStatus.CREATED);
  }
}
