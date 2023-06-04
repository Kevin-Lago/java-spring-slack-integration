package com.kevinlago.slackintegration.exception;

import java.util.logging.Logger;

public class SlackException extends RuntimeException {
    private static final Logger logger = Logger.getLogger(SlackException.class.getName());
    private Object object;
    private Throwable throwable;

    public SlackException(String message) {
        super(message);
    }

    public SlackException(String message, Object object, Throwable throwable) {
        super(message);
        this.object = object;
        this.throwable = throwable;
    }

//    public void sendMessageToSlack(String webHook) {
//        slackApp.sendMessageToWebHook(webHook, this.getMessage());
//    }
//
//    public void sendPayloadToSlack(String webHook) {
//        try {
//            slackApp.sendMessageToWebHook(webHook, this.getMessage() + "\n" + mapper.writerWithDefaultPrettyPrinter().writeValueAsString(this.throwable.getStackTrace()));
//        } catch (JsonProcessingException e) {
//            logger.log(Level.WARNING, "Couldn't parse stack trace: " + e.getMessage());
//        }
//    }
}
