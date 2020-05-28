package com.mycompany.demo;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.demo.domain.IPerson;
import com.mycompany.demo.domain.students.IStudent;
import com.mycompany.demo.domain.students.Kid;
import com.mycompany.demo.domain.students.Young;
import com.mycompany.demo.domain.teachers.AbstractOfficer;
import com.mycompany.demo.domain.teachers.Professor;
import com.mycompany.demo.domain.teachers.Teacher;

public class Factory {

	
	public static IStudent createKid(String name, String grade) {
		
		return new Kid(name, grade);
	}
	
	public static IStudent createYoung(String name, String grade, boolean drivingLicense) {
		
		Young young = new Young(name, grade);
		young.setHasDrivingLicense(drivingLicense);
		
		return young;
	}
	
	public static Teacher createTeacher(String name, Integer schoolNumber) {
		
		Teacher teacher = new Teacher(schoolNumber, name);
		
		return teacher;		
	}
	
	public static AbstractOfficer createProffessor(String name) {
		
		Professor professor = new Professor();
		professor.setName(name);
		
		return professor;
		
	}
}
