package com.example.SpringRevision.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringRevision.dto.Student;
import com.example.SpringRevision.repository.StudentRepository;
import com.mongodb.MongoCursorNotFoundException;

@Service
public class ServiceImpl implements Services {
	
	@Autowired
	private StudentRepository studentrepository;

	@Override
	public String saveStudent(Student student) {
		return studentrepository.save(student).getId();
	}

	@Override
	public List<Student> getAllStudents() {
		return studentrepository.findAll();
	}

	@Override
	public String updateRollno(Student student) {
		Student updateStudent = studentrepository.findById(student.getId()).orElseThrow(() -> new NoSuchElementException("Employee not exist with id: "));	
		updateStudent.setRollno(student.getRollno());
		return studentrepository.save(updateStudent).getId();
	}

	@Override
	public boolean deletedata(Student student) {
		
		 if (studentrepository.existsById(student.getId())) {
		        studentrepository.delete(student);
		        return true; // deletion successful
		    }
		 
		return false;
	}


}
