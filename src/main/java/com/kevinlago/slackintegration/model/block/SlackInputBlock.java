package com.kevinlago.slackintegration.model.block;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.kevinlago.slackintegration.model.element.SlackElement;
import com.kevinlago.slackintegration.model.text.SlackText;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SlackInputBlock extends SlackBlock {
    @JsonProperty("dispatch_action")
    private Boolean dispatchAction;
    private List<SlackElement> elements;
    private SlackText label;

    public SlackInputBlock(Boolean dispatchAction, List<SlackElement> elements, SlackText label) {
        super(Type.INPUT);
        this.dispatchAction = dispatchAction;
        this.elements = elements;
        this.label = label;
    }

    public Boolean getDispatchAction() {
        return dispatchAction;
    }

    public void setDispatchAction(Boolean dispatchAction) {
        this.dispatchAction = dispatchAction;
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

    public SlackText getLabel() {
        return label;
    }

    public void setLabel(SlackText label) {
        this.label = label;
    }
}
