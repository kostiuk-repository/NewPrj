package com.company.domain.project;

import java.time.Instant;
import java.util.Objects;

public class Project {

    private String uuid;
    private String name;
    private Instant dateOfStart;
    private Instant dateOfFinish;

    public Project(String name, Instant dateOfStart, Instant dateOfFinish) {
        this.name = name;
        this.dateOfStart = dateOfStart;
        this.dateOfFinish = dateOfFinish;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Project)) return false;
        Project project = (Project) o;
        return Objects.equals(getUuid(), project.getUuid()) &&
            Objects.equals(getName(), project.getName()) &&
            Objects.equals(getDateOfStart(), project.getDateOfStart()) &&
            Objects.equals(getDateOfFinish(), project.getDateOfFinish());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUuid(), getName(), getDateOfStart(), getDateOfFinish());
    }

    @Override
    public String toString() {
        return "Project{" +
            "uuid='" + uuid + '\'' +
            ", name='" + name + '\'' +
            ", dateOfStart=" + dateOfStart +
            ", dateOfFinish=" + dateOfFinish +
            '}';
    }
}
