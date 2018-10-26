package com.company.app.core.project;

import com.company.app.api.project.ProjectRepo;
import com.company.domain.project.Project;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class ProjectRepoFromDisc implements ProjectRepo {

    private List<Project> projectList = new ArrayList<>();

    @Override
    public Project findProjectByUUID(String uuid) {
        return null;
    }

    @Override
    public void update(Project project) {

    }

    @Override
    public void save(Project project) {
        projectList.add(project);
    }

    @Override
    public List<Project> findAll() {
        return projectList;
    }

    @Override
    public List<Project> findAllStartedProjectsWithDateMoreThan(Instant date) {
        return projectList.stream()
            .filter(project -> project.getDateOfStart().isAfter(date))
            .collect(toList());
    }

    @Override
    public List<Project> findAllFinishedProjectsToDate(Instant date) {
        return projectList.stream()
            .filter(project -> project.getDateOfFinish().isBefore(date))
            .collect(toList());
    }


    @Override
    public Project findProjectByName(String name) {
        return projectList.stream()
            .filter(project -> project.getName().equals(name))
            .findFirst().get();
    }
}
