package com.exam.questions;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public interface QuestionService {
	public List<Question> geQuestions();
	public Question getQuestionById(Integer id);
	public boolean setQuestion(Question question);
	public boolean updateQuestion(Question question);
	public boolean deleteQuestion(Question question);
	
}
