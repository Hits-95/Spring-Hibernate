package com.hibernate.relation.map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Answer {

	@Id
	@Column(name = "answer_id")
	private int answerId;
	private String answer;

	/*
	 * @OneToOne(mappedBy = "answer") //create colm in quetion table only
	 * //@JoinColumn(name = "que_id") 
	 * private Question question;
	 */
	
	//many ans -> 1 Que
	@ManyToOne
	@JoinColumn(name = "question_id")
	private Question question;
	
	
	
	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Answer(int answerId, String answer, Question question) {
		super();
		this.answerId = answerId;
		this.answer = answer;
		this.question = question;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Answer [answerId=" + answerId + ", answer=" + answer +"]";
	}
	
}
