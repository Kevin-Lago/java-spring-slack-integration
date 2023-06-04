package com.kevinlago.slackintegration.command;

import com.slack.api.bolt.App;

public class TestCommand {
    public TestCommand(App app) {
        app.command("/test", (req, ctx) -> {
            return ctx.ack("test");
        });
    }
}
