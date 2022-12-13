package com.avraham.studentsystem.services.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.avraham.studentsystem.models.Student;
import com.avraham.studentsystem.repositories.StudentRepository;
import com.avraham.studentsystem.services.StudentService;

@Service
public class StudentServiceImpl implements StudentService
{
  @Autowired
  private StudentRepository studentRepository;

  @Override
  public List<Student> getAllStudents()
  {
    return this.studentRepository.findAll();
  }

  @Override
  public Student saveStudent(Student student)
  {
    return this.studentRepository.save(student);
  }
}
