package com.example.entity;

import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility =Visibility.ANY)
@Validated
public class Books {
	
	@Size(max=3, message="Size exceeded")
	protected int id;
	protected String name;
	protected String author;
	
	protected Books() {}
	public Books(int id, String name, String author) {
		
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String toString()
	{
		return String.format("Book [id=%s, name=%s, author=%s]", id, name, author);
	}
	

}
