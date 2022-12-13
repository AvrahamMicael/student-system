package com.avraham.studentsystem.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Student
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @NotBlank
  @Size(min = 3, max = 100)
  public String name;

  @NotBlank
  @Size(min = 3, max = 100)
  public String address;

  public int getId()
  {
    return this.id;
  }
}
