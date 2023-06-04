package com.kevinlago.slackintegration.slack;

import com.kevinlago.slackintegration.config.Settings;
import com.slack.api.bolt.App;
import com.slack.api.bolt.AppConfig;
import com.slack.api.bolt.socket_mode.SocketModeApp;

import java.io.IOException;

public class SlackBot {
    private static App app;

    public SlackBot() {
//        AppConfig config = AppConfig.builder()
//                .signingSecret(Settings.SLACK_SIGNING_SECRET)
//                .singleTeamBotToken(Settings.SLACK_BOT_TOKEN)
//                .build();
//
//        App app = new App(config);
//
//        app.command("/test", (req, ctx) -> {
//            return ctx.ack("test");
//        });
//
//        try {
//            new SocketModeApp(app).start();
//        } catch (Exception e) {
//            System.out.println("failed to start socket");
//        }
    }
}
