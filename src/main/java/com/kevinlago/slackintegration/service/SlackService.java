package com.kevinlago.slackintegration.service;

import com.kevinlago.slackintegration.model.SlackMessage;
import com.kevinlago.slackintegration.model.blocks.SlackDividerBlock;
import com.kevinlago.slackintegration.model.blocks.SlackImageBlock;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import static com.kevinlago.slackintegration.config.Settings.slackApp;

@Service
public class SlackService {
    public SlackMessage sendMessage(String webHook, String message) {
        SlackMessage slackMessage = new SlackMessage();
        slackMessage.setText(message);
        slackMessage.addBlock(new SlackImageBlock("https://www.shutterstock.com/image-vector/hand-drawn-female-hands-w-600w-1054445126.jpg", "poop"));

        slackApp.sendMessageToWebHook(webHook, slackMessage);
        return slackMessage;
    }

    public void sendImage(MultipartFile multipartFile) {
        SlackMessage slackMessage = new SlackMessage();

    }
}
