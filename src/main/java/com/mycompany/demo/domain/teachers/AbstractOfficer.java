package com.mycompany.demo.domain.teachers;

import com.mycompany.demo.domain.IPerson;

/**
 * Abstract class example implementing interface.
 *  
 * @author rodo
 *
 */
public abstract class AbstractOfficer implements IPerson {

	/**
	 * This field is accessible from child classes
	 */
	protected String name;
	
	/**
	 * Abstract member example
	 * @return
	 */
	public abstract String getInstitution();
	
	/**
	 * Abstract class can define non abstract methods
	 * In this case is IPerson implementation
	 */
	@Override
	public String getName(){	
		
		return name;
	}
}
