package com.mycompany.demo.domain.teachers;

import java.util.Random;

/**
 * Inheritance example.
 * 
 * Example of class extends abstract class.
 * Professor class inherits data and behavior from superclass.
 * 
 * @author rodo
 *
 */
public class Professor extends AbstractOfficer{

	private String university;
	
	public Professor() {
		
		Random r = new Random();
		
		Integer code = r.nextInt(7);
		
		university = getInstitution(code);	
	}
	
	/**
	 * private method, not accessible outside this class.
	 * 
	 * @param code
	 * @return
	 */	
	private String getInstitution(int code) {
		
		String university;
		
		switch(code) {
		
		case 0:
			university = "Udelar";
			break;
			
		case 1: 
			university = "ORT";
			break;
		case 2: 
			university = "Ucudal";
			break;
		case 3: 
			university = "UDE";
			break;
		case 4: 
			university = "UM";
			break;
		default:
			university = "unemployed";
		}
		
		return university;
	}
	
	/**
	 * Example of abstraction, where Professor resolves the institution but hides
	 * details about its implementation
	 */
	@Override
	public String getInstitution() {
		
		return university;
	}
	
	/**
	 * Example setting super field
	 * @param name
	 */
	public void setName(String name) {
		
		super.name = name;
	}
	
	/**
	 * Example of Override method and var args usage
	 */
	@Override
	public String toString() {
		
		return String.format("Class %s Name %s University %s", this.getClass().getSimpleName(), this.name, this.university);
		
	}

}
