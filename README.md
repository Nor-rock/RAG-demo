# RAG-demo
simple RAG system built with Spring Boot that retrieves relevant documents and generates answers using an LLM.

Features
---------------------------
- REST API for asking question
-  Keyword-based document retrieval
- Context-aware answer generation using LLM
- Clean modular architecture (controller + service)


Example Request
---------------------------
POST /api/ask

{
  "question": "What is RAG?"
}


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
