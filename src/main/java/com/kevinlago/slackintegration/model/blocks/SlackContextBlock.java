package com.kevinlago.slackintegration.model.blocks;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kevinlago.slackintegration.model.elements.SlackElement;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SlackContextBlock extends SlackBlock {
    private List<SlackElement> elements;

    public SlackContextBlock(List<SlackElement> elements) {
        super(Type.CONTEXT);
        this.elements = elements;
    }

    public List<SlackElement> getElements() {
        return elements;
    }

    public void setElements(List<SlackElement> elements) {
        this.elements = elements;
    }
}
