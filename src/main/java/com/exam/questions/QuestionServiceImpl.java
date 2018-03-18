package com.exam.questions;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class QuestionServiceImpl implements QuestionService {
	@Autowired
	QuestionDao questionDao;
	@Override
	public List<Question> geQuestions() {
		List<Question> questions = (List<Question>) questionDao.findAll();
		return questions;
	}

	@Override
	public Question getQuestionById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean setQuestion(Question question) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateQuestion(Question question) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteQuestion(Question question) {
		// TODO Auto-generated method stub
		return false;
	}

}
