package com.kevinlago.slackintegration.model.accessories;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SlackAccessory {
    @JsonManagedReference
    private String type;

    public SlackAccessory(Type type) {
        this.type = type.toString();
    }

    public enum Type {
        MULTI_CONVERSATIONS_SELECT,
        TEST;

        @Override
        public String toString() {
            return this.name().toLowerCase();
        }
    }
}
