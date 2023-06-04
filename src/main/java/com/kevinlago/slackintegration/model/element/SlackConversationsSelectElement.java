package com.kevinlago.slackintegration.model.element;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.kevinlago.slackintegration.model.text.SlackText;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SlackConversationsSelectElement extends SlackElement {
    @JsonProperty("placeholder")
    private SlackText placeHolder;
    @JsonProperty("action_id")
    private String actionId;

    public SlackConversationsSelectElement(SlackText placeHolder, String actionId) {
        super(Type.CONVERSATIONS_SELECT);
        this.placeHolder = placeHolder;
        this.actionId = actionId;
    }

    public SlackText getPlaceHolder() {
        return placeHolder;
    }

    public void setPlaceHolder(SlackText placeHolder) {
        this.placeHolder = placeHolder;
    }

    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }
}
