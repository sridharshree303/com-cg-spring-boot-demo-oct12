package com.cg.spring.boot.demo.Exception;

public class EmployeeAlreadyExistsException extends Exception {

	private static final long serialVersionUID = 1L;

	public EmployeeAlreadyExistsException() {
		super();
	}

	public EmployeeAlreadyExistsException(String message) {
		super(message);

	}
}
