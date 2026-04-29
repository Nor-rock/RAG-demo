# RAG-demo
simple RAG system built with Spring Boot that retrieves relevant documents and generates answers using an LLM.

Features
---------------------------
- REST API for asking question
-  Keyword-based document retrieval
- Context-aware answer generation using LLM
- Clean modular architecture (controller + service)

How It Works
---------------------------
1. User submits a question
2. System retrieves relevant document
3. LLM generates answer using context

Future Improvements
---------------------------
- Add embeddings for semantic search
- Support PDFs (Apache Tika)
- Return top-k results
- Add frontend UI

Example Request
--
POST http://localhost:8080/api/ask

Content-Type: application/json

{

  "question": "What is a vector?"
  
}


Example Response
----
{

  "question": "What is a vector?",
  
  "answer": "A vector is a numerical representation of data..."
  
}

Curl Example
---
curl -X POST http://localhost:8080/api/ask \
-H "Content-Type: application/json" \
-d "{\"question\":\"What is a vector?\"}"
