package com.example.demo.Controller;

import com.example.demo.service.Geminiservice;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/gemini")
public class GeminiController {

    private final Geminiservice geminiservice;

    // ✅ Manually added constructor
    public GeminiController(Geminiservice geminiservice) {
        this.geminiservice = geminiservice;
    }

    @PostMapping("/ask")
    public String askGemini(@RequestBody String prompt) {
        return geminiservice.askGemini(prompt);
    }
}
