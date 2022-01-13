package com.bankui.beans;

import org.springframework.stereotype.Component;

@Component
public class Help {
	private Long id;
	private String question;
	private String answer;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}
	
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Help [id=" + id + ", question=" + question + ", answer=" + answer + "]";
	}
	
	
}
