package com.example.myshopmicroserviceusers.exceptionHandler;

import java.util.Date;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiError {
	
	private int errorcode;
	private String errorDesc;
	private Date date;

}
