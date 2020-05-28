package com.mycompany.demo.domain.students;

/**
 * Class Young implements Interface IStudent,
 * so must implement IStudent and IPerson Methods !!!
 * 
 * @author rodo
 *
 */
public class Young implements IStudent{

	/**
	 * Private properties example
	 */
	private String name;
	private String grade;
	
	private boolean hasDrivingLicense;
	
	
	/**
	 * Example of constructor with some fields
	 * @param name
	 * @param grade
	 */
	public Young(String name, String grade) {
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
	 * Implementation of IStudent interface
	 */
	@Override
	public String getGrade() {
		
		return grade;
	}

	public boolean isHasDrivingLicense() {
		
		return hasDrivingLicense;
	}

	public void setHasDrivingLicense(boolean hasDrivingLicense) {
		
		this.hasDrivingLicense = hasDrivingLicense;
	}
	
	/**
	 * Example of Override method and var args usage
	 */
	@Override
	public String toString() {
		
		return String.format("Class %s Name %s Grade %s Driving license %b ", this.getClass().getSimpleName(), this.name, this.grade, this.hasDrivingLicense);
		
	}

}
