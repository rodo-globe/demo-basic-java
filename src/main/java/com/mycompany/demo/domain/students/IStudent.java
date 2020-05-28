package com.mycompany.demo.domain.students;

import com.mycompany.demo.domain.IPerson;


/**
 * Interface can extend another interface
 * 
 * @author rodo
 *
 */
public interface IStudent extends IPerson {

	String getGrade();
}
