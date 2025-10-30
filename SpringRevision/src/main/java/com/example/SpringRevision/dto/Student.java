package com.example.SpringRevision.dto;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "students")
public class Student {
	@Id
	private String id;
	private String name;
	private String rollno;
	private List<Hobbies> Hobbies;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public List<Hobbies> getHobbies() {
		return Hobbies;
	}
	public void setHobbies(List<Hobbies> hobbies) {
		Hobbies = hobbies;
	}
	
	
	
	
	

} 
