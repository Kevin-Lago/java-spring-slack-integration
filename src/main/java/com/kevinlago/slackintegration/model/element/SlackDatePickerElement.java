package com.kevinlago.slackintegration.model.element;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.kevinlago.slackintegration.model.text.SlackText;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SlackDatePickerElement extends SlackElement {
    @JsonProperty("initial_date")
    private String initialDate;
    @JsonProperty("placeholder")
    private SlackText placeHolder;
    @JsonProperty("actionId")
    private String actionId;

    public SlackDatePickerElement(String initialDate, SlackText placeHolder, String actionId) {
        super(Type.DATEPICKER);
        this.initialDate = initialDate;
        this.placeHolder = placeHolder;
        this.actionId = actionId;
    }

    public String getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(String initialDate) {
        this.initialDate = initialDate;
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
