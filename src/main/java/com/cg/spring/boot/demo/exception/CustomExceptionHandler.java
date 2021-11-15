package com.cg.spring.boot.demo.exception;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

	private static final Logger LOG = LoggerFactory.getLogger(CustomExceptionHandler.class);

	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<Object> handleEmployeeNotFoundException() {
		LOG.error("handleEmployeeNotFoundException");
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "This employee is NOT available in the database.");
		return new ResponseEntity<Object>(null, headers, HttpStatus.NOT_FOUND);
	}
//	@ExceptionHandler(EmployeeAllreadyPresent.class)
//	public ResponseEntity<Object> handelEmployeeAllreadyPresent(){
//		LOG.error("handelEmployeeAllreadyPresent");
//		HttpHeaders headers=new HttpHeaders();
//		headers.add("message","This Employee is allready present in the database");
//		return new ResponseEntity<Object>(null,headers,HttpStatus.ALREADY_REPORTED);
//	}
	

//	@ExceptionHandler(SomeOtherException.class)
//	public ResponseEntity<Object> handleSomeOtherException() {
//		// code 
//	}

}