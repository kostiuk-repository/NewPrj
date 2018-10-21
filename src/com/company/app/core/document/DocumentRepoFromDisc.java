package com.company.app.core.document;

import com.company.app.api.document.DocumentRepo;
import com.company.domain.document.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DocumentRepoFromDisc implements DocumentRepo {

    List<Document> documents = new ArrayList<>();

    @Override
    public void update(Document document) {
        documents.stream()
                .filter(d -> d.getId() == document.getId())
                .forEach(doc -> {
                    doc.setOwner(document.getOwner());
                    doc.setContent(document.getContent());
                    doc.setId(document.getId());
                });
    }

    @Override
    public void save(Document document) {
        documents.add(document);
    }

    @Override
    public Document findFileById(int id) {
        return documents.stream()
                .filter(document -> document.getId() == id)
                .findFirst().get();
    }

    @Override
    public List<Document> findAll() {
        return documents;
    }

    @Override
    public List<Document> findDocumentsByOwner(String owner) {
        return documents.stream()
                .filter(document -> document.getOwner().equals(owner))
                .collect(Collectors.toList());
    }
}
