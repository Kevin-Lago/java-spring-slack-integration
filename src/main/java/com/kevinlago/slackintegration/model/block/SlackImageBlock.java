package com.kevinlago.slackintegration.model.block;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.kevinlago.slackintegration.model.text.SlackText;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SlackImageBlock extends SlackBlock {
    private SlackText title;
    @JsonProperty("image_url")
    private String imageUrl;
    @JsonProperty("alt_text")
    private String altText;

    public SlackImageBlock(String imageUrl, String altText) {
        super(Type.IMAGE);
        this.imageUrl = imageUrl;
        this.altText = altText;
    }

    public SlackImageBlock(SlackText title, String imageUrl, String altText) {
        super(Type.IMAGE);
        this.title = title;
        this.imageUrl = imageUrl;
        this.altText = altText;
    }

    public SlackText getTitle() {
        return title;
    }

    public void setTitle(SlackText title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getAltText() {
        return altText;
    }

    public void setAltText(String altText) {
        this.altText = altText;
    }
}
