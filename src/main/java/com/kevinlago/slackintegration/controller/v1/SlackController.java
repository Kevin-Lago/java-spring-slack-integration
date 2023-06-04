package com.kevinlago.slackintegration.controller.v1;

import com.kevinlago.slackintegration.model.SlackMessage;
import com.kevinlago.slackintegration.model.text.SlackText;
import com.kevinlago.slackintegration.service.SlackService;
import com.slack.api.bolt.App;
import com.slack.api.bolt.servlet.SlackAppServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import javax.servlet.annotation.WebServlet;

@WebServlet("/slack/events")
public class SlackController extends SlackAppServlet {
    @Autowired
    SlackService service;

    public SlackController(App app) {
        super(app);
    }

//    @GetMapping("/message")
//    public ResponseEntity<SlackMessage> sendMessage(
//            @RequestParam(value = "webHook") String webHook,
//            @RequestParam(value = "message") String message
//    ) {
//        try {
//            return new ResponseEntity<>(service.sendMessage(webHook, message), HttpStatus.OK);
//        } catch (Exception e) {
//            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
//
//    @GetMapping("/image")
//    public ResponseEntity<SlackMessage> sendMessage(
//            @RequestParam(value = "webHook") String webHook,
//            @RequestParam(value = "title", required = false) SlackText title,
//            @RequestParam(value = "imageUrl") String imageUrl,
//            @RequestParam(value = "altText") String altText
//    ) {
//        try {
//            return new ResponseEntity<>(service.sendImage(webHook, title, imageUrl, altText), HttpStatus.OK);
//        } catch (Exception e) {
//            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
}
