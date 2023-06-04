package com.kevinlago.slackintegration.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kevinlago.slackintegration.model.blocks.SlackBlock;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SlackMessage {
    private String text;
    private List<SlackBlock> blocks;

    public SlackMessage() {

    }

    public SlackMessage(String text) {
        this.text = text;
    }

    public SlackMessage(String text, List<SlackBlock> blocks) {
        this.text = text;
        this.blocks = blocks;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<SlackBlock> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<SlackBlock> blocks) {
        this.blocks = blocks;
    }

    public void addBlock(SlackBlock block) {
        if (this.blocks == null) this.blocks = new ArrayList<>();
        this.blocks.add(block);
    }
}
