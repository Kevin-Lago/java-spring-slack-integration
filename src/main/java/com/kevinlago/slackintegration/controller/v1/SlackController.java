package com.kevinlago.slackintegration.controller.v1;

import com.kevinlago.slackintegration.model.SlackMessage;
import com.kevinlago.slackintegration.service.SlackService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/v1")
public class SlackController {
    @Autowired
    SlackService service;

    @GetMapping
    public ResponseEntity<SlackMessage> sendMessage(
            @RequestParam("webHook") String webHook,
            @RequestParam("message") String message
    ) {
        try {
            return new ResponseEntity<>(service.sendMessage(webHook, message), HttpStatus.OK);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity sendImage(
            @RequestParam("image") MultipartFile multipartFile
    ) {
        try {
            service.sendImage(multipartFile);
            return new ResponseEntity(HttpStatus.OK);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
