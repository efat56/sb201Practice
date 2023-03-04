package com.masai;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	
//	@ExceptionHandler(InvalidRollException.class)
//	public ResponseEntity<String> myHandler(InvalidRollException ie){
//		System.out.println("inside myHandler method...");
//		
//		return new ResponseEntity<String>(ie.getMessage(),HttpStatus.BAD_REQUEST);
//	}
	
	
	// same invalidRollException ki jgh Exception class likhna hai jo all exception ko handle kr ske but dusra method bnake....
	
	
	@ExceptionHandler(InvalidRollException.class)
	public ResponseEntity<MyErrorDetails> myHandler(InvalidRollException ie, WebRequest req){
		
		MyErrorDetails me = new MyErrorDetails();
		me.setTimestamp(LocalDateTime.now());
		me.setMessage(ie.getMessage());
		me.setDetails(req.getDescription(false));
		
		
		return new ResponseEntity<MyErrorDetails>(me,HttpStatus.BAD_REQUEST);
	}
	

	// same invalidRollException ki jgh Exception class likhna hai jo all exception ko handle kr ske but dusra method bnake....
	// exception ke liye bhi myError Details create kr skte h same...

}
