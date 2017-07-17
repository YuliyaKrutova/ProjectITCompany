package com.krutova.itcompany.exception;

public class CompanyException extends Exception {

	private static final long serialVersionUID = 7561160771445470955L;

	public CompanyException() {
	}
	
	public CompanyException(String message, Throwable cause) {
		super(message, cause);
	}

	public CompanyException(String message) {
		super(message);
	}

	public CompanyException(Throwable cause) {
		super(cause);
	}
}
