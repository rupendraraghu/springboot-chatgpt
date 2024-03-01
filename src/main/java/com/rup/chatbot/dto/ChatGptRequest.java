package com.rup.chatbot.dto;

import java.util.ArrayList;
import java.util.List;

public class ChatGptRequest {

	private String model;
	private List<ChatGptMessage> messages;

	public ChatGptRequest() {
		// TODO Auto-generated constructor stub
	}

	public ChatGptRequest(String model, String prompt) {
		this.model = model;
		this.messages = new ArrayList<>();
		this.messages.add(new ChatGptMessage("user", prompt));
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public List<ChatGptMessage> getMessages() {
		return messages;
	}

	public void setMessages(List<ChatGptMessage> messages) {
		this.messages = messages;
	}

}
