package com.kevinlago.slackintegration.model.block;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SlackBlock {
    @JsonManagedReference
    private final String type;

    public SlackBlock(Type type) {
        this.type = type.toString();
    }

    public enum Type {
        SECTION,
        ACTIONS,
        DIVIDER,
        IMAGE,
        CONTEXT,
        INPUT,
        HEADER;

        @Override
        public String toString() {
            return this.name().toLowerCase();
        }
    }
}
