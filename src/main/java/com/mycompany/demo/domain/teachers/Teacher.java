package com.mycompany.demo.domain.teachers;

/** 
 * Inheritance example.
 * 
 * Example of class extends abstract class.
 * Teacher class inherits data and behavior from superclass.
 * 
 * @author rodo
 *
 */
public class Teacher extends AbstractOfficer{

	private Integer schoolNumber;
	
	/**
	 * Constructor using fields
	 * @param schoolNumber
	 */
	public Teacher(Integer schoolNumber) {
		
		this.schoolNumber = schoolNumber;
	}
	
	/**
	 * Constructor using fields.
	 * Example setting supper field
	 * @param schoolNumber
	 */
	public Teacher(Integer schoolNumber, String name) {
		
		this.schoolNumber = schoolNumber;
		super.name = name;
	}
	
	
	@Override
	public String getInstitution() {
				
		return String.format("Escuela primaria nro %i" , schoolNumber);
	}
	
	
	/**
	 * Example of Override method and var args usage
	 */
	@Override
	public String toString() {
		
		return String.format("Class %s Name %s School %d", this.getClass().getSimpleName(), this.name, this.schoolNumber);
		
	}
}
