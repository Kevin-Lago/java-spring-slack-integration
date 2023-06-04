package com.kevinlago.slackintegration.model.elements;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SlackElement {
    @JsonManagedReference
    private String type;

    public SlackElement(Type type) {
        this.type = type.toString();
    }

    public enum Type {
        CONVERSATIONS_SELECT,
        CHANNELS_SELECT,
        USERS_SELECT,
        STATIC_SELECT,
        BUTTON,
        DATEPICKER,
        CHECKBOXES,
        RADIO_BUTTONS,
        TIMEPICKER;

        @Override
        public String toString() {
            return this.name().toLowerCase();
        }
    }
}
