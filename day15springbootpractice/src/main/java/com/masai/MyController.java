package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
//@RequestMapping("/students")
public class MyController {
	
	
	List<Student> list = new ArrayList<>();
	
	public MyController() {
		list.add(new Student(10,"st1",780));
		list.add(new Student(20,"st2",750));
		list.add(new Student(30,"st3",700));
		list.add(new Student(40,"st4",680));
		list.add(new Student(50,"st5",650));
	}
	
	@GetMapping("/students")
	public List<Student> getAllSt(){
		return list;
	}
	@GetMapping("/student/{roll}")
	public ResponseEntity<Student> getStudentHandler(@PathVariable("roll") Integer roll){
		Student st = new Student(roll, "st6", 620);
		
		HttpHeaders hh = new HttpHeaders();
		hh.add("e1", "asdc");
		hh.add("e2", "kjhg");
		
		
		ResponseEntity<Student> re = new ResponseEntity<Student>(st,hh, HttpStatus.CREATED);
		return re;
	}
	
	
	@GetMapping("/hello")
	public ResponseEntity<String> hello() {
		HttpHeaders hh = new HttpHeaders();
		hh.add("e1", "asdf");
		hh.add("e2","ghjk");
	return new ResponseEntity<>("Hello World!",hh, HttpStatus.CREATED);
	}
	
	@GetMapping("/getStudent/{roll}")
	public Student getStudentDetails(@PathVariable Integer roll) throws InvalidRollException {
	if(roll < 100)
	throw new InvalidRollException("Roll number should be greater than 100");
	
	return new Student(roll, "efat", 650);
	}
//	@ExceptionHandler(IllegalArgumentException.class)
//	public ResponseEntity<String> myHandler(IllegalArgumentException ie){
//		System.out.println("inside myHandler method...");
//		
//		return new ResponseEntity<String>(ie.getMessage(),HttpStatus.BAD_REQUEST);
//	}

}
