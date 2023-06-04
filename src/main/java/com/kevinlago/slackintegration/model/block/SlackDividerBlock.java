package com.kevinlago.slackintegration.model.block;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SlackDividerBlock extends SlackBlock {
    public SlackDividerBlock() {
        super(Type.DIVIDER);
    }
}
