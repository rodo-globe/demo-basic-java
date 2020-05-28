package com.mycompany.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javax.naming.ConfigurationException;
import javax.naming.NamingException;

import org.omg.CORBA.portable.ApplicationException;

import com.mycompany.demo.domain.IPerson;
import com.mycompany.demo.domain.students.IStudent;

public class Example {
	
	
	public void run() {
		
		/**
		 * Example of polymorphic list
		 */
		List<IPerson> persons = new ArrayList<>();
		
		persons.add(Factory.createKid("Bob", "1st"));
		persons.add(Factory.createKid("Alice", "1st"));
		persons.add(Factory.createKid("Mark", "2nd"));
		persons.add(Factory.createTeacher("Mary", 123));
		persons.add(Factory.createTeacher("Paul", 124));
		persons.add(Factory.createYoung("Saly", "9th", true));
		persons.add(Factory.createYoung("Yenny", "8th", true));
		persons.add(Factory.createYoung("Robert", "7th", false));
				
		
		printPersons(persons);
		
		List<IStudent> students = printStudents(persons);
		
		printStudentsToUpper(students);
		
		printReverseName(students);
			
		/**
		 * Passing code block as argument
		 */
		functionalTest(persons, p -> 
			
			p.getName().equalsIgnoreCase("Bob") || p.getName().equalsIgnoreCase("Robert") 	
		
			);
		
		/**
		 * Use of functional interface
		 */
		IPerson policeOfficer = () ->{
			
			return "Robocop";
		};
		
		System.out.println("\nPolice officer name " + policeOfficer.getName());
		
	
		/**
		 * Exception handling example and multi catch
		 */
		try {
			
			System.out.println("\nException handling example ");
			
			exceptionHandlingTest(students.get(0));
			
		}catch(TimeoutException | NamingException | RuntimeException e) {
			
			e.printStackTrace();
		}
	}

	/**
	 * Streams, lambda and polymorphism 
	 * 
	 * @param persons
	 * @return
	 */
	private List<IStudent> printStudents(List<IPerson> persons) {
	
		/**
		 * Streams example and method reference
		 */
		IStudent[] studentsArr = persons.stream().filter(p -> p instanceof IStudent).toArray(IStudent[]::new);
		
		
		/**
		 * Array manipulation
		 */
		List<IStudent> onlyStudents = Arrays.asList(studentsArr);
		
		System.out.println("\nList of students");
		System.out.println("----------------");
		
		/**
		 * lambda example whith runtime polimorphism 
		 */
		onlyStudents.forEach(s -> {
			
			
			System.out.println(s.getClass().getSimpleName() + " " + s.getName() + " " + s.getGrade());
		});
		
	
		System.out.println("=========");
		
		return onlyStudents;
		
	}
	
	
	/**
	 * Lambda example 
	 * 
	 * @param persons
	 */
	private void printPersons(List<IPerson> persons) {
		
		System.out.println("\nList of persons");
		System.out.println("----------------");
		
		/**
		 * Lambda example
		 */
		persons.forEach( p -> System.out.println(p.toString()));
		
		System.out.println("=========");
		
	}
	
	/**
	 * Method reference example
	 * @param students
	 */
	private void printStudentsToUpper(List<IStudent> students) {
		
		System.out.println("\nStudents toUpper ");
		students.forEach(this::printToUpper);
	}
	
	private void printToUpper(IStudent student) {
		
		System.out.println("Student toUpper " + student.getName().toUpperCase());
	}
	
	
	private void printReverseName(List<IStudent> students) {
		
		System.out.println("\nStudents reverse names ");
		students.forEach(s -> System.out.println(s.reverseName()));
	}
	
	/**
	 * Receiving function as argument
	 * @param persons
	 * @param predicate
	 */
	private void functionalTest(List<IPerson> persons, Predicate<IPerson> predicate) {
		
		List<IPerson> personsFiltered = persons.stream().filter(predicate).collect(Collectors.toList());
		
		printPersons(personsFiltered);
	}
	
	/**
	 * Checked and noChecked exception example
	 * @param student
	 * @throws NamingException
	 * @throws ConfigurationException
	 */
	private void exceptionHandlingTest(IStudent student) throws NamingException,  TimeoutException{
		
		if(student == null) {
			
			throw new IllegalArgumentException();	
			
		}else if(student instanceof IPerson){
			
			throw new NamingException();
		}else {
			
			throw new TimeoutException();
		}		
	}
	
}
