package com.exam.questions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class QuestionController {
	@Autowired
	QuestionServiceImpl questionservice;
	@GetMapping(path = "/question/find", produces = "application/json")
	public ResponseEntity<Object> findQuestions(){
		try {
		return new ResponseEntity<Object>(questionservice.geQuestions(),HttpStatus.OK);
		}catch(Exception ex){
			return new ResponseEntity<>("Failed to find User"+ex.toString(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

}
