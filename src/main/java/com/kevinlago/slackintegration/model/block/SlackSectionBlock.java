package com.kevinlago.slackintegration.model.block;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kevinlago.slackintegration.model.element.SlackElement;
import com.kevinlago.slackintegration.model.text.SlackText;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SlackSectionBlock extends SlackBlock {
    private SlackText text;
    private SlackElement accessory;

    public SlackSectionBlock(SlackText text) {
        super(Type.SECTION);
        this.text = text;
    }

    public SlackSectionBlock(SlackText text, SlackElement accessory) {
        super(Type.SECTION);
        this.text = text;
        this.accessory = accessory;
    }

    public SlackText getText() {
        return text;
    }

    public void setText(SlackText text) {
        this.text = text;
    }

    public SlackElement getAccessory() {
        return accessory;
    }

    public void setAccessory(SlackElement accessory) {
        this.accessory = accessory;
    }
}
