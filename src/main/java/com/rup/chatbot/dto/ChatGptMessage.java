package com.rup.chatbot.dto;

public class ChatGptMessage {

	private String role;
	private String content;

	public ChatGptMessage() {
		// TODO Auto-generated constructor stub
	}

	public ChatGptMessage(String role, String content) {
		this.role = role;
		this.content = content;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
