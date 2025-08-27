package com.example;

import com.example.model.ChatMessage;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/chat")
public class ChatbotController {
    private final ChatbotService chatbot;

    public ChatbotController(ChatbotService chatbot) {
        this.chatbot = chatbot;
    }

    @PostMapping
    public ChatMessage chat(@RequestBody ChatRequest request) {
        return chatbot.generateResponse(request.getMessage());
    }
    
    @GetMapping("/suggestions")
    public List<String> getSuggestions() {
        return chatbot.getSuggestedQuestions();
    }

    public static class ChatRequest {
        private String message;
        public String getMessage() { return message; }
        public void setMessage(String message) { this.message = message; }
    }
}

