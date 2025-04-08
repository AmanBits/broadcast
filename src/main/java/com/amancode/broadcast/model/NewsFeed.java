package com.amancode.broadcast.model;



public class NewsFeed {
    private String sender;
    private String content;

    // Constructors
    public NewsFeed() {
    }

    public NewsFeed(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    // Getters
    public String getSender() {
        return sender;
    }

    public String getContent() {
        return content;
    }

    // Setters
    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
