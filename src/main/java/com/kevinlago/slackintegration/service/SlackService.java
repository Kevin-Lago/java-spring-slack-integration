package com.kevinlago.slackintegration.service;

import com.kevinlago.slackintegration.model.SlackMessage;
import com.kevinlago.slackintegration.model.block.SlackImageBlock;
import com.kevinlago.slackintegration.model.element.SlackButtonElement;
import com.kevinlago.slackintegration.model.text.SlackText;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

import static com.kevinlago.slackintegration.config.Settings.slackApp;

@Service
public class SlackService {
    private static final Logger logger = Logger.getLogger(SlackService.class.getName());

    public SlackMessage sendMessage(String webHook, String message) {
        SlackMessage slackMessage = new SlackMessage();
        slackMessage.setText(message);
        slackMessage.addBlock(new SlackImageBlock("https://www.shutterstock.com/image-vector/hand-drawn-female-hands-w-600w-1054445126.jpg", "poop"));

        slackApp.sendMessageToWebHook(webHook, slackMessage);
        return slackMessage;
    }

//    public SlackMessage sendButton(String webHook) {
//        SlackMessage slackMessage = new SlackMessage();
//        slackMessage.addBlock(new SlackButtonElement());
//    }

    public SlackMessage sendImage(String webHook, SlackText title, String imageUrl, String altText) {
        SlackMessage slackMessage = new SlackMessage();
        slackMessage.addBlock(new SlackImageBlock(title, imageUrl, altText));

        slackApp.sendMessageToWebHook(webHook, slackMessage);
        return slackMessage;
    }
}
