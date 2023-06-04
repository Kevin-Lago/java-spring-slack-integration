package com.kevinlago.slackintegration.slack;

import com.google.gson.JsonObject;
import com.kevinlago.slackintegration.config.Settings;
import com.kevinlago.slackintegration.model.SlackMessage;
import com.kevinlago.slackintegration.model.block.SlackDividerBlock;
import com.kevinlago.slackintegration.model.block.SlackSectionBlock;
import com.kevinlago.slackintegration.model.text.SlackPlainText;
import com.kevinlago.slackintegration.model.text.SlackText;
import com.slack.api.Slack;
import com.slack.api.bolt.App;
import com.slack.api.bolt.AppConfig;
import com.slack.api.bolt.socket_mode.SocketModeApp;
import com.slack.api.methods.MethodsClient;
import com.slack.api.methods.SlackApiException;
import com.slack.api.methods.request.admin.emoji.AdminEmojiAddRequest;
import com.slack.api.methods.request.chat.ChatPostMessageRequest;
import com.slack.api.model.block.LayoutBlock;
import com.slack.api.model.block.element.BlockElement;
import com.slack.api.webhook.WebhookResponse;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.kevinlago.slackintegration.config.Settings.restTemplate;
import static com.kevinlago.slackintegration.config.Settings.mapper;

public class SlackApp {
    private static final Logger logger = Logger.getLogger(SlackApp.class.getName());
    private static Slack slack = Slack.getInstance();
//    private static MethodsClient methods;

    @Bean
    public App slackApp() {
        AppConfig config = AppConfig.builder()
                .signingSecret(Settings.SLACK_SIGNING_SECRET)
                .singleTeamBotToken(Settings.SLACK_BOT_TOKEN)
                .build();

        App app = new App(config);
        try {
            SocketModeApp socketModeApp = new SocketModeApp(app);
        } catch (Exception e) {
            System.out.println("failed to start socket");
        }

        app.command("/test", (req, ctx) -> {
            return ctx.ack("test");
        });

        return app;
    }

    public SlackApp() {
        Slack slack = Slack.getInstance();
        MethodsClient methods = slack.methods("xoxb-4431551436644-5369046222355-bMyqV7sBt2FPE2rHDlUJZeP4");

//        if (Settings.socketMode) {
//            try {
//                slack.socketMode("xoxb-4431551436644-5369046222355-bMyqV7sBt2FPE2rHDlUJZeP4");
//            } catch (IOException e) {
//                logger.log(Level.SEVERE, "Failed to connect to socket");
//            }
//        }

        SlackMessage slackMessage = new SlackMessage();
        slackMessage.addBlock(new SlackDividerBlock());
        slackMessage.addBlock(new SlackSectionBlock(
                new SlackPlainText("blah blha"))
        );
//        ChatPostMessageRequest request = ChatPostMessageRequest.builder().channel("#random").blocks().text("test").build();
//        try {
//            methods.chatPostMessage(request);
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        } catch (SlackApiException e) {
//            System.out.println(e.getMessage());
//        }
    }

    public WebhookResponse sendMessageToWebHook(String webHook, SlackMessage message) {
        try {
            return slack.send(webHook, mapper.writeValueAsString(message));
        } catch (Exception e) {
            logger.log(Level.WARNING, "Couldn't send slack message: " + e.getMessage());
            return null;
        }
    }
}
