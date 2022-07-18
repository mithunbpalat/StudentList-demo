package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.StudentRepository;
import com.app.entity.Student;
import com.app.serviceinterface.StudentServiceInterFace;

@Service
public class StudentServiceImpl implements StudentServiceInterFace{
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public int saveStudent(Student stud) {
		Student s = studentRepository.save(stud);
		return s.getId();
	}

	@Override
	public void deleteStudent(int id) {
		studentRepository.deleteById(id);
	}

	@Override
	public Student getStudent(int id) {
		Student s = studentRepository.findById(id);
		return s;
	}


	
}
