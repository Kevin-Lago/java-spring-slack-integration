package com.kevinlago.slackintegration.model.text;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SlackPlainText extends SlackText {
    private String text;

    public SlackPlainText(String text) {
        super(Type.PLAIN_TEXT);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
