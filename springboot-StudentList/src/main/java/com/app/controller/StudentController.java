package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.CourseRepository;
import com.app.entity.Course;
import com.app.entity.Student;
import com.app.service.StudentServiceImpl;



@RestController
@CrossOrigin("*")
public class StudentController {
	
	@Autowired
	private StudentServiceImpl studentService;
	
	@Autowired
	private CourseRepository courseRepo;
	
	@PostMapping("/save")
	public int saveStudent(@RequestBody Student stud) {
		return studentService.saveStudent(stud);	
	}
	
	@GetMapping("/getAllStudents")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();	
	}
	@DeleteMapping("/delete")
	public void deleteStudent(@RequestParam int id) {
		studentService.deleteStudent(id);	
	}
	@GetMapping("/getStudent")
	public Student getStudent(@RequestParam int id) {
		return studentService.getStudent(id);	
	}
	
	@GetMapping("/getCourses")
	public List<Course> getCourses() {
		List<Course> clist = courseRepo.findAll();
		System.out.println("------"+clist);
		return clist;	
	}
	   
	@GetMapping("/addCourse")
	public Course addCourse(@RequestParam String name) {
		Course c = new Course();
		c.setName(name);
		return courseRepo.save(c);	
	}
	
	@PostMapping("/saveCourse")
	public Course saveCourse(@RequestBody Course c) {
		return courseRepo.save(c);	
	}
}
