package com.example.demo.service;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;
import org.springframework.stereotype.Service;

@Service
public class Geminiservice {

    private final Client client;

    public Geminiservice(Client client) {
        this.client = client;
    }

    public String askGemini(String prompt) {
        GenerateContentResponse response =
                client.models.generateContent(
                        "gemini-2.5-flash", prompt, null
                );

        return response.text();
    }
}
