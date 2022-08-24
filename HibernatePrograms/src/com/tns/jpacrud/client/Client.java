package com.tns.jpacrud.client;

import com.tns.jpacrud.entities.Student;
import com.tns.jpacrud.service.StudentService;
import com.tns.jpacrud.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		StudentService studentService=new StudentServiceImpl();
		
		Student student1=new Student();
		
		//Insert operation
		student1.setStudent_id(105);
        student1.setName("Rohan");
        studentService.addStudent(student1);
        
        //Retrieval operation
        Student student2=studentService.findStudentById(103);
        System.out.println(student2);
        
        //Update Operation
        student2.setName("Sam Preethi");
        studentService.updateStudent(student2);
        
       /* studentService.removeStudent(student2);*/
	}
}