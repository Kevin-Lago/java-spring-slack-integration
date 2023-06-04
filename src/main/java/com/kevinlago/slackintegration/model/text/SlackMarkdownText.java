package com.kevinlago.slackintegration.model.text;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SlackMarkdownText extends SlackText {
    private String text;

    public SlackMarkdownText(String text) {
        super(Type.MRKDWN);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
