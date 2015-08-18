package com.webonise.dataObject;

import java.util.Set;

public class Question {
	
	private int questionId;
	private String question;
	private Set<Answer> answers;
	
	public Question(){
		
	}
	public Question(String question) {
		super();
		this.question = question;
	}
	
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}

	public Set<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(Set<Answer> answers) {
		this.answers = answers;
	}
}
