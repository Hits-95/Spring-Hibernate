package com.hql.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Question {

	@Id
	@Column(name = "question_id")
	private int questionId;
	private String question;

	//one to one relationship 
	/*
	 * @OneToOne
	 * 
	 * @JoinColumn(name = "ans_id") 
	 * private Answer answer;
	 */
	
	//one to many relationship
	//que 1 -> ans many
	//@OneToMany //its create new table for primary and forene keys for avoid this use down method
	//EAGER : load all data and default is LAZAY
	@OneToMany(mappedBy = "question", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Answer> answers;
	

	public Question() {
		super();
		// TODO Auto-generated constructor stub
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

	/*
	 * public Answer getAnswer() { return answer; }
	 * 
	 * public void setAnswer(Answer answer) { this.answer = answer; }
	 */

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	

}
