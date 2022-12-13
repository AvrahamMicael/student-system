package com.avraham.studentsystem.services;

import java.util.List;
import com.avraham.studentsystem.models.Student;

public interface StudentService
{
  Student saveStudent(Student student);

  List<Student> getAllStudents();
}
