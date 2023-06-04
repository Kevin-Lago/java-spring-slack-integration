package com.kevinlago.slackintegration.model.block;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kevinlago.slackintegration.model.text.SlackText;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SlackHeaderBlock extends SlackBlock {
    private SlackText text;

    public SlackHeaderBlock(SlackText text) {
        super(Type.HEADER);
        this.text = text;
    }

    public SlackText getText() {
        return text;
    }

    public void setText(SlackText text) {
        this.text = text;
    }
}
