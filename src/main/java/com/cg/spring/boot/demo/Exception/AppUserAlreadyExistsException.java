package com.cg.spring.boot.demo.Exception;

public class AppUserAlreadyExistsException extends RuntimeException {

	private static final long serialVersionUID = 6488178516786684248L;

	public AppUserAlreadyExistsException() {
		super();
	}

	public AppUserAlreadyExistsException(String message) {
		super(message);
	}

}