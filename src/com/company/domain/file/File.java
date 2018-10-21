package com.company.domain.file;

import com.company.domain.user.User;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "File{" +
            "id=" + id +
            ", content='" + content + '\'' +
            ", user=" + user +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof File)) return false;
        File file = (File) o;
        return getId() == file.getId() &&
            Objects.equals(getContent(), file.getContent()) &&
            Objects.equals(getUser(), file.getUser());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getContent(), getUser());
    }
}
