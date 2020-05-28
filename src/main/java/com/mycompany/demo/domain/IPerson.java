package com.mycompany.demo.domain;


/**
 * Interface example
 * 
 * @author rodo
 *
 */

@FunctionalInterface
public interface IPerson {

	String getName();
	
	default String reverseName() {
				
		return new StringBuilder(getName()).reverse().toString();
	}
	
}
