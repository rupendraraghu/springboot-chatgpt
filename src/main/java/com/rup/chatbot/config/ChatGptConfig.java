package com.rup.chatbot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ChatGptConfig {
	
	@Value("${chatgpt.api.key}")
	private String chatbotApiKey;
	
	@Bean
	public RestTemplate restTemplate() {
		RestTemplate restTemplate =  new RestTemplate();
		restTemplate.getInterceptors().add((request, body, execution)-> {
			request.getHeaders().add("Authorization", "Bearer "+chatbotApiKey);
			return execution.execute(request, body);
		});
		return restTemplate;
	}

}
