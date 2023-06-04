package com.kevinlago.slackintegration.model.text;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SlackText {
    @JsonManagedReference
    private String type;

    public SlackText(Type type) {
        this.type = type.toString();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public enum Type {
        MRKDWN,
        PLAIN_TEXT;

        @Override
        public String toString() {
            return this.name().toLowerCase();
        }
    }
}
