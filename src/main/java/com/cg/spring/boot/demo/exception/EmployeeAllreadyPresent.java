package com.cg.spring.boot.demo.exception;

public class EmployeeAllreadyPresent extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public EmployeeAllreadyPresent(String message) {
		super(message);
	}

	

}
