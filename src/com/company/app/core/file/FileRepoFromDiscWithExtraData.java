package com.company.app.core.file;

import com.company.app.api.file.NewFileRepo;
import com.company.domain.file.File;
import com.company.domain.user.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileRepoFromDiscWithExtraData implements NewFileRepo {

    List<File> files = new ArrayList<>();

    @Override
    public void save(File file) {
        long count = files.stream()
            .filter(f -> f.getId() == file.getId())
            .count();
        if(count == 0){
            files.add(file);
        } else {
            throw new IllegalArgumentException("file with id = " + file.getId() +" already exist");
        }
    }

    @Override
    public File findFileById(int id)  {
        return files.stream()
            .filter(file -> file.getId() == id)
            .findFirst().get();
    }

    @Override
    public List<File> findAll() {
        return files;
    }

    @Override
    public void update(File file) {
        files.stream()
            .filter(f -> f.getId() == file.getId())
            .forEach(fl -> {
                fl.setId(file.getId());
                fl.setContent(file.getContent());
                fl.setUser(file.getUser());
            });
    }

    @Override
    public List<File> findUserFiles(User user) {
        List<File> userFiles = files.stream()
            .filter(file -> file.getUser().equals(user))
            .collect(Collectors.toList());
        if(userFiles.size() > 0){
            return userFiles;
        } else {
            throw new IllegalArgumentException("No files find for user = " + user);
        }
    }
}
