package com.sunil.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@ControllerAdvice
@RestControllerAdvice
public class ExceptionHandler1 {
	@ExceptionHandler
	//@ResponseBody
	public String handle(InvalidFileException exception) {
		return exception.getMessage();
	}

}
