package com.kevinlago.slackintegration.model.block;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kevinlago.slackintegration.model.element.SlackElement;

import java.util.ArrayList;
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

    public void addElement(SlackElement element) {
        if (this.elements == null) this.elements = new ArrayList<>();
        this.elements.add(element);
    }
}
