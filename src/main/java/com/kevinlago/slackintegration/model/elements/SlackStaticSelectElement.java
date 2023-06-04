package com.kevinlago.slackintegration.model.elements;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.kevinlago.slackintegration.model.text.SlackText;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SlackStaticSelectElement extends SlackElement {
    @JsonProperty("placeholder")
    private SlackText placeHolder;
    private List<Option> options;
    @JsonProperty("action_id")
    private String actionId;

    public SlackStaticSelectElement(SlackText placeHolder, List<Option> options, String actionId) {
        super(Type.STATIC_SELECT);
        this.placeHolder = placeHolder;
        this.options = options;
        this.actionId = actionId;
    }

    public class Option {
        private SlackText text;
        private String value;

        public Option(SlackText text, String value) {
            this.text = text;
            this.value = value;
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
    }

    public SlackText getPlaceHolder() {
        return placeHolder;
    }

    public void setPlaceHolder(SlackText placeHolder) {
        this.placeHolder = placeHolder;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }
}
