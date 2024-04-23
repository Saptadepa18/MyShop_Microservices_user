package com.example.myshopmicroserviceusers.exception;

public class NoUserFoundException extends RuntimeException{
	
	public NoUserFoundException(String msg)
	{
		super(msg);
	}
}
