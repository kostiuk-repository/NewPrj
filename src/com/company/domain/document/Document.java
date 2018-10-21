package com.company.domain.document;

public class Document {

    private int id;
    private String owner;
    private String content;

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", owner='" + owner + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public Document(int id, String owner, String content) {
        this.id = id;
        this.owner = owner;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
