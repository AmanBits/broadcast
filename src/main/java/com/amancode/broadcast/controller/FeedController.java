package com.amancode.broadcast.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.amancode.broadcast.model.NewsFeed;

@Controller
public class FeedController {


    @MessageMapping("/post")
    @SendTo("/newsfeed/people")
    public NewsFeed spreadFeed(NewsFeed newsFeed) {
        return newsFeed;
    }

}
