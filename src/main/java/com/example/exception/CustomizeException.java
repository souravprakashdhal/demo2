package com.example.exception;

import java.util.Date;

//import org.springframework.boot.web.server.WebServer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomizeException extends ResponseEntityExceptionHandler {
	
	
	@ExceptionHandler(BookNotFoundException.class)
	public final ResponseEntity<Object> handleException(BookNotFoundException bookNotFoundException, WebRequest request)
	{
		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), bookNotFoundException.getMessage(),"resource not found");
		
		return new ResponseEntity<Object>(exceptionResponse,HttpStatus.NOT_FOUND);
		
	}

}
