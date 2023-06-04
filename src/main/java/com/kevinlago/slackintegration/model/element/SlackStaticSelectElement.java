package com.kevinlago.slackintegration.model.element;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.kevinlago.slackintegration.model.element.options.SlackOption;
import com.kevinlago.slackintegration.model.text.SlackText;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SlackStaticSelectElement extends SlackElement {
    @JsonProperty("placeholder")
    private SlackText placeHolder;
    private List<SlackOption> options;
    @JsonProperty("action_id")
    private String actionId;

    public SlackStaticSelectElement(SlackText placeHolder, List<SlackOption> options, String actionId) {
        super(Type.STATIC_SELECT);
        this.placeHolder = placeHolder;
        this.options = options;
        this.actionId = actionId;
    }

    public SlackText getPlaceHolder() {
        return placeHolder;
    }

    public void setPlaceHolder(SlackText placeHolder) {
        this.placeHolder = placeHolder;
    }

    public List<SlackOption> getOptions() {
        return options;
    }

    public void setOptions(List<SlackOption> options) {
        this.options = options;
    }

    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }
}
