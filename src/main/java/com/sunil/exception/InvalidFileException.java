package com.sunil.exception;

public class InvalidFileException  extends RuntimeException

{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String message;

public InvalidFileException(String message) {
	
	this.setMessage(message);
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}


}