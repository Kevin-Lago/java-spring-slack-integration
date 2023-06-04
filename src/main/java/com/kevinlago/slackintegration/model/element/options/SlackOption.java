package com.kevinlago.slackintegration.model.element.options;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kevinlago.slackintegration.model.text.SlackText;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SlackOption {
    private SlackText text;
    private String value;
    private SlackText description;

    public SlackOption(SlackText text, String value, SlackText description) {
        this.text = text;
        this.value = value;
        this.description = description;
    }

    public SlackText getText() {
        return text;
    }

    public void setText(SlackText text) {
        this.text = text;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public SlackText getDescription() {
        return description;
    }

    public void setDescription(SlackText description) {
        this.description = description;
    }
}
