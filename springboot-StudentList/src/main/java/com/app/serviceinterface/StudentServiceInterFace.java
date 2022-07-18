package com.app.serviceinterface;

import java.util.List;

import com.app.entity.Student;

public interface StudentServiceInterFace {
	
	public List<Student> getAllStudents();
	public int saveStudent(Student stud);
	public void deleteStudent(int id);
	public Student getStudent(int id);
	
}
