package com.example.SpringRevision.service;

import java.util.List;

import com.example.SpringRevision.dto.Student;

public interface Services {

	String saveStudent(Student student);

	List<Student> getAllStudents();

	String updateRollno(Student student);

	boolean deletedata(Student student);


}

