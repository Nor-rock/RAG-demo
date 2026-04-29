package com.example.rag.service;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Service
public class RagService {

    private List<String> docs;

    public RagService() throws IOException {
        docs = Files.readAllLines(Paths.get("src/main/resources/docs.txt"));
    }

    // Simple keyword search
    public String retrieve(String query) {
        String bestDoc = "";
        int maxScore = -1;

        for (String doc : docs) {
            int score = 0;
            for (String word : query.toLowerCase().split(" ")) {
                if (doc.toLowerCase().contains(word)) {
                    score++;
                }
            }
            if (score > maxScore) {
                maxScore = score;
                bestDoc = doc;
            }
        }

        return bestDoc;
    }

    // Call LLM API
    public String generateAnswer(String query, String context) throws IOException {
        String prompt = "Answer using the context:\n\n" +
                "Context:\n" + context + "\n\nQuestion:\n" + query;

        // You can plug in any API here (OpenAI-style)
        // For now, return mock response
        return "Mock Answer based on: " + context;
    }

    public String ask(String query) throws IOException {
        String context = retrieve(query);
        return generateAnswer(query, context);
    }
}