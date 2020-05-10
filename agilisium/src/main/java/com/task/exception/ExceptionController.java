package com.task.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.task.response.CommonResponse;
import com.task.services.MessageByLocaleService;


@ControllerAdvice
public class ExceptionController extends ResponseEntityExceptionHandler{
	
	@Autowired
	MessageByLocaleService localResolver;
	
	@ExceptionHandler(CommonException.class)
	public ResponseEntity<Object> genericException(CommonException res) {
		CommonResponse response = new CommonResponse(res.getResponseCode() != 0 ? res.getResponseCode() : -1, 
													res.getErrorCode() != null ? res.getErrorCode() : "CMNRES", 
													res.getErrorDesc() != null ? res.getErrorDesc() : localResolver.getErrorMessage(res.getErrorCode()));
		return new ResponseEntity<Object>(response, HttpStatus.OK);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> genericException(Exception res) {
		CommonResponse response = new CommonResponse(-1,"CMNRES",localResolver.getErrorMessage("CMNRES")) ;
		return new ResponseEntity<Object>(response, HttpStatus.OK);
	}
}
