package com.company.domain.file;

import com.company.domain.user.User;

public class File {

    private int id;
    private String content;
    private User user;

    public File(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public File(int id, String content, User user) {
        this.id = id;
        this.content = content;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
