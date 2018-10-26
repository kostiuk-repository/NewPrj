package com.company.domain.project;

import java.time.Instant;

public class Project {
    private String name;

    private Instant dateOfStart;
    private Instant dateOfFinish;
    public Project(String name, Instant dateOfStart, Instant dateOfFinish) {
        this.name = name;
        this.dateOfStart = dateOfStart;
        this.dateOfFinish = dateOfFinish;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(Instant dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public Instant getDateOfFinish() {
        return dateOfFinish;
    }

    public void setDateOfFinish(Instant dateOfFinish) {
        this.dateOfFinish = dateOfFinish;
    }

    @Override
    public String toString() {
        return "Project{" +
            "name='" + name + '\'' +
            ", dateOfStart=" + dateOfStart +
            ", dateOfFinish=" + dateOfFinish +
            '}';
    }
}
