package com.mycompany.demo.domain.students;


/**
 * Class Kid implements Interface IStudent,
 * so must implement IStudent and IPerson Methods !!!
 * 
 * @author rodo
 *
 */
public class Kid implements IStudent{

	/**
	 * Private properties example
	 */
	private String name;
	private String grade;
		
	/**
	 * Constructor with fields example
	 * 
	 * @param name
	 * @param grade
	 */
	public Kid(String name, String grade) {
		
		super();
		this.name = name;
		this.grade = grade;
	}
	
	/**
	 * Implementation of IPerson method
	 */
	@Override
	public String getName() {
	
		return name;
	}

	/**
	 * Implementation of IStudent method
	 */
	@Override
	public String getGrade() {
		
		return grade;
	}

	/**
	 * Set property example.
	 * 
	 * @param name
	 */
	public void setName(String name) {
		
		this.name = name;
	}

	public void setGrade(String grade) {
		
		this.grade = grade;
	}
	
	/**
	 * Example of Override method and var args usage
	 */
	@Override
	public String toString() {
		
		return String.format("Class %s Name %s Grade %s", this.getClass().getSimpleName(), this.name, this.grade);
		
	}
}

