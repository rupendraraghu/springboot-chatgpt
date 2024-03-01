package com.rup.chatbot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.rup.chatbot.dto.ChatGptRequest;
import com.rup.chatbot.dto.ChatGptResponse;

@RestController
@RequestMapping("chatbot")
public class ChatGptController {
	
	@Value("${chatgpt.model}")
	private String model;
	
	@Value("${chatgpt.api.url}")
	private String apiUrl;
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping
	public String chatbot(@RequestParam("prompt") String prompt) {
		ChatGptRequest chatGptRequest = new ChatGptRequest(model, prompt);
		ChatGptResponse chatGptResponse=  restTemplate.postForObject(apiUrl, chatGptRequest, ChatGptResponse.class);
		return chatGptResponse.getChoices().get(0).getMessage().getContent();
	}
}
