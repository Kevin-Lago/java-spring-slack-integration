package com.kevinlago.slackintegration.model.blocks;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kevinlago.slackintegration.model.accessories.SlackAccessory;
import com.kevinlago.slackintegration.model.text.SlackText;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SlackSectionBlock extends SlackBlock {
    private SlackText text;
    private SlackAccessory accessory;

    public SlackSectionBlock(SlackText text) {
        super(Type.SECTION);
        this.text = text;
    }

    public SlackSectionBlock(SlackText text, SlackAccessory accessory) {
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

    public SlackAccessory getAccessory() {
        return accessory;
    }

    public void setAccessory(SlackAccessory accessory) {
        this.accessory = accessory;
    }
}
