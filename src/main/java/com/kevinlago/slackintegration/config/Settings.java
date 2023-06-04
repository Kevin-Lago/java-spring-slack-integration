package com.kevinlago.slackintegration.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kevinlago.slackintegration.slack.SlackApp;
import com.kevinlago.slackintegration.slack.SlackBot;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Settings {
    public static final String SLACK_BOT_TOKEN = "xoxb-4431551436644-5369046222355-bMyqV7sBt2FPE2rHDlUJZeP4";
    public static final String SLACK_SIGNING_SECRET = "efcf4d54934cac432e74b2b3ef951f03";
    public static final String SLACK_APP_TOKEN = "xapp-1-A04DAPFDZ8Q-5393278366592-b612d0957e13bb6fcd1a445389758df292948d2c203cfef26ee14abd5cbabd8c";
    public static final Boolean socketMode = true;
    public static final SlackApp slackApp = new SlackApp();
    public static final SlackBot slackBot = new SlackBot();
    public static final RestTemplate restTemplate = new RestTemplate();
    public static final ObjectMapper mapper = new ObjectMapper();

//    @Bean
//    public SlackApp slackApp() {
//        return new SlackApp();
//    }
}
