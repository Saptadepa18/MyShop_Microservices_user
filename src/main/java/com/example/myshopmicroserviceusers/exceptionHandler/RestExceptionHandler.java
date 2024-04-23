package com.example.myshopmicroserviceusers.exceptionHandler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;


@RestController
@ControllerAdvice
public class RestExceptionHandler {
	
	
	public ResponseEntity<ApiError> handleNoUserException(){
		ApiError err=new ApiError(400,"No User Found",new Date());
		return new ResponseEntity<ApiError>(err,HttpStatus.BAD_REQUEST);
	}


}
