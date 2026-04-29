package com.example.rag.controller;

import com.example.rag.service.RagService;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class AskController {

    private final RagService ragService;

    public AskController(RagService ragService) {
        this.ragService = ragService;
    }

    @PostMapping("/ask")
    public Map<String, String> ask(@RequestBody Map<String, String> request) throws IOException {
        String question = request.get("question");
        String answer = ragService.ask(question);

        return Map.of(
                "question", question,
                "answer", answer
        );
    }
}