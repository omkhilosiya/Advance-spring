package com.example.SpringRevision.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringRevision.dto.Student;
import com.example.SpringRevision.service.Services;


@RestController
public class PracticeController {

	
	@Autowired
	private Services ser;
	
	
	@PostMapping("/savestudent")
	public String saveStudent( @RequestBody Student student) {
		return ser.saveStudent(student);
	}
	
	@GetMapping("/getstudents")
	public List<Student> getAllStudents(){
		
		return ser.getAllStudents();
		
	}
	
	@PutMapping("/updaterollno")
	public String updateTheRollno(@RequestBody Student student) {
		
		return ser.updateRollno(student);
	}
	
	@DeleteMapping("/datadelete")
	public boolean deleteData(@RequestBody Student student) {
		
		return ser.deletedata(student);
	}
	
	
}
