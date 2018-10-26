package com.company.app.api.project;

import com.company.domain.project.Project;

import java.time.Instant;
import java.util.List;

public interface ProjectRepo {

    void save(Project project);

    List<Project> findAll();

    List<Project> findAllStartedProjectsWithDateMoreThan(Instant date);

    List<Project> findAllFinishedProjectsToDate(Instant date);

    Project findProjectByName(String name);

    Project findProjectByUUID(String uuid);

    void update(Project project);
}
