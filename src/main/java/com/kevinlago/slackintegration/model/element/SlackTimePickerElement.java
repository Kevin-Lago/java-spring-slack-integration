package com.kevinlago.slackintegration.model.element;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SlackTimePickerElement extends SlackElement {
    @JsonProperty("initial_time")
    private String initialTime;
    @JsonProperty("placeHolder")
    private String placeHolder;
    @JsonProperty("action_id")
    private String actionId;

    public SlackTimePickerElement(String initialTime, String placeHolder, String actionId) {
        super(Type.TIMEPICKER);
        this.initialTime = initialTime;
        this.placeHolder = placeHolder;
        this.actionId = actionId;
    }

    public String getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(String initialTime) {
        this.initialTime = initialTime;
    }

    public String getPlaceHolder() {
        return placeHolder;
    }

    public void setPlaceHolder(String placeHolder) {
        this.placeHolder = placeHolder;
    }

    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }
}
