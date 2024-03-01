package com.rup.chatbot.dto;

import java.util.List;

public class ChatGptResponse {

	private List<Choice> choices;

	public ChatGptResponse() {
		// TODO Auto-generated constructor stub
	}

	public ChatGptResponse(List<Choice> choices) {
		super();
		this.choices = choices;
	}

	public List<Choice> getChoices() {
		return choices;
	}

	public void setChoices(List<Choice> choices) {
		this.choices = choices;
	}

}
