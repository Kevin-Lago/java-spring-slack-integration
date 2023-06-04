package com.kevinlago.slackintegration.model.blocks;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kevinlago.slackintegration.model.elements.SlackElement;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SlackActionsBlock extends SlackBlock {
    private List<SlackElement> elements;

    public SlackActionsBlock(List<SlackElement> elements) {
        super(Type.ACTIONS);
        this.elements = elements;
    }

    public List<SlackElement> getElements() {
        return elements;
    }

    public void setElements(List<SlackElement> elements) {
        this.elements = elements;
    }
}
