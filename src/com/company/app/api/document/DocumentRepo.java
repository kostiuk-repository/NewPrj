package com.company.app.api.document;

import com.company.domain.document.Document;

import java.util.List;

public interface DocumentRepo {

    void update(Document document);

    void save(Document document);

    Document findFileById(int id);

    List<Document> findAll();

    List<Document> findDocumentsByOwner(String owner);
}
