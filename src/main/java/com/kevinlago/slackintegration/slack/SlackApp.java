package com.kevinlago.slackintegration.slack;

import com.kevinlago.slackintegration.model.SlackMessage;

import java.util.logging.Level;
import java.util.logging.Logger;

import static com.kevinlago.slackintegration.config.Settings.restTemplate;
import static com.kevinlago.slackintegration.config.Settings.slackApp;

public class SlackApp {
    private static final Logger logger = Logger.getLogger(SlackApp.class.getName());

    public SlackApp() {

    }

    public void sendMessageToWebHook(String webHook, SlackMessage message, String ... args) {
        try {
            restTemplate.postForObject(webHook, message, String.class, args);
        } catch (Exception e) {
            logger.log(Level.WARNING, "Couldn't send slack message: " + e.getMessage());
        }
    }
}
