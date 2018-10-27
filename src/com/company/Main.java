package com.company;

import com.company.app.api.project.ProjectRepo;
import com.company.app.core.project.ProjectRepoFromDisc;
import com.company.domain.project.Project;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        ProjectRepo projectRepo = new ProjectRepoFromDisc();

        Project project1 = new Project("some_project-1",
            LocalDate.of(2018,9,15).atStartOfDay(ZoneId.of("Europe/Paris")).toInstant(),
            LocalDate.of(2018,11,15).atStartOfDay(ZoneId.of("Europe/Paris")).toInstant());
        Project project2 = new Project("some_project-2",
            LocalDate.of(2019,9,15).atStartOfDay(ZoneId.of("Europe/Paris")).toInstant(),
            LocalDate.of(2020,11,15).atStartOfDay(ZoneId.of("Europe/Paris")).toInstant());
        Project project3 = new Project("some_project-3",
            LocalDate.of(2019,9,15).atStartOfDay(ZoneId.of("Europe/Paris")).toInstant(),
            LocalDate.of(2020,11,15).atStartOfDay(ZoneId.of("Europe/Paris")).toInstant());

        project1.setUuid(UUID.randomUUID().toString());
        project2.setUuid(UUID.randomUUID().toString());
        project3.setUuid(UUID.randomUUID().toString());

        projectRepo.save(project1);
        projectRepo.save(project2);
        projectRepo.save(project3);

        for(Project project : projectRepo.findAll()){
            System.out.println(project);
        }

    }
}
