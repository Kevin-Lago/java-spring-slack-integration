package com.kevinlago.slackintegration.model.element;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kevinlago.slackintegration.model.element.options.SlackOption;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SlackCheckBoxesElement extends SlackElement {
    private List<SlackOption> options;

    public SlackCheckBoxesElement(List<SlackOption> options) {
        super(Type.CHECKBOXES);
        this.options = options;
    }

    public List<SlackOption> getOptions() {
        return options;
    }

    public void setOptions(List<SlackOption> options) {
        this.options = options;
    }

    public void addOption(SlackOption option) {
        if (this.options == null) this.options = new ArrayList<>();
        options.add(option);
    }
}
