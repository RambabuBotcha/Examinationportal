package com.exam.questions;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
@Transactional
public interface QuestionDao extends CrudRepository<Question, Long>{
	//List<User> findByName(String lastName);
}
