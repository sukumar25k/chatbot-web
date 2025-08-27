package com.example.model;

import java.time.LocalDateTime;

public class ChatMessage {
    private String type;
    private String message;
    private String timestamp;
    private String sentiment;

    public ChatMessage() {}

    public ChatMessage(String type, String message, String sentiment) {
        this.type = type;
        this.message = message;
        this.sentiment = sentiment;
        this.timestamp = LocalDateTime.now().toString();
    }

    // Getters and setters
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
    public String getTimestamp() { return timestamp; }
    public void setTimestamp(String timestamp) { this.timestamp = timestamp; }
    public String getSentiment() { return sentiment; }
    public void setSentiment(String sentiment) { this.sentiment = sentiment; }
}
