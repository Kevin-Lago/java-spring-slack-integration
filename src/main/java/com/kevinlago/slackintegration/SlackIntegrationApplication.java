package com.kevinlago.slackintegration;

import com.kevinlago.slackintegration.config.Settings;
import com.slack.api.bolt.App;
import com.slack.api.bolt.AppConfig;
import com.slack.api.bolt.socket_mode.SocketModeApp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SlackIntegrationApplication {

    public static void main(String[] args) throws Exception {
        AppConfig config = AppConfig.builder()
                .clientId(Settings.SLACK_APP_TOKEN)
                .signingSecret(Settings.SLACK_SIGNING_SECRET)
                .singleTeamBotToken(Settings.SLACK_BOT_TOKEN)
                .build();

        App app = new App(config);

        app.command("/test", (req, ctx) -> {
            return ctx.ack("test");
        });

        new SocketModeApp(app).start();
        SpringApplication.run(SlackIntegrationApplication.class, args);
    }

}
