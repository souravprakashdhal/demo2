package com.example.exception;

import java.util.Date;

public class ExceptionResponse  {
	
	private Date timestamp;
	private String message;
	private String httpStatus;
	
	public ExceptionResponse(Date timestamp, String message,String httpStatus) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.httpStatus=httpStatus;
	}
	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}
 
	public String gethttpStatus()
	{
		return httpStatus;
		
	}

}
