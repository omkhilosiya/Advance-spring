package com.example.SpringRevision.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringRevision.dto.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student,String>{
	
	
}
