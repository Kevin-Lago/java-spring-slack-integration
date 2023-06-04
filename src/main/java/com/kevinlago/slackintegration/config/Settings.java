package com.kevinlago.slackintegration.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kevinlago.slackintegration.slack.SlackApp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Settings {
    public static SlackApp slackApp = new SlackApp();
    public static final RestTemplate restTemplate = new RestTemplate();
    public static ObjectMapper mapper = new ObjectMapper();

    @Bean
    public SlackApp slackApp() {
        return new SlackApp();
    }
}
