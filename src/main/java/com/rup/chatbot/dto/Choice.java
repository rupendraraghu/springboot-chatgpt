package com.rup.chatbot.dto;

public class Choice {

	private int index;
	private ChatGptMessage message;

	public Choice() {
		// TODO Auto-generated constructor stub
	}

	public Choice(int index, ChatGptMessage message) {
		super();
		this.index = index;
		this.message = message;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public ChatGptMessage getMessage() {
		return message;
	}

	public void setMessage(ChatGptMessage message) {
		this.message = message;
	}

}
