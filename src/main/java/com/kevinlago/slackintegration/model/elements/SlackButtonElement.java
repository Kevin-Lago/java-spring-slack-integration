package com.kevinlago.slackintegration.model.elements;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.kevinlago.slackintegration.model.text.SlackText;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SlackButtonElement extends SlackElement {
    private SlackText text;
    private String value;
    @JsonProperty("action_id")
    private String actionId;

    public SlackButtonElement(SlackText text, String value, String actionId) {
        super(Type.BUTTON);
        this.text = text;
        this.value = value;
        this.actionId = actionId;
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

    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }
}
