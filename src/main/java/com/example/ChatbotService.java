package com.example;

import com.example.model.ChatMessage;
import org.springframework.stereotype.Service;
import jakarta.annotation.PostConstruct;
import java.util.*;

@Service
public class ChatbotService {
    private Map<String, String> qaPairs;

    @PostConstruct
    public void init() {
        qaPairs = new HashMap<>();
        qaPairs.put("hello", "Hi there! How can I assist you today?");
        qaPairs.put("hi", "Hello! What can I do for you?");
        qaPairs.put("how are you", "I'm just a chatbot, but I'm functioning well. Thanks for asking!");
        qaPairs.put("what is your name", "I'm SUKKU AI, your intelligent assistant!");
        qaPairs.put("exit", "Goodbye! Feel free to come back later.");
        qaPairs.put("what's the weather", "I'm a text chatbot, but you can check weather apps for real-time data!");
        qaPairs.put("tell me a joke", "Why don't scientists trust atoms? Because they make up everything!");
    }

    public ChatMessage generateResponse(String input) {
        String response = qaPairs.getOrDefault(input.toLowerCase(), "I didn't understand that. Can you rephrase?");
        return new ChatMessage("bot", response + " 🙂", "neutral");
    }
    
    public List<String> getSuggestedQuestions() {
        return Arrays.asList(
            "What can you do?",
            "Tell me a joke",
            "How are you?",
            "What's your name?"
        );
    }
}
