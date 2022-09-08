package com.capgemini.client;

import com.capgemini.entities.Student;
import com.capgemini.services.StudentService;
import com.capgemini.services.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		StudentService service=new StudentServiceImpl();
		
		Student s=new Student();
		
		//create Operation
		s.setRollno(1);
		s.setName("Komal");
		service.addStudent(s);
		
		/*//create Operation
		s.setRollno(2);
		s.setName("Lavanya");
		service.addStudent(s);*/
		
		//retrieve data
		/*s=service.getStudentById(2);
		System.out.println("Student Roll No: "+s.getRollno());
		System.out.println("Student Name: "+s.getName());*/
		
		/*//update
		s=service.getStudentById(1);
		s.setName("Trisha");
		service.updateStudent(s);*/
		
		//delete
		/*s=service.getStudentById(2);
		service.deleteStudent(s);
		System.out.println("Data is deleted");*/



	}

}
